package com.mycompany.pruebaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CargaIndividual extends JFrame {

    boolean opcion = false;
    
    JComboBox tipodoc;
    JPanel basecarga = new JPanel();
    
    String[] temasb = new String[200];
    
    JLabel tipo1;
    JLabel autor1;
    JLabel titulo1;
    JLabel edicion1;
    JLabel descripcion1;
    JLabel temas1;
    JLabel frecuencia1;
    JLabel ejemplares1;
    JLabel copias1;
    JLabel disponibles1;
    JButton crearbi;
    JButton atras;

    JTextField area;
    JTextField autor;
    JTextField titulo;
    JTextField edicion;
    JLabel area1;
    JTextField descripcion;
    JTextField temas;
    JTextField frecuencia;
    JTextField ejemplares;
    JTextField copias;
    JTextField disponibles;

    
    int lapiz = 0;
    
    Bibliografias b = new Bibliografias();
    
    
    JTable insertarb;
    
    public void CargaIndividual() {

        //Marco
        setSize(700, 700);
        setLayout(null);
        setTitle("Carga individual de Bibliografía");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(basecarga);
        basecarga.setLayout(null);
        basecarga.setSize(700, 700);
        basecarga.setVisible(true);

        //ComboBox
        String[] tipos = {"Libro", "Revista", "Tesis"};
        tipodoc = new JComboBox(tipos);
        tipodoc.setBounds(130, 50, 100, 20);
        basecarga.add(tipodoc);
        tipodoc.setVisible(true);
        tipodoc.getSelectedItem().toString();
        
        while (opcion = false) {
            
            switch (tipodoc.getSelectedItem().toString()) {
                case "Libro" -> {
                    area.setVisible(false);
                    ejemplares.setVisible(false);
                    frecuencia.setVisible(false);
                }
                case "Revista" -> area.setVisible(false);
                case "Tesis" -> {
                    area.setVisible(true);
                    ejemplares.setVisible(false);
                    frecuencia.setVisible(false);
                }
                default -> {
                }
            }
            }
        
        //Etiquetas
        tipo1 = new JLabel("Tipo: ");
        tipo1.setBounds(85, 50, 50, 20);
        basecarga.add(tipo1);
        tipo1.setVisible(true);

        autor1 = new JLabel("Autor: ");
        autor1.setBounds(85, 150, 50, 20);
        basecarga.add(autor1);
        autor1.setVisible(true);

        titulo1 = new JLabel("Título: ");
        titulo1.setBounds(85, 250, 50, 20);
        basecarga.add(titulo1);
        titulo1.setVisible(true);

        edicion1 = new JLabel("Edición: ");
        edicion1.setBounds(85, 350, 50, 20);
        basecarga.add(edicion1);
        edicion1.setVisible(true);
                
        descripcion1 = new JLabel("Descripción: ");
        descripcion1.setBounds(85, 450, 90, 20);
        basecarga.add(descripcion1);
        descripcion1.setVisible(true);
                
        temas1 = new JLabel("Temas: ");
        temas1.setBounds(85, 550, 50, 20);
        basecarga.add(temas1);
        temas1.setVisible(true);
        
        area1 = new JLabel("Área: ");
        area1.setBounds(350, 50, 50, 20);
        basecarga.add(area1);
        area1.setVisible(true);    
        
        frecuencia1 = new JLabel("Frecuencia: ");
        frecuencia1.setBounds(350, 150, 150, 20);
        basecarga.add(frecuencia1);
        frecuencia1.setVisible(true);
                
        ejemplares1 = new JLabel("Ejemplares: ");
        ejemplares1.setBounds(350, 250, 150, 20);
        basecarga.add(ejemplares1);
        ejemplares1.setVisible(true);
                
        copias1 = new JLabel("Copias: ");
        copias1.setBounds(350, 350, 150, 20);
        basecarga.add(copias1);
        copias1.setVisible(true);
                
        disponibles1 = new JLabel("Disponibles: ");
        disponibles1.setBounds(350, 450, 150, 20);
        basecarga.add(disponibles1);
        disponibles1.setVisible(true);
                
        //Text fields
        autor = new JTextField();
        autor.setBounds(165, 150, 160, 20);
        basecarga.add(autor);
        autor.setVisible(true);
                
        titulo = new JTextField();
        titulo.setBounds(165, 250, 160, 20);
        basecarga.add(titulo);
        titulo.setVisible(true);
                
        edicion = new JTextField();
        edicion.setBounds(165, 350, 160, 20);
        basecarga.add(edicion);
        edicion.setVisible(true);
                
        descripcion = new JTextField();
        descripcion.setBounds(165, 450, 160, 20);
        basecarga.add(descripcion);
        descripcion.setVisible(true);
                
        temas = new JTextField();
        temas.setBounds(165, 550, 160, 20);
        basecarga.add(temas);
        temas.setVisible(true);
        //Identificador de cada tema en la cadena
        String s = temas.getText();
        String m = "";
        
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
        String p = String.valueOf(s.charAt(i));
        if (p.equals(",")) {
           temasb [y] = m;
            y = y + 1;
            m = "";
        }
        else {
            m = m + p;
        }
        }
        
        
              
        //
        area = new JTextField();
        area.setBounds(435, 50, 160, 20);
        basecarga.add(area);
        area.setVisible(true);
                
        frecuencia = new JTextField();
        frecuencia.setBounds(435, 150, 160, 20);
        basecarga.add(frecuencia);
        frecuencia.setVisible(true);
                
        ejemplares = new JTextField();
        ejemplares.setBounds(435, 250, 160, 20);
        basecarga.add(ejemplares);
        ejemplares.setVisible(true);
                
        copias = new JTextField();
        copias.setBounds(435, 350, 160, 20);
        basecarga.add(copias);
        copias.setVisible(true);
               
        disponibles = new JTextField();
        disponibles.setBounds(435, 450, 160, 20);
        basecarga.add(disponibles);
        disponibles.setVisible(true);
                
        
            
        //Botones crear y atrás
        crearbi = new JButton("Crear");
        crearbi.setBounds(350, 550, 100, 20);
        basecarga.add(crearbi);
        crearbi.setVisible(true);
        
        
        
        ActionListener crearbib = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Pendiente
                opcion = true;
                b.setTipo1(tipodoc.getSelectedItem().toString());
                b.setAutor1(autor.getText());
                b.setTitulo1(titulo.getText());
                b.setEdicion1(Integer.parseInt(edicion.getText()));
                b.setDescripcion1(descripcion.getText());
                b.setTema1(temasb);
                b.setArea1(area.getText());
                b.setFrecuencia1(frecuencia.getText());
                b.setEjemplares1(Integer.parseInt(ejemplares.getText()));
                b.setCopias1(Integer.parseInt(copias.getText()));
                b.setDisponibles1(Integer.parseInt(disponibles.getText()));
                
                b.ObtenerBibliografias();
                
                FormVerb j = new FormVerb();
                j.FormVerb();
                
                System.out.println(b.getArea1() + " ");
                
             }
        };

        crearbi.addActionListener(crearbib);

        atras = new JButton("Atrás");
        atras.setBounds(495, 550, 100, 20);
        basecarga.add(atras);
        atras.setVisible(true);
                
        ActionListener iratras = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SesionAdmin u = new SesionAdmin();
                u.SesionAdmin();
                dispose();
            }
        };

        //Acción regresar 
        atras.addActionListener(iratras);
        
    }
    
}
