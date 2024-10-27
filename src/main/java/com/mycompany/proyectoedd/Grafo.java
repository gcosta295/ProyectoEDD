/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;

import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author astv06
 */
public class Grafo {

    public MultiGraph graph;
    private List lSucursals;
    private List listaLines;
    private List listaStations;

    public Grafo() {

        this.graph = new MultiGraph("Grafo Metro");
    }

    public Grafo(List listaLines) {
        this.listaLines = listaLines;

    }

    public MultiGraph getGraph() {
        return graph;
    }

    public void Graph(List line) {
        this.listaLines = new List();
        this.lSucursals = new List();
        this.listaStations = new List();
        graph.setAttribute("ui.stylesheet", "node{\n"
                + "    size: 5px, 5px;\n"
                + "    fill-color: #2de327;\n"
                + "    text-mode: normal; \n"
                + "}");
        for (int i = 1; i <= line.getlen(); i++) {
            Line tline = line.getLine(line, i);
            List stations = line.getLine(line, i).getStations();
            for (int l = 1; l < stations.getlen(); l++) {

                Station x = stations.getStation(l);
                Station x1 = stations.getStation(l + 1);

                listaStations.AddStation(x);
                listaStations.AddStation(x1);
                if (l < stations.getlen()) {
                    if (l == 1) {
                        Node nx;
                        Node nx1;
                        if (this.graph.getNode(x.getsData()) == null) {
                            nx = this.graph.addNode(x.getsData());
                        } else {
                            nx = this.graph.getNode(x.getsData());
                        }
                        if (this.graph.getNode(x1.getsData()) == null) {
                            nx1 = this.graph.addNode(x1.getsData());
                        } else {
                            nx1 = this.graph.getNode(x1.getsData());
                        }
                        nx.setAttribute("ui.style", "fill-color: #42a4ff;");
                        nx.setAttribute("ui.label", x.getsData());
                        nx1.setAttribute("ui.label", x1.getsData());
                        nx1.setAttribute("ui.style", "fill-color: #42a4ff;");

                    } else {
                        if (x1 != null) {
                            Node nx1;
                            if (this.graph.getNode(x1.getsData()) == null) {
                                nx1 = this.graph.addNode(x1.getsData());
                                nx1.setAttribute("weight", 4.0);
                            } else {
                                nx1 = this.graph.getNode(x1.getsData());
                            }

                            nx1.setAttribute("ui.style", "fill-color: #42a4ff;");
                            nx1.setAttribute("ui.label", x1.getsData());

                        }
                    }
                    String y = x.getsData() + x1.getsData();
                    Edge edd = this.graph.addEdge(y, x.getsData(), x1.getsData());
                    edd.setAttribute("shape", "line");
                }
            }

        }
        for (int i = 1; i <= line.getlen(); i++) {

            List stations = line.getLine(line, i).getStations();
//            System.out.println(line.getLine(line, i).getLname());
            for (int l = 1; l < stations.getlen(); l++) {
//                System.out.println(stations.getStation(l).getsData());
            }
        }

    }

    public void changeColorNodo(Station station) { //station es el nodo que se quiere cambiar de color

        if (graph.getNode(station.getsData()) != null) {
            graph.getNode(station.getsData()).setAttribute("ui.style", "fill-color: red;");
        } else {
            JOptionPane.showMessageDialog(null, "La estación" + station.getsData() + "no existe en el grafo.");
        }
    }

    public void color(String sname) {
        Node nx1;
        nx1 = this.graph.getNode(sname);
        nx1.setAttribute("ui.style", "fill-color: red;");
        nx1.setAttribute("ui.style", "size: 20px, 20px;");
    }

    public List getListaLines() {
        return listaLines;
    }

    public boolean setSucursal(String sname, List listaLines) {

//        for (int j = 1; j < listaLines.getlen(); j++) {
//            List estaciones = listaLines.getLine(listaLines, j).getStations();
        if (listaStations.nameInList(sname)) {
            Station sAux = listaStations.getNamedStation(sname);
            sAux.setSucursal(true);
            Node nx1;
            nx1 = this.graph.getNode(sname);

            if (nx1 != null) {
                nx1.setAttribute("ui.style", "fill-color: #ff42e3;");
                nx1.setAttribute("ui.style", "size: 10px, 10px;");
                lSucursals.AddStation(sAux);
                return true;
            }

        }

//        }
        return false;
    }

    public List BFS(List l, int t, Station s) {
        s.setCover(true);
        int cont = 1;
        List x = s.getconections();
        while (cont <= t) {
            if (cont == 1) {
                for (int i = 1; i <= x.getlen(); i++) {
                    if (l.sInList(x.getStation(i)) == false) {
                        l.AddStation(x.getStation(i));
                    }
                }
            } else {
                for (int i = 1; i <= x.getlen(); i++) {
                    List lAux = this.BFS(l, t - 1, s);
                }
            }
            cont += 1;
        }
        return l;
    }

    public List DFS(List visitedNodes, int t, Station u) {
        u.setCover(true);
        while (t > 0) {
            if (t == 1) {
                int c = 1;
                while (c <= u.getconections().getlen()) {
                    Station sAux = u.getconections().getStation(c);
                    if (visitedNodes.sInListdfs(sAux)) {
                        c += 1;
                    } else {
                        visitedNodes.AddStation(sAux);
                        c += 1;
                    }
                }
                t -= 1;
            } else {
                int k = 1;
                while (k <= u.getconections().getlen()) {
                    Station sAux = u.getconections().getStation(k);
                    if (visitedNodes.sInListdfs(sAux) == false) {
                        visitedNodes.AddStation(sAux);
                        DFS(visitedNodes, t - 1, sAux);
                    }
                    k += 1;
                }
                t -= 1;
            }
        }
        return visitedNodes;
    }

    public void changeCover(List l) {
        for (int i = 1; i <= l.getlen(); i++) {
            Station s = l.getStation(i);
            //buscar el nodo y asignarle un valor de cover
        }
    }

    public List recomendSucursal(int t) {
        List l = new List();
        for (int i = 1; i <= lSucursals.getlen(); i++) {
            Station s = lSucursals.getStation(i);
            List l2 = this.DFS(lSucursals, t + 1, s);
            for (int j = 1; j <= l2.getlen(); j++) {
                if (l2.getStation(j).isCover() == false) {
                    l.AddStation(l2.getStation(j));
                }
            }
        }
        return l;
    }

    public void coveredSucursals(List l) {

        //De ser la primera estacion diferente de null
        Station sAux = l.getsFirst();
        while (sAux != null) {

            sAux.setCover(true);
            Node nx1;
            nx1 = this.graph.getNode(sAux.getsData());
            nx1.setAttribute("ui.style", "fill-color: #1a9136;");
            sAux = sAux.getNext();
        }

    }

    public void CreateNode(String s) {
        Node nx1 = this.graph.addNode(s);
        nx1.setAttribute("ui.style", "fill-color: #42a4ff;");
        nx1.setAttribute("ui.label", s);
    }

    public void CreateEdfe(String s, String station) {
        Node nx = this.graph.getNode(station);
        Node nx1 = this.graph.getNode(s);

        String y = s + station;
        Edge edd = this.graph.addEdge(y, s, station);
        edd.setAttribute("shape", "line");
    }
}
