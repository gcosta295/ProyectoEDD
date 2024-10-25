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
        
        List stations = new List();
        List covers = new List();
        Line linea = new Line("line 1");
        Line linea1 = new Line("line 2");
        Station station = new Station("station0", linea.getLname());
        Station station1 = new Station("station1", linea.getLname());
        Station station2 = new Station("station2", linea.getLname());
        Station station3 = new Station("station3", linea1.getLname());
        Station station4 = new Station("station4", linea1.getLname());
        Station station5 = new Station("station5", linea1.getLname());
        stations.AddStation(station);
        stations.AddStation(station1);
        stations.AddStation(station2);
        stations.AddStation(station3);
        stations.AddStation(station4);
        stations.AddStation(station5);
        station.conect(station1);
        station.conect(station2);
        station2.conect(station3);
        station2.conect(station4);
        station4.conect(station5);
        covers = station4.BFS(covers, 2);
        int contadorX = 1;
        System.out.println(covers.getlen());
        while (contadorX <= covers.getlen()){
            System.out.println(covers.getStation(contadorX).getsData());
            contadorX +=1;
        }/**/
        
        /*System.out.print(station.getsData() + " esta conectada con ");
        System.out.println(station.getconections().getStation(station.getconections(), 1).getsData());
        System.out.print(station1.getsData() + " esta conectada con ");
        System.out.println(station1.getconections().getStation(station1.getconections(), 1).getsData());
        System.out.println(stations.getLine(stations, 1).getLname());
        
        Grafo graf = new Grafo();
    
        

        graf.Graph(stations);
*/
    }
        
    
} 
