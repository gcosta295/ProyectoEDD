/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoedd;

/**
 *
 * @author gabri
 */
public class ProyectoEDD {
    
    public static void main(String[] args) {
        ReadJSON L = new ReadJSON();
        L.abrirArchivo();
        List listaLines = L.Parse();
//        List stations = new List();
//        Line linea = new Line("line 1'
//        Line linea1 = new Line("line 2");
//        Station station = new Station("station0", linea.getLname());
//        Station station1 = new Station("station1", linea.getLname());
//        Station station2 = new Station("station2", linea.getLname());
//        Station station3 = new Station("station3", linea1.getLname());
//        Station station4 = new Station("station4", linea1.getLname());
//        stations.AddStation(station);
//        stations.AddStation(station1);
//        stations.AddStation(station2);
//        stations.AddStation(station3);
//        stations.AddStation(station4);
//        /*System.out.print(station.getsData() + " esta conectada con ");
//        System.out.println(station.getconections().getStation(station.getconections(), 1).getsData());
//        System.out.print(station1.getsData() + " esta conectada con ");
//        System.out.println(station1.getconections().getStation(station1.getconections(), 1).getsData());
//        System.out.println(stations.getLine(stations, 1).getLname());*/
//        
//        Grafo graf = new Grafo();
//        graf.Graph(stations);

        Line currentL = listaLines.getlFirst();
        while (currentL != null) {
            System.out.println(currentL.getLname());
            Station current = currentL.getStations().getsFirst();
            while (current != null) {
                System.out.println("Station: " + current.getsData());

                int c = 1;
                while (c <= current.getconections().getlen()) {
                    System.out.println("coneccion: " + current.getconections().getStation(c).getsData());
                    c += 1;
                }
                current = current.getNext();
            }
            currentL = currentL.getlNext();
    }
        
    
    }
}

