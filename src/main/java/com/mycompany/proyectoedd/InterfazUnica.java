/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoedd;

import java.awt.Component;
import java.awt.GridLayout;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    int t;

    /**
     * Creates new form InterfazUnica
     */
    /**
     * Constructor de la clase InterfazUnica. Crea una interfaz gráfica con 5
     * tabs y la visualización de un gráfo.
     *
     * @author Nathaly
     *
     */
    public InterfazUnica() {
        this.L = new ReadJSON();
        this.G = new Grafo();
        this.t = 0;
        initComponents();
        Tval.setEditable(false);
        Tval2.setEditable(false);

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
        B_changeT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tval = new javax.swing.JTextPane();
        jPanel10 = new javax.swing.JPanel();
        input_nameLine = new javax.swing.JTextField();
        input_numberStation = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        B_addNewLine = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        B_AñadirSucursal = new javax.swing.JButton();
        B_ELiminarSucursal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        B_CoberturaStation = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        B_CoberturaTotal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tval2 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        B_CoberturaTotal1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(204, 246, 242));

        B_carga_JSON.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        B_carga_JSON.setText("Cargar JSON");
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
                .addContainerGap(337, Short.MAX_VALUE)
                .addComponent(B_carga_JSON, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        jTabbedPane2.addTab("JSON", jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 255, 231));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel3.setText("Valor T :");

        B_changeT.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        B_changeT.setText("Cambiar");
        B_changeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_changeTActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(Tval);

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(B_changeT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(B_changeT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(B_addNewLine, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane2.addTab("Línea", jPanel10);

        jPanel2.setBackground(new java.awt.Color(204, 229, 255));

        B_AñadirSucursal.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        B_AñadirSucursal.setText("Añadir");
        B_AñadirSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AñadirSucursalActionPerformed(evt);
            }
        });

        B_ELiminarSucursal.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        B_ELiminarSucursal.setText("Eliminar");
        B_ELiminarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ELiminarSucursalActionPerformed(evt);
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
                        .addComponent(B_AñadirSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(B_ELiminarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_AñadirSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_ELiminarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jTabbedPane2.addTab("Sucursal", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 235, 213));

        B_CoberturaStation.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        B_CoberturaStation.setText("Buscar");
        B_CoberturaStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CoberturaStationActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setText("Cobertura de una Estacion");

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setText("Cobertura Total");

        B_CoberturaTotal.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        B_CoberturaTotal.setText("Buscar");
        B_CoberturaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CoberturaTotalActionPerformed(evt);
            }
        });

        jLabel8.setText("T--->");

        jScrollPane1.setViewportView(Tval2);

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setText("Recomendar Sucursales");

        B_CoberturaTotal1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        B_CoberturaTotal1.setText("Recomendar");
        B_CoberturaTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CoberturaTotal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(B_CoberturaStation))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(B_CoberturaTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(B_CoberturaTotal1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_CoberturaStation)
                .addGap(91, 91, 91)
                .addComponent(jLabel7)
                .addGap(53, 53, 53)
                .addComponent(B_CoberturaTotal)
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addComponent(B_CoberturaTotal1)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cobertura", jPanel1);

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

    /**
     * Eliminar Sucursal. Muestra en el grafo el nodo de la estación del color
     * original, demostrando que ya no hay una sucursal ene sa estación.
     *
     * @author Nathaly
     *
     * @param evt
     */

    private void B_ELiminarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ELiminarSucursalActionPerformed

        String stationName = JOptionPane.showInputDialog(this, "Escribe el nombre de la station donde deseas eliminar una sucursal: ");

        if ((G.deleteSucursal(stationName, listaLines))) { //eliminar esa estacion a la lista de sucursales
            JOptionPane.showMessageDialog(this, "Se ha eliminado la sucursal");

        } else {
            JOptionPane.showMessageDialog(this, "No se ha encontrado la sucursal");
        }

    }//GEN-LAST:event_B_ELiminarSucursalActionPerformed

    /**
     * descripcion
     *
     * @author gcosta
     *
     * @param evt
     */

    private void B_AñadirSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AñadirSucursalActionPerformed

        String stationName = JOptionPane.showInputDialog(this, "Escribe el nombre de la station donde deseas colocar una sucursal: ");

        if ((G.setSucursal(stationName, listaLines, t))) { //añadir esa estacion a la lista de sucursales
            JOptionPane.showMessageDialog(this, "Se ha agregado la sucursal");

        } else {
            JOptionPane.showMessageDialog(this, "No se ha encontrado la sucursal");
        }


    }//GEN-LAST:event_B_AñadirSucursalActionPerformed

    /**
     * Añadir una nueva línea. Se crea una nueva línea de metro agregando todas
     * las nuevas estaciones con sus respectivas conexiones.
     *
     * @author Nathaly
     *
     * @param evt
     */

    private void B_addNewLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_addNewLineActionPerformed

        String lineName = input_nameLine.getText();
        String Snumber = input_numberStation.getText();

        try {

            int num = Integer.parseInt(Snumber);

            List newlstations = new List();
            Line newline = new Line(lineName);
            String id = "";

            for (int i = 0; i < num; i++) {
                String stationName = JOptionPane.showInputDialog(this, "Escribe el nombre de la nueva estation: "); //agregar que cada nombre es una station (volver objects)
                Station newstation = new Station(stationName, lineName);
                G.CreateNode(stationName);

                if (newlstations.getsFirst() != null) {
                    G.CreateEdfe(id, stationName);
                    id = stationName;
                } else {
                    id = stationName;
                }
                int cStation = JOptionPane.showConfirmDialog(this, "Desea añadir una conección a esta estación: ");

                if (cStation == 0) {
                    String cs = JOptionPane.showInputDialog(this, "Escribe el nombre de la estation: ");

                    for (int j = 1; j < listaLines.getlen(); j++) {
                        List estaciones = listaLines.getLine(listaLines, j).getStations();

                        if (estaciones.nameInList(cs)) {
                            Station sExists = estaciones.getNamedStation(cs);
                            newstation.conect(sExists);
                            G.CreateEdfe(cs, stationName);
                        }
                    }
                }
                newlstations.AddStation(newstation);
                newline.getStations().AddStation(newstation);
                G.getListaStations().AddStation(newstation);

            }
            this.listaLines.AddLine(newline);
            JOptionPane.showMessageDialog(this, "Se ha añadido una linea nueva");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Por favor ingrese un numero");

        }


    }//GEN-LAST:event_B_addNewLineActionPerformed

    /**
     * Permite cargar el grafo en la interfaz a traves del boton
     *
     * @author gcosta
     *
     * @param evt
     */

    private void B_carga_JSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_carga_JSONActionPerformed

        G.graph.clear();

        L.abrirArchivo();
        if (L.isValid()) {
            listaLines = L.Parse();
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
     * Boton para mostrar la cobertura de una estacion
     *
     * @author gcosta
     *
     * @param evt
     */

    private void B_CoberturaStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CoberturaStationActionPerformed

        String stationName = JOptionPane.showInputDialog(this, "Escribe el nombre de la sucursal que desea ver cobertura");
        if (G.getlSucursals().nameInList(stationName)) {
            Object[] options = {"DFS", "BFS"};
            JPanel panel = new JPanel();
            int opciones = JOptionPane.showOptionDialog(null, panel, "Que método quieres usar: DFS o BFS ", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
            if (opciones == JOptionPane.YES_OPTION) {

                for (int j = 1; j < listaLines.getlen(); j++) {
                    List estaciones = listaLines.getLine(listaLines, j).getStations();
                    if (estaciones.nameInList(stationName)) {
                        Station sExists = estaciones.getNamedStation(stationName);
                        List temporal = new List();
                        List ayuda = G.DFS(temporal, t, sExists);
                        System.out.println(ayuda.getlen());
                        G.coveredSucursals(G.DFS(temporal, t, sExists));

                    }
                }

            } else {
                for (int j = 1; j < listaLines.getlen(); j++) {
                    List estaciones = listaLines.getLine(listaLines, j).getStations();
                    if (estaciones.nameInList(stationName)) {
                        Station sExists = estaciones.getNamedStation(stationName);
                        List temporal = new List();

                        G.coveredSucursals(G.DFS(temporal, t, sExists));
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha encontrado la sucursal");
        }


    }//GEN-LAST:event_B_CoberturaStationActionPerformed

    /**
     * muestra la cobertura total
     *
     * @author gcosta
     *
     * @param evt
     */
    private void B_CoberturaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CoberturaTotalActionPerformed
        G.TotalCover(t);
    }//GEN-LAST:event_B_CoberturaTotalActionPerformed

    /**
     * cambia el valor de la T, mostrandolo en la interfaz
     *
     * @author Nathaly
     *
     * @param evt
     */

    private void B_changeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_changeTActionPerformed
        String st = JOptionPane.showInputDialog(this, "Escribe el valor de la T ");
        try {
            t = (parseInt(st));
            Tval.setText(st);
            Tval2.setText(st);
            G.cambioT(t);
            JOptionPane.showMessageDialog(this, "El cambio de la T dejara de mostrar las estaciones cubiertas");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Por favor ingrese un numero");

        }


    }//GEN-LAST:event_B_changeTActionPerformed
  /**
     * muestra las recomendaciones de sucursal
     *
     * @author gcosta
     *
     * @param evt
     */
    private void B_CoberturaTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CoberturaTotal1ActionPerformed
        // TODO add your handling code here:
        List recomendados = G.recomendSucursal(t);
        String xx = "";
        for (int i = 1; i <= recomendados.getlen(); i++) {
            Station s = recomendados.getStation(i);

            xx += s.getsData() + "\n";

        }
        JOptionPane.showMessageDialog(this, xx);
    }//GEN-LAST:event_B_CoberturaTotal1ActionPerformed

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
    private javax.swing.JButton B_AñadirSucursal;
    private javax.swing.JButton B_CoberturaStation;
    private javax.swing.JButton B_CoberturaTotal;
    private javax.swing.JButton B_CoberturaTotal1;
    private javax.swing.JButton B_ELiminarSucursal;
    private javax.swing.JButton B_addNewLine;
    private javax.swing.JButton B_carga_JSON;
    private javax.swing.JButton B_changeT;
    private javax.swing.JTextPane Tval;
    private javax.swing.JTextPane Tval2;
    private javax.swing.JTextField input_nameLine;
    private javax.swing.JTextField input_numberStation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
