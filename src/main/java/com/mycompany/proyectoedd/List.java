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
    private Line lFirst;
    private Line lLast;
    private int len;

    public List() {
        this.sFirst = null;
        this.sLast = null;
        this.lFirst = null;
        this.lLast = null;
        this.len = 0;
    }
    
    public int getlen(){
        return this.len;
    }

    public Line getlFirst() {
        return lFirst;
    }

    public Station getsLast() {
        return sLast;
    }
    
    /*Add a station that you give to the method in the last position 
        and make the conection in the list with the others,
        also you can use it to conect randoms stations*/
    
    public void AddStation (Station s){ 
        Station stat = new Station(s.getsData(),s.getlData());
        stat.setCover(s.isCover());
        stat.setSucursal(s.isSucursal());
        stat.setConections(s.getconections());
        if (this.len!=0){
            Station sAux = this.sLast;
            sAux.setnext(stat);
            this.sLast = stat;
        }
        else{
            this.sFirst = stat;
            this.sLast = stat;
        }
        this.len += 1;
    }
    
    /*Add an line that you give to the method in the last position 
        and make the conection in the list with the others*/
    
    public void AddLine (Line l){
        if (this.len!=0){
            Line lAux = this.lLast;
            lAux.setlNext(l);
            this.lLast = l;
        }
        else{
            this.lFirst = l;
            this.lLast = l;
        }
        this.len += 1;
    }
    
    /*Serch in the list that you give to the funtion the station that have 
    the index that you give too*/
    
    public Station getStation(int i){
        if (i<=this.len){
        int j = 1;
        Station sAux = this.sFirst;
        while (j<=i){
            if (j<i){
                sAux=sAux.getNext();
            }
            j+=1;
        }
        return sAux;
        }
        else{
            return null;
        }
    }
        
    
    /*Serch in the list that you give to the funtion the line that have 
    the index that you give too*/
    
    public Line getLine (List l, int i){
        int j = 1;
        Line lAux = l.lFirst;
        while (j<=i){
            if (j!=i){
                j+=1;
                lAux = lAux.getlNext();
            }
            else{
                return lAux;
            }
        }
        return lAux;
    }
    
    /*Confir if in the list that you give exist 
    a station that you give too*/
    
    public boolean sInList(Station s){
        Station sAux = sFirst;
        while (sAux != null){
            if(sAux.getsData().equals(s.getsData())){
                return true;
            }
            sAux = sAux.getNext();
        }
        return false;
    }
    
    /*Confir if in the list that you give exist 
    a line that you give too*/
    
    public boolean lInList (Line l){
        Line lAux = lFirst;
        while (lAux != null){
            if(lAux.equals(l)){
                return true;
            }
            lAux = lAux.getlNext();
        }
        return false;
    }
    
    /*public void serchConections (int n, List l){
        int cont2 = 1;
        int num = l.len;
        while (cont2 <= num){
            System.out.print("largo de la lista evaluando");
            System.out.println(this.len);
            if (n==1){
                this.AddStation(l.getStation(l, cont2));
            }
            else{
                List lAux = l.getStation(l, cont2).getconections();
                l.serchConections(n-1, lAux);
            }
            cont2 +=1;
        }
        
    }*/
}
