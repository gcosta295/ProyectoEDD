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
    private String lName;               //Name of the Line
    private List stations;              //Station list of the line

    public Line(String lName) {     
        this.lName = lName;
        this.stations = new List();
    }

    public String getLname() {       
        return lName;
    }
    
    public List getStations() {
        return stations;
    }

}
