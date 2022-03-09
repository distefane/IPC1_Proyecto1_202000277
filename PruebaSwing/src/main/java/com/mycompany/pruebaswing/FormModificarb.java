package com.mycompany.pruebaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormModificarb extends JFrame {

    JButton buscarbi;
    JButton modbi;
    JButton cancelarregresar;

    int filas = 0;
    
    JLabel autorbib, areabib;
    JLabel titulobib;
    JLabel edicionbib;
    JLabel descripcionbib;
    JLabel tipobib;
    JLabel temasbib;
    JLabel frecuenciabib;
    JLabel ejemplaresbib;
    JLabel copiasbib;
    JLabel disponiblesbib;

    JTextField bustit, aut, tit, edi, des, tip, tem, frec, ejem, copi, disp, ar;

    JComboBox tipobi;

    Bibliografias t = new Bibliografias();

    JPanel panelbib = new JPanel();

    public void FormModificarb() {
        //Marco
        setSize(500, 730);
        setLayout(null);
        setTitle("Modificar Bibliografía");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(panelbib);
        panelbib.setLayout(null);
        panelbib.setVisible(true);
        panelbib.setSize(500, 730);

        //Etiquetas
        autorbib = new JLabel("Autor: ");
        autorbib.setBounds(80, 80, 120, 20);
        panelbib.add(autorbib);
        autorbib.setVisible(true);

//        titulobib = new JLabel("Título: ");
//        titulobib.setBounds(80, 130, 120, 20);
//        panelbib.add(titulobib);
//        titulobib.setVisible(true);

        edicionbib = new JLabel("Edición: ");
        edicionbib.setBounds(80, 180, 120, 20);
        panelbib.add(edicionbib);
        edicionbib.setVisible(true);

//        tipobib = new JLabel("Tipo: ");
//        tipobib.setBounds(80, 230, 120, 20);
//        panelbib.add(tipobib);
//        tipobib.setVisible(true);

        descripcionbib = new JLabel("Descripción: ");
        descripcionbib.setBounds(80, 280, 120, 20);
        panelbib.add(descripcionbib);
        descripcionbib.setVisible(true);

        temasbib = new JLabel("Temas: ");
        temasbib.setBounds(80, 330, 120, 20);
        panelbib.add(temasbib);
        temasbib.setVisible(true);

        frecuenciabib = new JLabel("Frecuencia: ");
        frecuenciabib.setBounds(80, 380, 120, 20);
        panelbib.add(frecuenciabib);
        frecuenciabib.setVisible(true);

        ejemplaresbib = new JLabel("Ejemplares: ");
        ejemplaresbib.setBounds(80, 430, 120, 20);
        panelbib.add(ejemplaresbib);
        ejemplaresbib.setVisible(true);

        copiasbib = new JLabel("Copias: ");
        copiasbib.setBounds(80, 480, 120, 20);
        panelbib.add(copiasbib);
        copiasbib.setVisible(true);

        disponiblesbib = new JLabel("Disponibles: ");
        disponiblesbib.setBounds(80, 530, 120, 20);
        panelbib.add(disponiblesbib);
        disponiblesbib.setVisible(true);

        areabib = new JLabel("Área: ");
        areabib.setBounds(80, 580, 120, 20);
        panelbib.add(areabib);
        areabib.setVisible(true);

        //Campos Escritura
        bustit = new JTextField();
        bustit.setBounds(200, 30, 220, 20);
        panelbib.add(bustit);
        bustit.setVisible(true);

        aut = new JTextField();
        aut.setBounds(200, 80, 220, 20);
        panelbib.add(aut);
        aut.setVisible(true);

//        tit = new JTextField();
//        tit.setBounds(200, 130, 220, 20);
//        panelbib.add(tit);
//        tit.setVisible(true);

        edi = new JTextField();
        edi.setBounds(200, 180, 220, 20);
        panelbib.add(edi);
        edi.setVisible(true);

        des = new JTextField();
        des.setBounds(200, 280, 220, 20);
        panelbib.add(des);
        des.setVisible(true);

//        String[] tiposss = {"Libro", "Revista", "Tesis"};
//        tipobi = new JComboBox(tiposss);
//        tipobi.setBounds(200, 280, 220, 20);
//        panelbib.add(tipobi);
//        tipobi.setVisible(true);

        tem = new JTextField();
        tem.setBounds(200, 330, 220, 20);
        panelbib.add(tem);
        tem.setVisible(true);

        frec = new JTextField();
        frec.setBounds(200, 380, 220, 20);
        panelbib.add(frec);
        frec.setVisible(true);

        ejem = new JTextField();
        ejem.setBounds(200, 430, 220, 20);
        panelbib.add(ejem);
        ejem.setVisible(true);

        copi = new JTextField();
        copi.setBounds(200, 480, 220, 20);
        panelbib.add(copi);
        copi.setVisible(true);

        disp = new JTextField();
        disp.setBounds(200, 530, 220, 20);
        panelbib.add(disp);
        disp.setVisible(true);

        ar = new JTextField();
        ar.setBounds(200, 580, 220, 20);
        panelbib.add(ar);
        ar.setVisible(true);

        //Botón Modificar
        modbi = new JButton();
        modbi.setText("Modificar");
        modbi.setBounds(70, 630, 120, 20);
        panelbib.add(modbi);
        modbi.setVisible(true);

        ActionListener accionmodificar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                t.sd[filas][2] = aut.getText();
                t.sd[filas][4] = edi.getText();
                t.sd[filas][5] = des.getText();
               t.sd[filas][7] = ar.getText();
               t.sd[filas][8] = frec.getText();
                t.sd[filas][9] = ejem.getText();
                t.sd[filas][10] = copi.getText();
               t.sd[filas][11] = disp.getText();

                FormVerb j = new FormVerb();
                j.FormVerb();
            }
        };

        //Botón Buscar
        buscarbi = new JButton();
        buscarbi.setText("Buscar");
        buscarbi.setBounds(70, 30, 120, 20);
        panelbib.add(buscarbi);
        buscarbi.setVisible(true);

        ActionListener accionbuscar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < t.sd.length; i++) {
                    if (bustit.getText().equals(t.sd[i][3].toString())) {
                        aut.setText(t.sd[i][2].toString());
                        edi.setText(t.sd[i][4].toString());
                        des.setText(t.sd[i][5].toString());
                        ar.setText(t.sd[i][7].toString());
                        frec.setText(t.sd[i][8].toString());
                        ejem.setText(t.sd[i][9].toString());
                        copi.setText(t.sd[i][10].toString());
                        disp.setText(t.sd[i][11].toString());
                        filas = i;
                        break;

                    }
                }

            }
        };

        //Botón Cancelar
        cancelarregresar = new JButton();
        cancelarregresar.setText("Cancelar");
        cancelarregresar.setBounds(300, 630, 120, 20);
        panelbib.add(cancelarregresar);
        cancelarregresar.setVisible(true);

        ActionListener cerrarreg = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };

        //Acción cerrar 
        cancelarregresar.addActionListener(cerrarreg);
        modbi.addActionListener(accionmodificar);
        buscarbi.addActionListener(accionbuscar);

    }

}
