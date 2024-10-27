/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoedd;

import static com.mycompany.proyectoedd.WLine.listaLines;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author Nathaly
 */
public class InterfazUnica extends javax.swing.JFrame {

    ReadJSON L;
    List listaLines;
    Grafo G;

    /**
     * Creates new form InterfazUnica
     */
    public InterfazUnica() {
        this.L = new ReadJSON();
        this.G = new Grafo();
        initComponents();

    }

    public void setListaLines(List listaLines) {
        this.listaLines = listaLines;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        B_carga_JSON = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        input_valorT = new javax.swing.JTextField();
        B_changeT = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        input_nameLine = new javax.swing.JTextField();
        input_numberStation = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        B_addNewLine = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(204, 246, 242));

        B_carga_JSON.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        B_carga_JSON.setText("Cagar JSON");
        B_carga_JSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_carga_JSONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(B_carga_JSON, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(363, Short.MAX_VALUE)
                .addComponent(B_carga_JSON, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        jTabbedPane2.addTab("JSON", jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 255, 231));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel3.setText("Valor T :");

        B_changeT.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        B_changeT.setText("Cambiar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(input_valorT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(B_changeT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_valorT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52)
                .addComponent(B_changeT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("T", jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 249, 253));

        input_nameLine.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        input_numberStation.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel1.setText("Nombre de la Línea: ");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel2.setText("N° de paradas: ");

        B_addNewLine.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        B_addNewLine.setText("Añadir Línea");
        B_addNewLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_addNewLineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_nameLine, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_numberStation, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(B_addNewLine)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_nameLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_numberStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(B_addNewLine, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane2.addTab("Línea", jPanel10);

        jPanel2.setBackground(new java.awt.Color(204, 229, 255));

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Quieres añadir una sucursal");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setText("Quieres eleminar una sucursal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jTabbedPane2.addTab("Sucursal", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 789, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        String stationName = JOptionPane.showInputDialog(this, "Escribe el nombre de la station donde deseas eliminar una sucursal: ");
        String tbusqueda = JOptionPane.showInputDialog(this, "Que método quieres usar: DFS o BFS ");
    }//GEN-LAST:event_EliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String stationName = JOptionPane.showInputDialog(this, "Escribe el nombre de la station donde deseas colocar una sucursal: ");
        String tbusqueda = JOptionPane.showInputDialog(this, "Que método quieres usar: DFS o BFS ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void B_addNewLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_addNewLineActionPerformed

        String lineName = input_nameLine.getText();

        String Snumber = input_numberStation.getText();
        int num = Integer.parseInt(Snumber);

        List newlstations = new List();
        Line newline = new Line(lineName);
        for (int i = 0; i < num; i++) {
            String stationName = JOptionPane.showInputDialog(this, "Escribe el nombre de la nueva estation: "); //agregar que cada nombre es una station (volver objects)
            Station newstation = new Station(stationName, lineName);
            int cStation = JOptionPane.showConfirmDialog(this, "Desea añadir una conección a esta estación: ");
            if (cStation == 0) {
                String cs = JOptionPane.showInputDialog(this, "Escribe el nombre de la estation: ");
                for (int j = 1; j < listaLines.getlen(); j++) {
                    List estaciones = listaLines.getLine(listaLines, j).getStations();
                    if (estaciones.nameInList(cs)){
                        Station sExists = estaciones.getNamedStation(cs);
                        newstation.conect(sExists);
                    }
                }
            }
            newlstations.AddStation(newstation);
            newline.getStations().AddStation(newstation); //se esta añadiendo una sola vez en la lista
            System.out.println(newline.getStations().getlen()); //l1.listastations.nodo

        }
        System.out.println(this.listaLines.getlen());
        this.listaLines.AddLine(newline); //ayuda dice que la lista es null //no esta tomando la lista vieja
//        System.out.println(this.listaLines.getlen());

        JOptionPane.showMessageDialog(this, "Se ha añadido una linea nueva");
    }//GEN-LAST:event_B_addNewLineActionPerformed

    private void B_carga_JSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_carga_JSONActionPerformed
        G.graph.clear();
        
        L.abrirArchivo();
        if (L.isValid()){
            listaLines = L.Parse();

            //        System.out.println(this.listaLines.getLen());
            System.setProperty("org.graphstream.ui", "swing");
            G.Graph(listaLines);
            Viewer viewer = new Viewer(G.getGraph(), Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
            viewer.enableAutoLayout();
            View view = viewer.addDefaultView(false);
            setLayout(new GridLayout());
            add((Component) view, GridLayout.class);
            viewer.enableAutoLayout();

            JOptionPane.showMessageDialog(this, "Se ha cargado el JSON");
        }
    }//GEN-LAST:event_B_carga_JSONActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazUnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazUnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazUnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazUnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUnica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_addNewLine;
    private javax.swing.JButton B_carga_JSON;
    private javax.swing.JButton B_changeT;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField input_nameLine;
    private javax.swing.JTextField input_numberStation;
    private javax.swing.JTextField input_valorT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
