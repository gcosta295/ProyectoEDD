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

    public void Parse() { // en teoria deberia recibir como parametro el grafo, pero falta crearlo
        String jsonString = text;

        try {
            JSONParser parser = new JSONParser(); //creates a json parsser, to parse the json string
            JSONObject metroJson = (JSONObject) parser.parse(jsonString);
            String nombreMetro = (String) metroJson.keySet().iterator().next();
            JSONArray lineasMetro = (JSONArray) metroJson.get(nombreMetro);
            List listaStations = new List(); // Creates a list of metroline, where the list of stations will be stored
            // Create graph / here the metroline should be added

            for (Object lineObject : lineasMetro) { //iterates through each metroline in the array
                JSONObject lineJson = (JSONObject) lineObject;

                for (Object lineNameObject : lineJson.keySet()) { //each metroline is transformed into an object
                    String lineName = (String) lineNameObject; //transform the metroline name into a string

                    Line metroLine = new Line(lineName); //creates a new metroline, with the name of the line in the JSON

                    JSONArray stationsArray = (JSONArray) lineJson.get(lineName); //creates an array of the metroline we are currently parsing

                    for (Object stationObject : stationsArray) { //creates an object of each station in the array, iterating over them
                        if (stationObject instanceof JSONObject) { //esto es lo de las estaciones con llaves, me falta arreglarlo

                            JSONObject connection = (JSONObject) stationObject;
                            for (Object stationNameObject : connection.keySet()) { //takes the {station1:station2} as an object and allows to access each
                                String stationName = (String) stationNameObject;
                                String connectionName = connection.get(stationNameObject).toString();
                                //System.out.println(stationName);
                                if (listaStations.nameInList(stationName)) { //checks if the stationa already exists
                                    if (listaStations.getSLast() != null) { //if it exists adds it after the last and connects it to the one before
                                        Station sAux = listaStations.getSLast();
                                        sAux.conect(listaStations.getNamedStation(stationName));
                                        listaStations.AddStation(listaStations.getNamedStation(stationName));
                                    } else {
                                        //if it already exists but is the first one in a list
                                        listaStations.AddStation(listaStations.getNamedStation(stationName));
                                    }
                                } else {

                                    if (listaStations.getSLast() != null) {
                                        Station newStation = new Station(stationName + ":" + connectionName);
                                        Station sAux = listaStations.getSLast();
                                        sAux.conect(newStation);
                                        listaStations.AddStation(newStation);

                                    } else {

                                        Station newStation = new Station(stationName + ":" + connectionName);
                                        listaStations.AddStation(newStation);
                                    }
                                }
                            }
                        } else {

                            if (listaStations.getSLast() != null) {

                                String stationName = (String) stationObject; //gets the name of the station
                                Station newStation = new Station(stationName);
                                Station sAux = listaStations.getSLast();
                                sAux.conect(newStation);
                                listaStations.AddStation(newStation); //adds the iterated station into our own list class

                                //.out.println("  " + newStation.getsData());
                            } else {
                                String stationName = (String) stationObject; //gets the name of the station
                                Station newStation = new Station(stationName);
                                listaStations.AddStation(newStation);
                            }
                        }
                    }
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

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
