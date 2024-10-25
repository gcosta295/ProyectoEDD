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

    public Station(String sData, String lData) {
        this.sData = sData;
        this.lData = lData;
        this.next = null;
        this.conections = new List(); 
        this.Sucursal = true;
        this.cover = true;
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

    public boolean isSucursal() {
        return Sucursal;
    }

    public boolean isCover() {
        return cover;
    }

    public void setlData(String lData) {
        this.lData = lData;
    }
    
    public List getconections(){
        return conections;
    }

    public void setConections(List conections) {
        this.conections = conections;
    }
    
    public void setsData(String data) {
        this.sData = data;
    }
    
    public void setnext(Station next){
        this.next = next;
    }

    public void setSucursal(boolean Sucursal) {
        this.Sucursal = Sucursal;
    }

    public void setCover(boolean cover) {
        this.cover = cover;
    }
    
    public void conect(Station s){
        this.conections.AddStation(s);
        s.conections.AddStation(this);
    }
    
    public List BFS (List l, int t){
        int cont = 1;
        List x = this.conections;
        while (cont <= x.getlen()){
            if (t == 1){
                if (l.sInList(x.getStation(cont))==false){
                    l.AddStation(x.getStation(cont));
                }
            }
            else{
                if (l.sInList(x.getStation(cont))==false){
                    l.AddStation(x.getStation(cont));
                }
                List lAux = x.getStation(cont).BFS(l, t-1);
            }
        cont += 1;
        }
        return l;
    }
}
