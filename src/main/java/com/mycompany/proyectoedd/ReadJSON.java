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
 * @author gcosta
 */
public class ReadJSON {

    private String text;

    private boolean valid;

 /**
 * @Description constructor de ReadJSON 
 * @author gcosta
*/
    public ReadJSON() {
    }
/**
 * Description devuelve boolean si el JSON es valido
 * @author gcosta
 * @return valid
*/  
    public boolean isValid() {
        return valid;
    }
/**
 * Description permite abrir un archivo con JFileChooser
 * @author gcosta
*/  
  
    public void abrirArchivo() {
        valid = false;
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
                    valid = true;
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
/**
 * Description permite la lectura del JSON, devuelve el parse completo de las lineas
 * @author gcosta
 * @see ReadJSON()
 * @return List
*/  
  
    public List Parse() { 
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

                    Line lineametro = new Line(lineName);
                    listaLines.AddLine(lineametro);
                    List listaStations = lineametro.getStations();
               Line metroLine = new Line(lineName); //creates a new metroline, with the name of the line in the JSON
                    JSONArray stationsArray = (JSONArray) lineJson.get(lineName); //creates an array of the metroline we are currently parsing
                    for (Object stationObject : stationsArray) { ///makes each station o the array into an object
                        if (stationObject instanceof JSONObject) { //esto es lo de las estaciones con llaves, me falta arreglarlo

                            JSONObject connection = (JSONObject) stationObject;

                            for (Object stationNameObject : connection.keySet()) {
                                String stationName = (String) stationNameObject;
                                String connectionName = connection.get(stationNameObject).toString();

                                if (listaAllStations.nameInList(connectionName)) { //la estacion compuesta existe

//                                    System.out.println(stationName);
                                    for (int j = 1; j < listaLines.getlen(); j++) {
                                        List estaciones = listaLines.getLine(listaLines, j).getStations();
                                        if (estaciones.nameInList(connectionName)) {
                                            Station old = estaciones.getNamedStation(connectionName);
                                            if (listaStations.getsLast() != null) {
                                                Station last = listaStations.getsLast();
                                                last.conect(old);
                                                listaStations.AddStation(old);

                                            } else {
                                                listaStations.AddStation(old);
                                            }
                                        }
                                    }
                                } else { //la estacion compuesta no existe
                                    Station newStation = new Station(stationName + ":" + connectionName, lineName);

                                    if (listaStations.getsLast() != null) { //estacion compuesta no existe y la lista no esta vacia
                                        Station sAux = listaStations.getsLast();

                                        newStation.conect(sAux);
                                        listaStations.AddStation(newStation);
                                        listaAllStations.AddStation(newStation);
                                    } else {

                                        listaStations.AddStation(newStation);
                                        listaAllStations.AddStation(newStation);
                                    }
                                }
                            }
                        } else {
                            String stationName = (String) stationObject;

                            if (listaAllStations.nameInList(stationName)) {
                                for (int j = 1; j < listaLines.getlen(); j++) {
                                    List estaciones = listaLines.getLine(listaLines, j).getStations();
                                    if (estaciones.nameInList(stationName)) {
                                        Station old = estaciones.getNamedStation(stationName);

                                        Station sAux = listaStations.getsLast();
                                        if (sAux != null) {
//                                          
                                            sAux.conect(old);
                                            listaStations.AddStation(old);
                                            
                                        }else{
                                            listaStations.AddStation(old);
                                        }
                                    }
                                }

                            } else {

                                Station newStation = new Station(stationName, lineName);

                                listaAllStations.AddStation(newStation);
                                if (listaStations.getsLast() != null) {

                                    Station last = listaStations.getsLast();
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

        } 
        catch (ParseException e) {

            e.printStackTrace();
        }

        return listaLines;

    }

/**
 * @author gcosta
 * @return text
*/  
  
    public String getText() {
        return text;
    }

/**
 * @author gcosta
 * @param text
*/ 
    public void setText(String text) {
        this.text = text;
    }

}
