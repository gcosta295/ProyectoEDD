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
    //Lista valida tanto para lineas como para estaciones
    private Station sFirst;
    private Station sLast;
    private Line lFirst;
    private Line lLast;
    private int len;

/**
 * constructor de listas 
 * @author astv06
*/    
    public List() {
        this.sFirst = null;
        this.sLast = null;
        this.lFirst = null;
        this.lLast = null;
        this.len = 0;
    }

/**
 * retorna la longitud de la lista 
 * @author astv06
 * @return len
*/      
    public int getlen() {
        return this.len;
    }

/**
 * retorna la primera estacion de la lista
 * @author astv06
 * @return sFirst
*/      
    public Station getsFirst() {
        return sFirst;
    }
/**
 * retorna la ultima linea de la lista
 * @author astv06
 * @return lLast
*/    
    public Line getlLast() {
        return lLast;
    }

/**
 * retorna la primera linea de la lista
 * @author astv06
 * @return lFirst
*/        
    public Line getlFirst() {
        return lFirst;
    }

/**
 * retorna la ultima estacion de la lista
 * @author astv06
 * @return sLast
*/     
    public Station getsLast() {
        return sLast;
    }
    
/**
 * Añade una copia de la estacion que tu le diste al metodo en la 
 * ultima posicion del mismo, tambien se puede usar para 
 * conectar estaciones aleatorias entre si
 * @author astv06
 * @param s
*/    
    public void AddStation(Station s) {
        Station stat = new Station(s.getsData(), s.getlData());
        stat.setCover(s.isCover());
        stat.setSucursal(s.isSucursal());
        stat.setConections(s.getconections());
        if (this.len != 0) {
            Station sAux = this.sLast;
            sAux.setnext(stat);
            this.sLast = stat;
        } else {
            this.sFirst = stat;
            this.sLast = stat;
        }
        this.len += 1;
    }
                                            
/**
 * Se emplea para confirmar la existencia de una 
 * estacion mediante su nombre 
 * @author Gabriela
 * @param s
 * @return boolean
*/                                                                                    
    public boolean nameInList(String s) {

        Station sAux = sFirst;
        while (sAux != null) {
            if (sAux.getsData().contains(s)) {
                return true;
            }
            sAux = sAux.getNext();
        }
        return false;
    }
    
/**
 * Añade la linea proporcionada al metodo en la ultima posicion 
 * y crea una coneccion con la que previamente era la ultima 
 * @author astv06
 * @param l
*/                                                                                  
    public void AddLine(Line l) {
        if (this.len != 0) { 
            Line lAux = this.lLast;
            lAux.setlNext(l);
            this.lLast = l;
        } else {
            this.lFirst = l; 
            this.lLast = l;
        }
        this.len += 1;
    }

/**
 * Busca en la lista que invoca al metodo la 
 * estacion correspondiente al indice del
 * dato de entrada
 * @author astv06
 * @param i
 * @return sAux
*/
    public Station getStation(int i) {
        if (i <= this.len) {
            int j = 1;
            Station sAux = this.sFirst;
            while (j <= i) {           
                if (j < i) {           
                    sAux = sAux.getNext();
                }
                j += 1;
            }
            return sAux;                  
        } else {
            return null;                  
        }
    }

/**
 * Comprueba si una estacion esta en una lista
 * @author astv06
 * @param s
 * @return boolean
*/    
    public boolean sInList(Station s) {
        if (sFirst != null) {          
            Station sAux = sFirst;
            while (sAux != null) {                                      
                if (sAux.getsData().equals(s.getsData())) {             
                    return true;                                        
                }
                sAux = sAux.getNext();
            }
            return false;
        } else {
            return false;
        }

    }

/**
 * LA JUSTIFICACION QUE NO ME CORRESPONDE       
 * @author hola
 * pd aun falta por terminar
*/     
    public boolean sInListdfs(Station s) {                                      
        if (sFirst != null) {
            int c = 1;

            Station sAux = this.getStation(c);
            while (sAux != null) {
                if (sAux.equals(s)) {
                    return true;
                }
                c += 1;
                sAux = this.getStation(c);
            }
            return false;
        } else {
            return false;
        }

    }

/**
 * busca en la lista la linea que cumpla con ese indice       
 * @author astv06
 * @param l
 * @param i
 * @return lAux
*/
    public Line getLine(List l, int i) {
        int j = 1;
        Line lAux = l.lFirst;
        while (j <= i) {
            if (j != i) {
                j += 1;
                lAux = lAux.getlNext();
            } else {
                return lAux;
            }
        }
        return lAux;
    }

/**
 * confirma si en la lista que llamo a la funcion 
 * esta la linea que le fue proporcionada
 * @author astv06
 * @param l
 * @return boolean
*/   
    public boolean lInList(Line l) {
        Line lAux = lFirst;                                                   
        while (lAux != null) {                                                
            if (lAux.equals(l)) {                                             
                return true;
            }
            lAux = lAux.getlNext();
        }
        return false;
    }

/**
 * en base al nombre de la estacion te encuentra la estacion
 * @author Gabriela
 * @param s
 * @return sAux
*/    
    public Station getNamedStation(String s) { 
        Station sAux = sFirst;                 
        while (sAux != null) {                 
            if (sAux.getsData().contains(s)) { 
                return sAux;
            }
            sAux = sAux.getNext();             
        }
        return null;
    }

/**
 * elimina una estacion en la lista 
 * @author astv06
 * @param s
*/    
    public void deleteStation(Station s){
        List lAux = new List();
        int cont = 1;
        for (int i = 1; i <= this.getlen(); i++) {
            Station sAux = this.getStation(i);
            if (sAux.getsData()!=s.getsData()){
                cont+=1;
            }
            else{
                this.getStation(cont-1).setnext(this.getStation(cont+1));
            }
        }
    }
}
