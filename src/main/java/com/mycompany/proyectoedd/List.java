/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;

/**
 *
 * @author astv06
 */
class List {
    private String Lname;           //Name of the List
    private Station SFirth;         //Firth of the List
    private Station SLast;          //Last of the List 
    private int Long;               //Length of the 

    public List() {     
        this.Lname = null;
        this.Long = 0;
        this.SFirth = null;
        this.SLast = null;
    }

    public String getLname() {       
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }
    
    public Station getSFirth() {    
        return SFirth;
    }

    public Station getSLast() {     
        return SLast;
    }

    public int getLong() {
        return Long;
    }

    public void setSFirth(Station SFirth) {
        this.SFirth = SFirth;
    }

    public void setSLast(Station SLast) {
        this.SLast = SLast;
    }

    public void setLong(int Long) {
        this.Long = Long;
    }
    
    public List AddToList(List L){                          //Add a new station on the list
        Station S = new Station();                          //Create a new station
        if (L.getLong()==0){                                //If the list is empty the statios will be the firth
            L.setSFirth(S);
            L.setSLast(S);
        }
        else{
            Station SAux = L.getSLast();
            List LAux = SAux.getConections();
            int LongList = LAux.getLong();
            if (LongList == 0){
                LAux.setSFirth(S);
                LAux.setSLast(S);
                LAux.setLong(1);
            }
            else{
                LAux.setSLast(S);
                LAux.setLong(LongList + 1);
            }
            SAux.setConections(LAux);
            L.setSLast(S);                                  //If the list isn't empty the station will be thw new last
        }
        L.setLong(Long + 1);                                //Changes le long of the list
        return L;
    } 
    /*
    llamo a la variable auxiliar
    busco las conexiones de la variable auxiliar
    */
    /*public List DeleteToList(List L){
        
        recibir lista
        recibir estacion
        comprobar si la estacion pertenece a la lista
        comprobar si la lista no esta vacia
        comprobar si la lista tiene mas de un elemento
        de tener mad de un elemento 
        parca cada uno de los 
        
    }*/
}
