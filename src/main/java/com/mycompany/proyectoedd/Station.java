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
<<<<<<< HEAD
    private String Sdata;//infotmation of the station
    private String SList;//information of the list 
    private List Conections;// conections of the station
=======
    private String sData;                   //Name of the station
    private Station next;                   //Next station of the line
    private List conections;                //Conections of the stations
    private boolean Sucursal;               //State of sucursal
>>>>>>> origin/astv06

    public Station(String sData) {
        this.sData = sData;
        this.next = null;
        this.conections = new List(); 
        this.Sucursal = false;
    }

    public Station getNext() {
        return next;
    }

    public String getsData() {
        return sData;
    }
    
    public List getconections(){
        return conections;
    }
    
    public void setsData(String data) {
        this.sData = data;
    }
    
    public void setnext(Station next){
        this.next = next;
    }
    
    public void conect(Station s){
        this.conections.AddStation(s);
    }
    
}
