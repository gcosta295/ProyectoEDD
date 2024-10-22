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
    
    public void AddStation (Station s){ //adds an station to the list.
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
    
}
