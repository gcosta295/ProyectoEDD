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
                        setText(getText() + aux+ "\n");
                    }
                    lee.close();
                }
            } else{
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
            String nombreMetro = (String) metroJson.keySet().iterator().next(); //gets the name of the metro system
            JSONArray lineasMetro = (JSONArray) metroJson.get(nombreMetro); //allows me to enter the metro system list of lines

            for (Object lineObject : lineasMetro) { //iterates through each metroline in the array
                JSONObject lineJson = (JSONObject) lineObject;

                for (Object lineNameObject : lineJson.keySet()) { //each metroline is transformed into an object
                    String lineName = (String) lineNameObject; //transform the metroline name into a string

                    Line metroLine = new Line(lineName); //creates a new metroline, with the name of the line in the JSON

                    List listaStations = new List(); // Creates a list of metroline, where the list of stations will be stored
                    // Create graph / here the metroline should be added

                    JSONArray stationsArray = (JSONArray) lineJson.get(lineName); //creates an array of the metroline we are currently parsing

                    for (Object stationObject : stationsArray) { //creates an object of each station in the array, iterating over them
                        if (stationObject instanceof JSONObject) { //esto es lo de las estaciones con llaves, me falta arreglarlo
                            JSONObject connection = (JSONObject) stationObject;
                            for (Object stationNameObject : connection.keySet()) {
                                String stationName = (String) stationNameObject;
                                String connectionName = connection.get(stationNameObject).toString();
//                                System.out.println("  " + stationName + " (Connection: " + connectionName + ")");
                            }
                        } else {
                            String stationName = (String) stationObject; //gets the name of the station
                            Station newStation = new Station(stationName);
                            listaStations.AddStation(newStation); //adds the iterated station into our own list class

                            System.out.println("  " + newStation.getsData());
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
