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
        List listaStations = new List();

        try {

            JSONParser parser = new JSONParser(); //creates a json parsser, to parse the json string
            JSONObject metroJson = (JSONObject) parser.parse(jsonString);
            String nombreMetro = (String) metroJson.keySet().iterator().next();
            JSONArray lineasMetro = (JSONArray) metroJson.get(nombreMetro);

            for (Object lineObject : lineasMetro) { //iterates through each metroline of the json
                JSONObject lineJson = (JSONObject) lineObject;
                
                for (Object lineNameObject : lineJson.keySet()) { //object each medtroline station
                    String lineName = (String) lineNameObject; //transform the metroline name into a string
                    Line lineametro = new Line(lineName);
//                    System.out.println(lineName);
                    //                   Line metroLine = new Line(lineName); //creates a new metroline, with the name of the line in the JSON
                    JSONArray stationsArray = (JSONArray) lineJson.get(lineName); //creates an array of the metroline we are currently parsing
                    for (Object stationObject : stationsArray) { ///makes each station o the array into an object
                        if (stationObject instanceof JSONObject) { //esto es lo de las estaciones con llaves, me falta arreglarlo
                           
                            JSONObject connection = (JSONObject) stationObject;
                            for (Object stationNameObject : connection.keySet()) {
                                String stationName = (String) stationNameObject;
                                String connectionName = connection.get(stationNameObject).toString();

                                if (listaStations.nameInList(stationName)) { //esto es que la {:} estacion ya existe 

                                    if (listaStations.getSLast() != null) {
                                        Station sAux = listaStations.getSLast();
                                        Station oldStation = listaStations.getNamedStation(stationName);
                                        listaStations.AddStation(oldStation);
                                        sAux.getconections().AddStation(oldStation);
                                        oldStation.getconections().AddStation(sAux);

                                    } else {//que la lista es vacia 
                                        Station oldStation = listaStations.getNamedStation(stationName);
                                        listaStations.AddStation(oldStation);

                                    }
                                } else {
                                    //que no este la estacion compuesta en la lista
                                    if (listaStations.getSLast() != null) {
                                        Station newStation = new Station(stationName + ":" + connectionName, lineName);
                                        Station sAux = listaStations.getSLast();
                                        newStation.getconections().AddStation(sAux);
                                        sAux.getconections().AddStation(newStation);
                                        listaStations.AddStation(newStation);

                                    }
                                }

                            }//fin de for

                        } else {
                            //que no esta entre las llaves
                            if (listaStations.getSFirst() != null) {
                                //que la lista no esta vacia

                                String stationName = (String) stationObject; //gets the name of the station
//                                System.out.println(stationName);
                                Station newStation = new Station(stationName, lineName); //e; gpocho ladilla quiere que ponga la linea ok

                                Station sAux = listaStations.getSLast();

                                listaStations.AddStation(newStation);
//                                System.out.println(sAux.getNext().getsData());
                                newStation.getconections().AddStation(sAux);

                                sAux.getconections().AddStation(newStation);


                            } else {
                                String stationName = (String) stationObject; //gets the name of the station
                                Station new2Station = new Station(stationName, lineName);
                                listaStations.AddStation(new2Station);

                            }
                        }
                       
                    }
                }

            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
////        System.out.println(listaStations.getSFirst().getsData());
//        Station test = listaStations.getSFirst();
////        System.out.println(test.getsData());
//        System.out.println(test.getsData());
//        int c = 1;
//        while (c <= test.getconections().getlen()) {
//            System.out.println(test.getconections().getStation(test.getconections(), c).getsData());
//            c += 1;
//        }

//        while (c <= listaStations.getlen()) {
//            System.out.println(test.getsData());
//            test=test.getNext();
//            c += 1;
//        }

//    
//    System.out.println(test.getconections().getSFirst().getsData());
//    
//    System.out.println(test.getconections().getSFirst().getNext().getsData());
    return listaStations;
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
