/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.AbstractEdge.*;
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
    }*/
    
    public static void main(String args[]) {
        System.setProperty("org.graphstream.ui", "org.graphstream.ui.swing");
	Graph graph = new SingleGraph ("Tutorial 1");
        
        System.out.println("uish1");
        graph.addNode("A" );
        System.out.println("uish2");
        graph.addNode("B" );
        System.out.println("uish3");
        graph.addNode("C" );
        System.out.println("uish4");
        graph.addEdge("AB", "A", "B");
        System.out.println("uish5");
        graph.addEdge("BC", "B", "C");
        System.out.println("uish6");
        graph.addEdge("CA", "C", "A");
        System.out.println("uish7");
        
        System.out.println("uish8");
        graph.display();

    }
    
}
