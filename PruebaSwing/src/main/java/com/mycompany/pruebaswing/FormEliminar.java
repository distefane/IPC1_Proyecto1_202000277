package com.mycompany.pruebaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormEliminar extends JFrame {

    JButton buscar;

    int filau = 0;
    
    JButton eliminar;
    JButton cancelar;
//    JLabel ID;
    JLabel Nombres;
    JLabel Apellidos;
    JLabel Usuario;
    JLabel Rol;
    JLabel Contrasena;
    JLabel ConfContrasena;
    JTextField BuscarID;
//    JTextField DatoID;
    JTextField DatoNombres;
    JTextField DatoApellidos;
    JTextField DatoUsuario;
    JTextField DatoRol;
//    JPasswordField DatoContrasena;
//    JPasswordField DatoConfContrasena;
    JPanel panel = new JPanel();
    
    Usuarios y = new Usuarios();

    public void FormEliminar() {

        //Marco
        setSize(500, 700);
        setLayout(null);
        setTitle("Eliminar Usuario");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(panel);
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setSize(500, 700);

        //Etiquetas
//        ID = new JLabel("ID: ");
//        ID.setBounds(80, 90, 120, 20);
//        panel.add(ID);
//        ID.setVisible(true);
        Nombres = new JLabel("Nombres: ");
        Nombres.setBounds(80, 160, 120, 20);
        panel.add(Nombres);
        Nombres.setVisible(true);

        Apellidos = new JLabel("Apellidos: ");
        Apellidos.setBounds(80, 230, 120, 20);
        panel.add(Apellidos);
        Apellidos.setVisible(true);

        Usuario = new JLabel("Usuario: ");
        Usuario.setBounds(80, 300, 120, 20);
        panel.add(Usuario);
        Usuario.setVisible(true);

        Rol = new JLabel("Rol: ");
        Rol.setBounds(80, 370, 120, 20);
        panel.add(Rol);
        Rol.setVisible(true);

//        Contrasena = new JLabel("Contraseña: ");
//        Contrasena.setBounds(80, 440, 120, 20);
//        panel.add(Contrasena);
//        Contrasena.setVisible(true);
//        
//        ConfContrasena = new JLabel("Confirmar: ");
//        ConfContrasena.setBounds(80, 510, 120, 20);
//        panel.add(ConfContrasena);
//        ConfContrasena.setVisible(true);
        //Campos Escritura
        BuscarID = new JTextField();
        BuscarID.setBounds(200, 30, 220, 20);
        panel.add(BuscarID);
        BuscarID.setVisible(true);

//        DatoID = new JTextField();
//        DatoID.setBounds(200, 90, 220, 20);
//        panel.add(DatoID);
//        DatoID.setVisible(true);
        DatoNombres = new JTextField();
        DatoNombres.setBounds(200, 160, 220, 20);
        panel.add(DatoNombres);
        DatoNombres.setVisible(true);

        DatoApellidos = new JTextField();
        DatoApellidos.setBounds(200, 230, 220, 20);
        panel.add(DatoApellidos);
        DatoApellidos.setVisible(true);

        DatoUsuario = new JTextField();
        DatoUsuario.setBounds(200, 300, 220, 20);
        panel.add(DatoUsuario);
        DatoUsuario.setVisible(true);

        DatoRol = new JTextField();
        DatoRol.setBounds(200, 370, 220, 20);
        panel.add(DatoRol);
        DatoRol.setVisible(true);

//        DatoContrasena = new JPasswordField();
//        DatoContrasena.setBounds(200, 440, 220, 20);
//        panel.add(DatoContrasena);
//        DatoContrasena.setVisible(true);
//        
//        DatoConfContrasena = new JPasswordField();
//        DatoConfContrasena.setBounds(200, 510, 220, 20);
//        panel.add(DatoConfContrasena);
//        DatoConfContrasena.setVisible(true);
        //Botón Crear
        eliminar = new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(70, 590, 120, 20);
        panel.add(eliminar);
        eliminar.setVisible(true);

        ActionListener accioneeliminar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                y.us[filau][1] = y.us[filau+1][1];
                y.us[filau][2] = y.us[filau+1][2];
                y.us[filau][3] = y.us[filau+1][3];
                y.us[filau][4] = y.us[filau+1][4];
                y.us[filau][5] = y.us[filau+1][5];
                y.us[filau][6] = y.us[filau+1][6];
                y.us[filau][7] = y.us[filau+1][7];
                y.us[filau][8] = y.us[filau+1][8];
                y.us[filau][9] = y.us[filau+1][9];
                y.us[filau][10] = y.us[filau+1][10];
                y.us[filau][11] = y.us[filau+1][11];
                
                y.us[filau+1][0] = null;
                y.us[filau+1][1] = null;
                y.us[filau+1][2] = null;
                y.us[filau+1][3] = null;
                y.us[filau+1][4] = null;
                y.us[filau+1][5] = null;
                y.us[filau+1][6] = null;
                y.us[filau+1][7] = null;
                y.us[filau+1][8] = null;
                y.us[filau+1][9] = null;
                y.us[filau+1][10] = null;
                y.us[filau+1][11] = null;
                
                y.borra = y.borra - 1;
                
            }
        };
        
        eliminar.addActionListener(accioneeliminar);
        
        //Botón Buscar
        buscar = new JButton();
        buscar.setText("Buscar");
        buscar.setBounds(70, 30, 120, 20);
        panel.add(buscar);
        buscar.setVisible(true);

        ActionListener acciondebuscar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarID.getText();
                for (int i = 0; i < y.us.length; i++) {
                    if (BuscarID.getText().equals(y.us[i][1])) {
                        DatoNombres.setText(y.us[i][2].toString());
                        DatoNombres.setEnabled(false);
                        DatoApellidos.setText(y.us[i][3].toString());
                        DatoApellidos.setEnabled(false);
                        DatoUsuario.setText(y.us[i][4].toString());
                        DatoUsuario.setEnabled(false);
                        DatoRol.setText(y.us[i][5].toString());
                        DatoRol.setEnabled(false);
                        filau = i;
                        break;

                    }
                }
            }
        };
        
        eliminar.addActionListener(acciondebuscar);
        
        //Botón Cancelar
        cancelar = new JButton();
        cancelar.setText("Cancelar");
        cancelar.setBounds(300, 590, 120, 20);
        panel.add(cancelar);
        cancelar.setVisible(true);

        ActionListener cerrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };

        //Acción cerrar 
        cancelar.addActionListener(cerrar);
        

    }
    

}
