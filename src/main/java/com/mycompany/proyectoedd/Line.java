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
    private String lName; 
    private List stations;
    private Line lNext;

/**
 * constructor de lineas 
 * @author ============================================
 * @param lName
*/     
    public Line(String lName) {    
        this.lName = lName;
        this.stations = new List();
        this.lNext = null;
    }

/**
 * retorna el nombre de la linea 
 * @author ============================================
 * @return lName
*/     
    public String getLname() {
        return lName;
    }
    
/**
 * retorna la lista de estaciones de esta linea 
 * @author ============================================
 * @return stations
*/    
    public List getStations() {
        return stations;
    }
    
/**
 * retorna la siguiente linea 
 * @author ============================================
 * @return stations
*/
    public Line getlNext() {
        return lNext;   
    }

/**
 * asigna una nueva linea siguiente 
 * @author ============================================
 * @return stations
*/    
    public void setlNext(Line lNext) {
        this.lNext = lNext;           
    }

}
