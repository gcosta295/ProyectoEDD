/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author astv06
 */
class Grafo {
    private List<List> lines;

    public Grafo() {
        this.lines = new ArrayList<>();
    }

    public List<List> getLines() {
        return lines;
    }

    public void addLine(List line) {
        lines.add(line);
    }

}
