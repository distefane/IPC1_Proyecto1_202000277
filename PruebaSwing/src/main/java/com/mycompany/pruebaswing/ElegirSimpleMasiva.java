package com.mycompany.pruebaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ElegirSimpleMasiva extends JFrame {

    JPanel elebas;
    JLabel pregunta;
    JButton masiva;
    JButton simple;

    public void ElegirSimpleMasiva() {
        //Ventana
        elebas = new JPanel();
        //Marco
        setSize(300, 300);
        setLayout(null);
        setTitle("Tipo de Carga");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(elebas);
        elebas.setLayout(null);
        elebas.setSize(400, 400);
        elebas.setVisible(true);

        //Etiquetas
        pregunta = new JLabel("¿Qué tipo de carga desea hacer?");
        pregunta.setBounds(50, 40, 200, 20);
        elebas.add(pregunta);
        pregunta.setVisible(true);

        //Botones
        simple = new JButton("Individual");
        simple.setBounds(45, 90, 200, 50);
        elebas.add(simple);
        simple.setVisible(true);

        ActionListener elegirindividual = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CargaIndividual i = new CargaIndividual();
                i.CargaIndividual();
                dispose();
            }
        };
        simple.addActionListener(elegirindividual);

        masiva = new JButton("Masiva");
        masiva.setBounds(45, 170, 200, 50);
        elebas.add(masiva);
        masiva.setVisible(true);

        ActionListener elegirmasiva = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CargaMasiva c = new CargaMasiva();
                c.CargaMasiva();
                dispose();
            }
        };
        masiva.addActionListener(elegirmasiva);

    }

}
