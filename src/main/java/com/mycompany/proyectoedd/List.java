/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;

/**
 *
 * @author astv06
 */
public class List {
    private Station sFirst;
    private Station sLast;
    private int len;

    public List() {
        this.sFirst = null;
        this.sLast = null;
        this.len = 0;
    }
    
    public int getlen(){
        return this.len;
    }
    
    /*Add an element that you give to the method in the last position 
        and make the conection in the list with the others items*/
    
    public void AddStation (Station s){
        if (this.len!=0){
            Station sAux = this.sLast;
            sAux.setnext(s);
            this.sLast = s;
        }
        else{
            this.sFirst = s;
            this.sLast = s;
        }
        this.len += 1;
    }
    
    /*Serch in the list that you give to the funtion the item that have 
    the index that you give too*/
    
    public Station getStation(List l, int i){
        int j = 1;
        Station sAux = l.sFirst;
        while (j<=i){
            if (j!=i){
                j+=1;
                sAux=sAux.getNext();
            }
            else{
                return sAux;
            }
        }
<<<<<<< HEAD
        L.setLong(Long + 1);                                //Changes le long of the list
        return L;
    } 
    
    public List AddStationToList(List L, String a){      //Add an existing station to the list, used for parsing JSON
        Station S = new Station();    
        S.setSdata(a); // Create a new station with the String given
        S.setSList(L.getLname()); //the created station gets the name of the list
        if (L.getLong()==0){                                
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
=======
        return sAux;
    }
    
    /*confir if in the list that you give exist 
    an element that you give too*/
    
    public boolean inList(Station s){
        Station sAux = sFirst;
        while (sAux != null){
            if(sAux.equals(s)){
                return true;
            }
            sAux = sAux.getNext();
        }
        return false;
    }
    
>>>>>>> origin/astv06
}
