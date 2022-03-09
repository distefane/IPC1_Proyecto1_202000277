package com.mycompany.pruebaswing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ReporU extends JFrame {
    Usuarios m = new Usuarios();
    
    JTextArea verr;
    JButton regresarr;
    JPanel fondor = new JPanel();
    
    public void ReporU() {
        //Marco
        setSize(700, 400);
        setLayout(null);
        setTitle("Reportes Usuarios");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(fondor);
        fondor.setLayout(null);
        fondor.setSize(700, 400);
        fondor.setVisible(true);
        
        String[] columnasu = {"ID", "NOMBRE", "APELLIDO", "USUARIO", "ROL", "CONTRASEÑA", "CONFIRMAR"};
        
        verr = new JTextArea();
        verr.setBackground(Color.LIGHT_GRAY);
        JScrollPane bs = new JScrollPane(verr);
        bs.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        bs.setBounds(90, 50, 500, 200);
        fondor.add(bs);
        bs.setVisible(true);

        regresarr = new JButton("Atrás");
        regresarr.setBounds(400, 290, 100, 20);
        fondor.add(regresarr);
        regresarr.setVisible(true);

        ActionListener iratrass = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SesionAdmin u = new SesionAdmin();
                u.SesionAdmin();
                dispose();
            }
        };

        //Acción regresar 
        regresarr.addActionListener(iratrass);
    }
}
