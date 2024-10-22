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
    private String Sdata;//infotmation of the station
    private String SList;//information of the list 
    private List Conections;// conections of the station

    public Station() {
        this.Sdata = null;
        this.SList = null;
        this.Conections = new List();
    }

    public String getSdata() {
        return Sdata;
    }

    public void setSdata(String data) {
        this.Sdata = data;
    }
    
    public List getConections() {
        return Conections;
    }
    
    public void setConections(List Conections) {
        this.Conections = Conections;
    }
    
    public String getSList() {
        return SList;
    }
    
    public void setSList(String SList) {
        this.SList = SList;
    }
    
    /*public Line last(Line Firth){
        if (Firth.getLnext()==null){
            return Firth;
        }
        else{
            Line Laux = Firth.getLnext();
            while (Laux.getLnext()!=null){
                Laux = Laux.getLnext();
            }
            return Laux;
        }
    }*/
    /*public Station Slast (Station Firth){
        
    }*/

    

    

    
}
