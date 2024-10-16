/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoedd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class ReadJSON {
    private String text;

    public ReadJSON() {
    }
        
    
    public void abrirArchivo() {
        String aux="";   
        setText("");
        try
        {
         /**llamamos el metodo que permite cargar la ventana*/
         JFileChooser file=new JFileChooser();
         file.showOpenDialog(file);
         /**abrimos el archivo seleccionado*/
         File abre=file.getSelectedFile();

         /**recorremos el archivo, lo leemos para plasmarlo
         *en el area de texto*/
         if(abre!=null)
         {     
            FileReader archivos=new FileReader(abre);
            BufferedReader lee =new BufferedReader(archivos);
            while((aux=lee.readLine())!=null)
            {
                    setText(getText() + aux+ "\n");
            }
               lee.close();
          }    
         }
         catch(IOException ex)
         {
           JOptionPane.showMessageDialog(null,ex+"" +
                 "\nNo se ha encontrado el archivo",
                       "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
          }
        
      }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    
}
