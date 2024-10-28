/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;

/**
 *
 * @author astv06
 */
public class Station {
    private String sData;                   //Name of the station
    private String lData;
    private Station next;                   //Next station of the line
    private List conections;                //Conections of the stations
    private boolean Sucursal;               //State of sucursal
    private boolean cover;

/**
 * constructor de estaciones 
 * @author astv06
 * @param sData
 * @param lData
*/
    public Station(String sData, String lData) {
        this.sData = sData;
        this.lData = lData;
        this.next = null;
        this.conections = new List(); 
        this.Sucursal = false;
        this.cover = false;
    }

/**
 * regresa la siguiente estacion
 * @author astv06
 * @return next
*/
    public Station getNext() {
        return next;
    }

/**
 * regresa el nombre de la estacion
 * @author astv06
 * @return sData
*/    
    public String getsData() {
        return sData;
    }

/**
 * regresa el nombre de la linea
 * @author astv06
 * @return lData
*/    
    public String getlData() {
        return lData;
    }

/**
 * confirma si la estacion es una sucursal
 * @author astv06
 * @return Sucursal
*/  
    public boolean isSucursal() {
        return Sucursal;
    }

/**
 * confirma si la estacion esta cubierta
 * @author astv06
 * @return cover
*/ 
    public boolean isCover() {
        return cover;
    }
    
/**
 * asigna un nuevo nombre a la linea a la que
 * pertenece la estacion
 * @author astv06
 * @param lData
*/
    public void setlData(String lData) {
        this.lData = lData;
    }
    
/**
 * devuelve la lista de conecciones de la estacion
 * @author astv06
 * @return conections
*/
    public List getconections(){
        return conections;
    }

/**
 * asigna una nueva lista de coneciones 
 * a la estacion
 * @author astv06
 * @param conections
*/    
    public void setConections(List conections) {
        this.conections = conections;
    }
 
/**
 * asigna un nuevo nombre a la estacion
 * @author astv06
 * @param data
*/       
    public void setsData(String data) {
        this.sData = data;
    }
   
/**
 * asigna una estacion siguiente a la estacion
 * @author astv06
 * @param next
*/     
    public void setnext(Station next){
        this.next = next;
    }

/**
 * asigna una sucursal a una estacion
 * @author astv06
 * @param Sucursal
*/        
    public void setSucursal(boolean Sucursal) {
        this.Sucursal = Sucursal;
    }

/**
 * asigna la covertura de una estacion
 * @author astv06
 * @param cover
*/      
    public void setCover(boolean cover) {
        this.cover = cover;
    }
    
/**
 * conecta dos estaciones entre si
 * @author astv06
 * @param s
*/    
    public void conect(Station s){
        this.conections.AddStation(s);
        s.conections.AddStation(this);
    }
}
