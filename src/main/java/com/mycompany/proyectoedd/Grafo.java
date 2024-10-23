/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.graph.implementations.SingleGraph;
/**
 *
 * @author astv06
 */
        
public class Grafo {

    
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
    public void Grafo(List stations) {
		System.setProperty("org.graphstream.ui", "swing");
                Graph graph = new SingleGraph("Tutorial 1");
		for (int i = 1; i <= stations.getlen(); i++) {
                    Station x = stations.getStation(stations, i);
                    Station x1 = stations.getStation(stations, i).getNext();
                    if (i < stations.getlen()){  
                        if (i==1){
                            graph.addNode(x.getsData());
                            graph.addNode(x1.getsData());
                        }
                        else{
                            graph.addNode(x1.getsData());
                        }
                        if (x.getlData() == x1.getlData()){
                            graph.addEdge(x.getsData()+x1.getsData(), x.getsData(), x1.getsData());
                        }
                    }
                }
		graph.display();

				
	}
   

}
