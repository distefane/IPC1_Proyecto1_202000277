/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaswing;

import javax.swing.*;

/**
 *
 * @author USER
 */
public class FormVer extends JFrame {
    Usuarios m = new Usuarios();
    JTable MostrarU;
    JLabel listado;
    JPanel panver = new JPanel();
    JScrollPane paneltablau;
    
    public void FormVer() {

        //Marco
        setSize(1100, 700);
        setLayout(null);
        setTitle("Ver Usuarios");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(panver);
        panver.setLayout(null);
        panver.setSize(1100, 700);
        panver.setVisible(true);
        
        //Etiqueta
        listado = new JLabel("Listado de Usuarios Registrados en el Sistema");
        listado.setBounds(50, 50, 300, 20);
        panver.add(listado);
        listado.setVisible(true);

        //Tabla donde se muestren los Usuarios ingresados por parte del admin
        panver.add(m.mdpanel);
        m.mdpanel.setVisible(true);
    }

}
