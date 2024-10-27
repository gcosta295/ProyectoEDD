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
    private Station sFirst;                                                     //Primera estacion de la lista
    private Station sLast;                                                      //Ultima estacion de la lista
    private Line lFirst;                                                        //Primera linea de la lista
    private Line lLast;                                                         //Ultima linea de la lista
    private int len;                                                            //Longitud de la lista 

    public List() {                                                             //Contructor de la lista
        this.sFirst = null;
        this.sLast = null;
        this.lFirst = null;
        this.lLast = null;
        this.len = 0;
    }

    public int getlen() {                                                       //Retorna la longitud de la lista
        return this.len;
    }

    public Station getsFirst() {                                                //Retorna la primera estacion de la lista
        return sFirst;
    }

    public Line getlLast() {                                                    //Retorna la ultima estacion de la lista
        return lLast;
    }

    public Line getlFirst() {                                                   //Retorna la primera linea de la lista
        return lFirst;
    }

    public Station getsLast() {                                                 //Retorna la ultima linea de la lista
        return sLast;
    }

                                                                                /*Añade una copia de la estacion que tu le diste al metodo en la 
                                                                                    ultima posicion del mismo, tambien se puede usar para 
                                                                                    conectar estaciones aleatorias entre si*/
    public void AddStation(Station s) {
        Station stat = new Station(s.getsData(), s.getlData());                 //Crea una nueva estacion y pasa los datos
        stat.setCover(s.isCover());                                             //de la estacion de entrada a la misma
        stat.setSucursal(s.isSucursal());
        stat.setConections(s.getconections());
        if (this.len != 0) {                                                    //En caso de que la lista no este vacia
            Station sAux = this.sLast;                                          //Tomar temporalmente el valor de la ultima estacion
            sAux.setnext(stat);                                                 //para hacer que la misma apunte a la nueva y 
            this.sLast = stat;                                                  //asignar nuevo valor a la ultima de la lista
        } else {
            this.sFirst = stat;                                                 //De estar vacia la lista asignar a la copia como
            this.sLast = stat;                                                  //nuevo inicio y fin de la lista
        }
        this.len += 1;                                                          //Incrementar la longitud de la lista en 1
    }
                                                                                /*Se emplea para confirmar la existencia de una
                                                                                    estacion mediante su nombre*/
    public boolean nameInList(String s) {

        Station sAux = sFirst;                                                  //Tomar el valor de la primera estacion de la lista
        while (sAux != null) {                                                  //Iterar cada elemento de la lista hasta llegar a null
            if (sAux.getsData().contains(s)) {                                  //En caso de que el nombre de la estacion contenga
                return true;                                                    //el string de entrada retornar verdadero
            }
            sAux = sAux.getNext();                                              //De ser diferente evaluar con la siguiente estacion
        }
        return false;                                                           //retornar falso 
    }
        
    

                                                                                /*Añade la linea proporcionada al metodo en la ultima posicion
                                                                                    y crea una coneccion con la que previamente era la ultima*/
    public void AddLine(Line l) {
        if (this.len != 0) {                                                    //Si la lista no esta vacia tomar la ultima linea
            Line lAux = this.lLast;                                             //asignar una coneccion con la lista de entrada
            lAux.setlNext(l);                                                   //y actualizar la ultima linea de la lista
            this.lLast = l;
        } else {
            this.lFirst = l;                                                    //De estar vacia asignar a la linea como primera
            this.lLast = l;                                                     //y ultima de la lista
        }
        this.len += 1;                                                          //Incrementar en uno la longitud de la lista 
    }

                                                                                /*Busca en la lista que invoca al metodo la 
                                                                                    estacion correspondiente al indice del
                                                                                    dato de entrada */
    public Station getStation(int i) {
        if (i <= this.len) {                                                    //Si el indice no es mayor a la longitud de la lista
            int j = 1;
            Station sAux = this.sFirst;                                         //crear una variable contador y una para la primera estacion de la lista
            while (j <= i) {                                                    //Iterar la variable contador y comparar con
                if (j < i) {                                                    //el dato de entrada hasta que se igualen 
                    sAux = sAux.getNext();                                      //Cada iteracion buscar la siguiente estacion
                }
                j += 1;
            }
            return sAux;                                                        //Retornar la estacion 
        } else {
            return null;                                                        //Retornar null 
        }
    }

    public boolean sInList(Station s) {                                         //Comprueba si una estacion esta en una lista
        if (sFirst != null) {                                                   //De ser la primera estacion diferente de null
            Station sAux = sFirst;
            while (sAux != null) {                                              //Tomar su valor e iterar la lista
                if (sAux.getsData().equals(s.getsData())) {                     //Comparar cada estacion con la estacion de entrada
                    return true;                                                //de ser iguales retornar verdadero,sino falso
                }
                sAux = sAux.getNext();
            }
            return false;
        } else {
            return false;
        }

    }

    public boolean sInListdfs(Station s) {                                      //revisar
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

    /*Serch in the list that you give to the funtion the line that have 
    the index that you give too*/
    public Line getLine(List l, int i) {                                        //llamar con this no con list
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

                                                                                /*confirma si en la lista que llamo a la funcion 
                                                                                    esta la linea que le fue proporcionada*/
    public boolean lInList(Line l) {
        Line lAux = lFirst;                                                     //Desde el primer elemento de la lista iterar la misma
        while (lAux != null) {                                                  //si es diferente de null comparar cada elemento con el
            if (lAux.equals(l)) {                                               // de entrada, de ser iguales retornar verdadero, sino falso
                return true;
            }
            lAux = lAux.getlNext();
        }
        return false;
    }

    public Station getNamedStation(String s) {                                  //se utiliza despues de confirmar la existencia de la estacion
        Station sAux = sFirst;                                                  //para obtener el nombre de la misma
        while (sAux != null) {                                                  //se itera desde la primera estacion hasta encontrar la estacion
            if (sAux.getsData().contains(s)) {                                  //mediante el nombre de la misma
                return sAux;
            }
            sAux = sAux.getNext();                                              //de ser contenida retornar la estacion
        }
        return null;
    }
    
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
