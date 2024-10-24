/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;
import com.sun.tools.jdeps.Graph;
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
    public void Graph(List stations) {
		
		for (int i = 1; i <= stations.getlen(); i++) {
                    Station x = stations.getStation(stations, i);
                    Station x1 = stations.getStation(stations, i).getNext();
                    if (i < stations.getlen()){  
                        if (i==1){
                            Node nx = graph.addNode(x.getsData());
                            nx.setAttribute("ui.style", "fill-color: blue;");
                            nx.setAttribute("ui.label", "nodo1"); //ponerle nombre a los nodos
                            Node nx1 = graph.addNode(x1.getsData());
                            nx1.setAttribute("ui.style", "fill-color: blue;");
                        }
                        else{
                            Node nx1 = graph.addNode(x1.getsData());
                            nx1.setAttribute("ui.style", "fill-color: blue;");
                        }
                        if (x.getlData() == x1.getlData()){
                            graph.addEdge(x.getsData()+x1.getsData(), x.getsData(), x1.getsData());
                        }
                    }
                }
		graph.display();

				
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
