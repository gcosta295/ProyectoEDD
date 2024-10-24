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

    public Station(String sData, String lData) {
        this.sData = sData;
        this.lData = lData;
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

    public String getlData() {
        return lData;
    }

    public void setlData(String lData) {
        this.lData = lData;
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
        s.conections.AddStation(this);
    }
    
}
