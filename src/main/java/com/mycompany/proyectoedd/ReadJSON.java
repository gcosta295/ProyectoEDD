/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author gabri
 */
public class ReadJSON {

    private String text;
    private String test;

    public ReadJSON() {
    }

    public void abrirArchivo() {
        String aux = "";
        setText("");
        try {
            //El metodo que nos permite abrir la ventana
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            File abre = file.getSelectedFile();
            String fileType = file.getTypeDescription(abre); //tells us what type of file the chosen one is 

            if (fileType.equals("JSON Source File")) { //Validates the JSON file
                if (abre != null) {
                    FileReader archivos = new FileReader(abre);
                    BufferedReader lee = new BufferedReader(archivos);
                    while ((aux = lee.readLine()) != null) {
                        setText(getText() + aux + "\n");
                    }
                    lee.close();
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "\nEl archivo no es JSON, por favor volver a intentar",
                        "ADVERTENCIA!!!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }

    }

    public List Parse() { // en teoria deberia recibir como parametro el grafo, pero falta crearlo
        String jsonString = text;
        List listaLines = new List();
        List listaAllStations = new List();
        try {

            JSONParser parser = new JSONParser(); //creates a json parsser, to parse the json string
            JSONObject metroJson = (JSONObject) parser.parse(jsonString);
            String nombreMetro = (String) metroJson.keySet().iterator().next();
            JSONArray lineasMetro = (JSONArray) metroJson.get(nombreMetro);

            for (Object lineObject : lineasMetro) { //iterates through each metroline of the json
                JSONObject lineJson = (JSONObject) lineObject;

                for (Object lineNameObject : lineJson.keySet()) { //object each medtroline station
                    String lineName = (String) lineNameObject; //transform the metroline name into a string
//                             System.out.println(lineName);
                    Line lineametro = new Line(lineName);
                    listaLines.AddLine(lineametro);
                    List listaStations = lineametro.getStations();
                    System.out.println(lineName);
                    //                   Line metroLine = new Line(lineName); //creates a new metroline, with the name of the line in the JSON
                    JSONArray stationsArray = (JSONArray) lineJson.get(lineName); //creates an array of the metroline we are currently parsing
                    for (Object stationObject : stationsArray) { ///makes each station o the array into an object
                        if (stationObject instanceof JSONObject) { //esto es lo de las estaciones con llaves, me falta arreglarlo

                            JSONObject connection = (JSONObject) stationObject;

                            for (Object stationNameObject : connection.keySet()) {
                                String stationName = (String) stationNameObject;
                                String connectionName = connection.get(stationNameObject).toString();

                                if (listaAllStations.nameInList(connectionName)) { //la lista no es vacia

//                                    System.out.println(stationName);
                                    Station sAux = listaAllStations.getNamedStation(stationName);
//                                    System.out.println(sAux.getsData());

                                    if (listaStations.getSLast() != null) {
                                        Station last = listaStations.getSLast();
                                        last.conect(sAux);
                                        listaStations.AddStation(sAux);

                                    }
                                } else {
                                    Station newStation = new Station(stationName + ":" + connectionName, lineName);
                                    listaStations.AddStation(newStation);
                                    listaAllStations.AddStation(newStation);
                                }
                            }

                        } else {
                            String stationName = (String) stationObject;

                            if (listaAllStations.nameInList(stationName)) {
                                Station sAux = listaAllStations.getNamedStation(stationName);
//                                System.out.println(sAux);
                                listaStations.AddStation(sAux);

                            } else {

                                Station newStation = new Station(stationName, lineName);
//                                System.out.println(stationName);
                                listaAllStations.AddStation(newStation);
                                if (listaStations.getSLast() != null) {

                                    Station last = listaStations.getSLast();
                                    last.conect(newStation);
                                    listaStations.AddStation(newStation);
                                } else {
                                    listaStations.AddStation(newStation);
                                }

                            }
                        }
                    }
                }
            }

        } // Print all stations and their connections
        catch (ParseException e) {

            e.printStackTrace();
        }

//        Line currentL = listaLines.getlFirst();
//        while (currentL != null) {
//            System.out.println(currentL.getLname());
//            Station current = currentL.getStations().getSFirst();
//            while (current != null) {
//                System.out.println("Station: " + current.getsData());
//
//                int c = 1;
//                while (c <= current.getconections().getlen()) {
//                    System.out.println("coneccion: " + current.getconections().getStation(current.getconections(), c).getsData());
//                    c += 1;
//                }
//                current = current.getNext();
//            }
//            currentL = currentL.getlNext();
//        }
        return listaLines;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    public String getTest() {
        return test;
    }

    /**
     * @param text the text to set
     */
    public void setTest(String text) {
        this.text = test;
    }

}
