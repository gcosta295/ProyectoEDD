/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;

/**
 *
 * @author astv06
 */
class Line {
    private String lName;                                                       //Nombre de la linea
    private List stations;                                                      //Lista de estaciones de la linea
    private Line lNext;

    public Line(String lName) {                                                 //Constructor de la linea      
        this.lName = lName;
        this.stations = new List();
        this.lNext = null;
    }

    public String getLname() {                                                  //Retorna el nombre de la lista
        return lName;
    }
    
    public List getStations() {                                                 //retorna la lista de estaciones de la linea
        return stations;
    }

    public Line getlNext() {                                                    //retorna la linea siguiente que pertenece a
        return lNext;                                                           //la misma lista de lineas
    }

    public void setlNext(Line lNext) {                                          //Asigna la linea siguiente que pertenece a
        this.lNext = lNext;                                                     //la misma lista de lineas
    }

}
