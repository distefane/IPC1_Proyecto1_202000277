package com.mycompany.pruebaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormEliminarb extends JFrame {

    Bibliografias l = new Bibliografias();

    int filab = 0;
    int columnab = 0;

    JButton buscarb, eliminarb, cancelarb;

    JLabel autorb, titulob, edicionb, tipob;

    JTextField buscartitulo, datoautor, datoedicion, datodescripcion;

    JComboBox tipobi;

    JPanel panelb = new JPanel();

    public void FormEliminarb() {

        //Marco
        setSize(500, 700);
        setLayout(null);
        setTitle("Eliminar Usuario");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(panelb);
        panelb.setLayout(null);
        panelb.setVisible(true);
        panelb.setSize(500, 700);

        //Etiquetas
        titulob = new JLabel("Autor: ");
        titulob.setBounds(80, 160, 120, 20);
        panelb.add(titulob);
        titulob.setVisible(true);

        autorb = new JLabel("Título: ");
        autorb.setBounds(80, 230, 120, 20);
        panelb.add(autorb);
        autorb.setVisible(true);

        edicionb = new JLabel("Edición: ");
        edicionb.setBounds(80, 300, 120, 20);
        panelb.add(edicionb);
        edicionb.setVisible(true);

//        tipob = new JLabel("Tipo: ");
//        tipob.setBounds(80, 370, 120, 20);
//        panelb.add(tipob);
//        tipob.setVisible(true);

        //Campos Escritura
        buscartitulo = new JTextField();
        buscartitulo.setBounds(200, 30, 220, 20);
        panelb.add(buscartitulo);
        buscartitulo.setVisible(true);

        datoautor = new JTextField();
        datoautor.setBounds(200, 160, 220, 20);
        panelb.add(datoautor);
        datoautor.setVisible(true);
//CORREGIR LABELS

        datodescripcion = new JTextField();
        datodescripcion.setBounds(200, 230, 220, 20);
        panelb.add(datodescripcion);
        datodescripcion.setVisible(true);

        datoedicion = new JTextField();
        datoedicion.setBounds(200, 300, 220, 20);
        panelb.add(datoedicion);
        datoedicion.setVisible(true);

//        String[] tipos = {"Libro", "Revista", "Tesis"};
//        tipobi = new JComboBox(tipos);
//        tipobi.setBounds(200, 370, 220, 20);
//        panelb.add(tipobi);
//        tipobi.setVisible(true);
//        l.ObtenerBibliografias();
//        panelb.add(l.paneltablab);
//        l.paneltablab.setVisible(true);
        //Botón Crear
        eliminarb = new JButton();
        eliminarb.setText("Eliminar");
        eliminarb.setBounds(70, 590, 120, 20);
        panelb.add(eliminarb);
        eliminarb.setVisible(true);

        ActionListener accioneliminar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                l.sd[filab][1] = l.sd[filab+1][1];
                l.sd[filab][2] = l.sd[filab+1][2];
                l.sd[filab][3] = l.sd[filab+1][3];
                l.sd[filab][4] = l.sd[filab+1][4];
                l.sd[filab][5] = l.sd[filab+1][5];
                l.sd[filab][6] = l.sd[filab+1][6];
                l.sd[filab][7] = l.sd[filab+1][7];
                l.sd[filab][8] = l.sd[filab+1][8];
                l.sd[filab][9] = l.sd[filab+1][9];
                l.sd[filab][10] = l.sd[filab+1][10];
                l.sd[filab][11] = l.sd[filab+1][11];
                
                l.sd[filab+1][0] = null;
                l.sd[filab+1][1] = null;
                l.sd[filab+1][2] = null;
                l.sd[filab+1][3] = null;
                l.sd[filab+1][4] = null;
                l.sd[filab+1][5] = null;
                l.sd[filab+1][6] = null;
                l.sd[filab+1][7] = null;
                l.sd[filab+1][8] = null;
                l.sd[filab+1][9] = null;
                l.sd[filab+1][10] = null;
                l.sd[filab+1][11] = null;
                
                l.lapiz = l.lapiz - 1;
            }
        };

        //Botón Buscar
        buscarb = new JButton();
        buscarb.setText("Buscar");
        buscarb.setBounds(70, 30, 120, 20);
        panelb.add(buscarb);
        buscarb.setVisible(true);

        ActionListener accionbuscar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscartitulo.getText();
                for (int i = 0; i < l.sd.length; i++) {
                    if (buscartitulo.getText().equals(l.sd[i][3])) {
                        datoautor.setText(l.sd[i][2].toString());
                        datoautor.setEnabled(false);
                        datoedicion.setText(l.sd[i][4].toString());
                        datoedicion.setEnabled(false);
                        datodescripcion.setText(l.sd[i][5].toString());
                        datodescripcion.setEnabled(false);
                        filab = i;
                        break;

                    }
                }

            }
        };

        //Botón Cancelar
        cancelarb = new JButton();
        cancelarb.setText("Cancelar");
        cancelarb.setBounds(300, 590, 120, 20);
        panelb.add(cancelarb);
        cancelarb.setVisible(true);

        ActionListener cerrarb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };

        //Acción cerrar 
        cancelarb.addActionListener(cerrarb);
        eliminarb.addActionListener(accioneliminar);
        buscarb.addActionListener(accionbuscar);

    }

}
