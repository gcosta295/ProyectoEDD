/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;

import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;
/**
 *
 * @author astv06
 */
        
public class Grafo {

    
    
    public Grafo() {     
        System.setProperty("org.graphstream.ui", "swing");
        
    }
    SingleGraph graph = new SingleGraph("Tutorial 1");
    
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
	
        for (int i = 1; i<= line.getlen(); i++) {
//            System.out.println(i);
            Line tline = line.getLine(line, i);
            for (int j = 1; j < tline.getStations().getlen(); j++) {
                List stations = tline.getStations();
//                System.out.println(j);
                    int contador = 1;
                    System.out.println("");
                    while (contador<=stations.getlen()){
                        System.out.println(stations.getStation(stations, contador).getsData());
                        System.out.println(".............");
                        contador+=1;
                    }
                    System.out.println("");
                for (int l = 1; l <= stations.getlen(); l++) {
                    Station x = stations.getStation(stations, l);
                    Station x1 = stations.getStation(stations, l+1);
//                    System.out.println();
                        System.out.println(x.getsData());
                        System.out.println(x1.getsData());
                    if (l < stations.getlen()){
                        if (l==1){
                            Node nx = graph.addNode(x.getsData());
                            nx.setAttribute("ui.style", "fill-color: blue;");
                            nx.setAttribute("ui.label", "nodo1"); //ponerle nombre a los nodos
                            if (x1 == null) {
                                Node nx1 = graph.addNode(x1.getsData());
                                nx1.setAttribute("ui.style", "fill-color: blue;");
                            }
//                            Node nx1 = graph.addNode(x1.getsData());
//                            nx1.setAttribute("ui.style", "fill-color: blue;");
                        }
                        else{
                            if (x1==null) {
                                Node nx1 = graph.addNode(x1.getsData());
                                nx1.setAttribute("ui.style", "fill-color: blue;");
                            }
//                            Node nx1 = graph.addNode(x1.getsData());
//                            nx1.setAttribute("ui.style", "fill-color: blue;");
                        }
                        System.out.println(x.getlData());
                        System.out.println(x1.getlData());
                        if (x.getlData() == x1.getlData()){
                            System.out.println("funciona");
                            graph.addEdge(x.getsData()+x1.getsData(), x.getsData(), x1.getsData());
                        }
                    }
                }
		graph.display();
//
              }

                
            }
        }
        
        		

    
    public void changeColorNodo(Station station){ //station es el nodo que se quiere cambiar de color
        
        if(graph.getNode(station.getsData())!=null){
            
           graph.getNode(station.getsData()).setAttribute("ui.style", "fill-color: red;");
                      
        }else{
            JOptionPane.showMessageDialog(null, "La estación" +station.getsData()+ "no existe en el grafo.");
        }
    }
    
    public void mostrarGrafo(){
        
        Viewer viewer = graph.display();
        viewer.addDefaultView(true); 
    }
    
}
