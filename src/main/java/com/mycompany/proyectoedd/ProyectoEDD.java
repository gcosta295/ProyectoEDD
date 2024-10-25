/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoedd;

import org.graphstream.ui.swingViewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author gabri
 */
public class ProyectoEDD {

    public static void main(String[] args) {

        ReadJSON L = new ReadJSON();
        L.abrirArchivo();
        List listaLines = L.Parse();
//  
        System.setProperty("gs.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
//        Grafo graf = new Grafo();
//        graf.Graph(listaLines);

//        Viewer viewer = graf.getGraph().display();
//// Let the layout work ...
//        viewer.disableAutoLayout();
//// Do some work ...
//        viewer.enableAutoLayout();

////        System.setProperty("org.graphstream.ui", "swing");
////		
////		Graph graph = new SingleGraph("Tutorial 1");
////
////                 graph.addNode("A");
////                 graph.addNode("B");
////                 graph.addNode("C");
////                 graph.addEdge("AB","A","B");
////                 graph.addEdge("BC","B","C");
////                 graph.addEdge("CA","C","A");
////                 
////            graph.display();
////        
//        //graf.Graph(listaLines); //parametro lista de lineas
////        

//        graf.getGraph().display();
//        graf.color("Plaza Venezuela:Zona Rental");

//        System.setProperty("org.graphstream.ui", "swing");
//		
//		Graph graph = new SingleGraph("Tutorial 1");
//
//                 graph.addNode("A");
//                 graph.addNode("B");
//                 graph.addNode("C");
//                 graph.addEdge("AB","A","B");
//                 graph.addEdge("BC","B","C");
//                 graph.addEdge("CA","C","A");
//                 
//            graph.display();
//        
        //graf.Graph(listaLines); //parametro lista de lineas

//            while (currentL != null) {
//            System.out.println(currentL.getLname());
//            Station current = currentL.getStations().getsFirst();
//            while (current != null) {
//                System.out.println("Station: " + current.getsData());
//
//                int c = 1;
//                while (c <= current.getconections().getlen()) {
//                    System.out.println("coneccion: " + current.getconections().getStation(c).getsData());
//                    c += 1;
//                }
//                current = current.getNext();
//            }
//            currentL = currentL.getlNext();
//        }
    }
}
