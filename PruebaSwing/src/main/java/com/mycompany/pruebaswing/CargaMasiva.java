package com.mycompany.pruebaswing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CargaMasiva extends JFrame {

    JTextArea hacercarga;
    JButton crearbm, atrasm;
    JPanel fondo = new JPanel();

    public void CargaMasiva() {
        //Marco
        setSize(700, 400);
        setLayout(null);
        setTitle("Carga Masiva de Bibliografía");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(fondo);
        fondo.setLayout(null);
        fondo.setSize(700, 400);
        fondo.setVisible(true);

        hacercarga = new JTextArea();
        hacercarga.setBackground(Color.LIGHT_GRAY);
        JScrollPane bs = new JScrollPane(hacercarga);
        bs.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        bs.setBounds(90, 50, 500, 200);
        fondo.add(bs);
        bs.setVisible(true);

        //Botones crear y atrás
        crearbm = new JButton("Crear");
        crearbm.setBounds(200, 290, 100, 20);
        fondo.add(crearbm);
        crearbm.setVisible(true);

        ActionListener crearbib = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ingreso = hacercarga.getText();
                RealizarMasiva(ingreso);
            }
        };

        crearbm.addActionListener(crearbib);

        atrasm = new JButton("Atrás");
        atrasm.setBounds(400, 290, 100, 20);
        fondo.add(atrasm);
        atrasm.setVisible(true);

        ActionListener iratras = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SesionAdmin u = new SesionAdmin();
                u.SesionAdmin();
                dispose();
            }
        };

        //Acción regresar 
        atrasm.addActionListener(iratras);
    }

    public void RealizarMasiva(String txtingresado) {
        String[] lineastxt = txtingresado.split("\n");

        for (String linea : lineastxt) {
            String[] atributos = linea.split("-"); //Cada línea se debe separar en otras sub cadenas para obtener los atributos separados por(";")

            if (atributos.length == 7) { //Las cadénas válidas de acuerdo con la entrada del usuario, deben contener 9 atributos separados por(";")

                Bibliografias nuevaB = new Bibliografias();
                nuevaB.sd[nuevaB.lapiz][1] = atributos[1];
                nuevaB.sd[nuevaB.lapiz][2] = atributos[2];
                nuevaB.sd[nuevaB.lapiz][3] = atributos[3];
                nuevaB.sd[nuevaB.lapiz][4] = atributos[4];
                nuevaB.sd[nuevaB.lapiz][5] = atributos[5];
                nuevaB.sd[nuevaB.lapiz][6] = atributos[6];
                nuevaB.sd[nuevaB.lapiz][7] = atributos[7];
                nuevaB.sd[nuevaB.lapiz][8] = atributos[8];
                nuevaB.sd[nuevaB.lapiz][9] = atributos[9];
                nuevaB.sd[nuevaB.lapiz][10] = atributos[10];
                nuevaB.sd[nuevaB.lapiz][11] = atributos[11];

            }
        }

    }
}
