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
    
    /*Contructor del objeto grafo*/
    public Grafo() {

        this.graph = new MultiGraph("Grafo Metro");
//        System.setProperty("org.graphstream.ui", "swing");

    }
    /*Metodo para poder acceder al grafo*/
    public MultiGraph getGraph() {
        return graph;
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
    /*Generador del grafo*/    
    public void Graph(List line) {
        graph.setAttribute("ui.stylesheet", "node{\n"                           //Parametros para el diseño del grafo
                + "    size: 5px, 5px;\n"
                + "    fill-color: #f7f7f0;\n"
                + "    text-mode: normal; \n"
                + "}");
        for (int i = 1; i <= line.getlen(); i++) {                              //Asignar a stations la lista de estaciones 
//            System.out.println(i);                                            //de cada una de las lineas pertenecientes
            //Line tline = line.getLine(line, i);                               //a la lista de lineas
            //System.out.println("lineas");
            //System.out.println(line.getLine(line, i));
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
            for (int l = 1; l < stations.getlen(); l++) {                       //Para cada una de las estaciones de la lista
                Station x = stations.getStation(l);                             //asignar a x la estacion correspondiente al
                Station x1 = stations.getStation(l + 1);                        //indice y x1 la estacion siguiente
//                    System.out.println();

//                System.out.println(x.getsData());
//                System.out.println(x1.getsData());
                if (l < stations.getlen()) {                                    //hacer si el iterable (indice) es menor que 
                    if (l == 1) {                                               //la cantidad de estaciones
//                        System.out.println("nodo creado");
                        Node nx;                                                //De ser l igual a 1 declarar nx y nx1
                        Node nx1;
                        if (this.graph.getNode(x.getsData()) == null) {         //En caso de no existir el nodo nx crearlo
                            nx = this.graph.addNode(x.getsData());              //sino devolver el valor del nodo nx
                        } else {
                            nx = this.graph.getNode(x.getsData());
                        }

                        if (this.graph.getNode(x1.getsData()) == null) {        //En caso de no existir el nodo nx1 crearlo
                            nx1 = this.graph.addNode(x1.getsData());            //sino devolver el valor del nodo nx
                        } else {
                            nx1 = this.graph.getNode(x1.getsData());
                        }
//                        Node nx1 = this.graph.addNode(x1.getsData());
                        //System.out.println("nodo creado");                      

                        nx.setAttribute("ui.style", "fill-color: blue;");       //Parametros para el diseño de los nodos
                        nx.setAttribute("ui.label", x.getsData());
                        nx1.setAttribute("ui.label", x1.getsData());
//                            Node nx1 = graph.addNode(x1.getsData());
                        nx1.setAttribute("ui.style", "fill-color: blue;");
                    } else {                                                    //De ser l diferente de 1

                        if (x1 != null) {                                       //Comprobar que no es el final de la linea
                            Node nx1;                                           //Declarar nx1
                            if (this.graph.getNode(x1.getsData()) == null) {    //En caso de no existir el nodo nx1 crearlo
                                nx1 = this.graph.addNode(x1.getsData());        //sino devolver el valor del nodo nx
                            } else {
                                nx1 = this.graph.getNode(x1.getsData());
                            }
                            //System.out.println("nodo creado");
                            nx1.setAttribute("ui.style", "fill-color: blue;");  //Parametros para el diseño de nx1
                            nx1.setAttribute("ui.label", x1.getsData());
                        }
//                            Node nx1 = graph.addNode(x1.getsData());
//                            nx1.setAttribute("ui.style", "fill-color: blue;");
                    }

//                            Node nx1 = graph.addNode(x1.getsData());
                    String y = x.getsData() + x1.getsData();                    //Generacion de un vertice entre x y x1
//                            System.out.println(y);
//                            System.out.println(stations.getLen());
//                            System.out.println(l);
                    Edge edd = this.graph.addEdge(y, x.getsData(), x1.getsData());
                    edd.setAttribute("shape", "line");

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
    public void changeColorNodo(Station station) {                              //station es el nodo que se quiere cambiar de color

        if (graph.getNode(station.getsData()) != null) {                        //comprobar si la estacion esta en el grafo
                                                                                //de existir cambiar el color a rojo
            graph.getNode(station.getsData()).setAttribute("ui.style", "fill-color: red;");

        } else {                                                                //indicar que la estacion no pertenece al grafo
            JOptionPane.showMessageDialog(null, "La estación" + station.getsData() + "no existe en el grafo.");
        }
    }

//    public void mostrarGrafo() {
//
////        this.graph.addNode("A");
////        this.graph.addNode("B");
////        this.graph.addNode("C");
////        this.graph.addEdge("AB","A","B");
////        this.graph.addEdge("BC","B","C");
////        this.graph.addEdge("CA","C","A");
//        graph.setAttribute("ui.quality");
//        graph.setAttribute("ui.antialias");
//        graph.display();
//
//    }

}
