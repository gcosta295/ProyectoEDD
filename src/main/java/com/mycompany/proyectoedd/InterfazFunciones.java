/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;

/**
 *
 * @author Nathaly
 */
public class InterfazFunciones {
    
    private static Grafo graf1 = null;
    private List listaLines1;

    public Grafo getGraf1() {
        return graf1;
    }

    public InterfazFunciones(List listaLines1) {
        this.listaLines1 = listaLines1;
    }
    
    public void setGraf1(Grafo graf1) {
        InterfazFunciones.graf1 = graf1;
    }

    public List getListaLines1() {
        return listaLines1;
    }

    public void setListaLines1(List listaLines1) {
        this.listaLines1 = listaLines1;
    }
    
    public static void Seguir(){
//        W2_T ventana = new W2_T();
//        ventana.setVisible(true);
//        W1.setVisible(false);
//        
    }
    
    
    
}
