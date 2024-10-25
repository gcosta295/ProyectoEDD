/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;

import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author astv06
 */
public class Grafo {

    public MultiGraph graph;

    public Grafo() {

        this.graph = new MultiGraph("Grafo Metro");
        System.setProperty("org.graphstream.ui", "swing");

    }
    //MultiGraph graph = new MultiGraph("Tutorial 1");

    /*private List listLines; //ignoramos esto
    private String gName;

    public Grafo() {
        this.listLines = new List();
        this.gName = null;
    }

    public List getListLines() {
        return listLines;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }
     */
    public void Graph(List line) {

        for (int i = 1; i <= line.getlen(); i++) {
//            System.out.println(i);
            Line tline = line.getLine(line, i);
            System.out.println("lineas");
            System.out.println(line.getLine(line, i));
            List stations = line.getLine(line, i).getStations();
//            for (int j = 1; j < tline.getStations().getlen(); j++) {
//                List stations = tline.getStations();
//                System.out.println(j);
//                    int contador = 1;
//                    System.out.println("");
//                    while (contador<=stations.getlen()){
////                        System.out.println(stations.getStation(stations, contador).getsData());
////                        System.out.println(".............");
//                        contador+=1;
//                    }
            System.out.println("");
            for (int l = 1; l < stations.getlen(); l++) {

                Station x = stations.getStation(l);
                Station x1 = stations.getStation(l + 1);
//                    System.out.println();
                System.out.println("LOOP LINES");
                System.out.println(x.getsData());
                System.out.println(x1.getsData());
                if (l < stations.getlen()) {
                    if (l == 1) {
                        System.out.println("nodo creado");
                        
                        Node nx = this.graph.addNode(x.getsData());
                        
                        Node nx1 = this.graph.addNode(x1.getsData());
                        System.out.println("nodo creado");

                        nx.setAttribute("ui.style", "fill-color: blue;");
                        nx.setAttribute("ui.label", "nodo1"); //ponerle nombre a los nodos
//                            Node nx1 = graph.addNode(x1.getsData());
//                            nx1.setAttribute("ui.style", "fill-color: blue;");
                    } else {

                        if (x1 != null) {
                            Node nx1 = this.graph.addNode(x1.getsData());
                            System.out.println("nodo creado");
                            nx1.setAttribute("ui.style", "fill-color: blue;");
                        }
//                            Node nx1 = graph.addNode(x1.getsData());
//                            nx1.setAttribute("ui.style", "fill-color: blue;");
                    }
                    if (x.getlData() == x1.getlData()) {

//                            Node nx1 = graph.addNode(x1.getsData());
                        String y = x.getsData() + x1.getsData();
//                            System.out.println(y);
//                            System.out.println(stations.getLen());
//                            System.out.println(l);
                        this.graph.addEdge(y, x.getsData(), x1.getsData());
                    }
                }
            }
            //graph.display(); //no se muestra
            //Viewer viewer = graph.display();

//                Viewer viewer = graph.display();
//                viewer.enableAutoLayout();
//
//            }
        }
    }

//    public void Graph(List stations) {
//		for (int i = 1; i <= stations.getlen(); i++) {
//                    Station x = stations.getStation(stations, i);
//                    Station x1 = stations.getStation(stations, i).getNext();
//                    if (i < stations.getlen()){  
//                        if (i==1){
//                            Node nx = graph.addNode(x.getsData());
//                            nx.setAttribute("ui.style", "fill-color: blue;");
//                            Node nx1 = graph.addNode(x1.getsData());
//                            nx1.setAttribute("ui.style", "fill-color: blue;");
//                        }
//                        else{
//                            Node nx1 = graph.addNode(x1.getsData());
//                            nx1.setAttribute("ui.style", "fill-color: blue;");
//                        }
//                        if (x.getlData() == x1.getlData()){
//                            graph.addEdge(x.getsData()+x1.getsData(), x.getsData(), x1.getsData());
//                        }
//                    }
//                }
//		graph.display();
//
//				
//    }
    public void changeColorNodo(Station station) { //station es el nodo que se quiere cambiar de color

        if (graph.getNode(station.getsData()) != null) {

            graph.getNode(station.getsData()).setAttribute("ui.style", "fill-color: red;");

        } else {
            JOptionPane.showMessageDialog(null, "La estación" + station.getsData() + "no existe en el grafo.");
        }
    }

    public void mostrarGrafo() {

//        this.graph.addNode("A");
//        this.graph.addNode("B");
//        this.graph.addNode("C");
//        this.graph.addEdge("AB","A","B");
//        this.graph.addEdge("BC","B","C");
//        this.graph.addEdge("CA","C","A");
        graph.display();

    }

}
