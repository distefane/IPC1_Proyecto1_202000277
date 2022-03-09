package com.mycompany.pruebaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormModificar extends JFrame {

    int fil;
    
    JButton buscar;
    JButton crear;
    JButton cancelar;
    JLabel ID;
    JLabel Nombres;
    JLabel Apellidos;
    JLabel Usuario;
    JLabel Rol;
    JLabel Contrasena;
    JLabel ConfContrasena;
    JTextField BuscarIDu;
    JTextField DatoIDu;
    JTextField DatoNombresu;
    JTextField DatoApellidosu;
    JTextField DatoUsuariou;
    JComboBox DatoRolu;
    JPasswordField DatoContrasenau;
    JPasswordField DatoConfContrasenau;
    JPanel panel = new JPanel();
    
Usuarios f = new Usuarios();
    public void FormModificar() {

        //Marco
        setSize(500, 700);
        setLayout(null);
        setTitle("Modificar Usuario");
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

        Contrasena = new JLabel("Contraseña: ");
        Contrasena.setBounds(80, 440, 120, 20);
        panel.add(Contrasena);
        Contrasena.setVisible(true);

        ConfContrasena = new JLabel("Confirmar: ");
        ConfContrasena.setBounds(80, 510, 120, 20);
        panel.add(ConfContrasena);
        ConfContrasena.setVisible(true);

        //Campos Escritura
        BuscarIDu = new JTextField();
        BuscarIDu.setBounds(200, 30, 220, 20);
        panel.add(BuscarIDu);
        BuscarIDu.setVisible(true);

//        DatoID = new JTextField();
//        DatoID.setBounds(200, 90, 220, 20);
//        panel.add(DatoID);
//        DatoID.setVisible(true);
        DatoNombresu = new JTextField();
        DatoNombresu.setBounds(200, 160, 220, 20);
        panel.add(DatoNombresu);
        DatoNombresu.setVisible(true);

        DatoApellidosu = new JTextField();
        DatoApellidosu.setBounds(200, 230, 220, 20);
        panel.add(DatoApellidosu);
        DatoApellidosu.setVisible(true);

        DatoUsuariou = new JTextField();
        DatoUsuariou.setBounds(200, 300, 220, 20);
        panel.add(DatoUsuariou);
        DatoUsuariou.setVisible(true);

        String[] roles = {"Estudiante", "Catedrático"};
        DatoRolu = new JComboBox(roles);
        DatoRolu.setBounds(200, 370, 220, 20);
        panel.add(DatoRolu);
        DatoRolu.setVisible(true);

        DatoContrasenau = new JPasswordField();
        DatoContrasenau.setBounds(200, 440, 220, 20);
        panel.add(DatoContrasenau);
        DatoContrasenau.setVisible(true);

        DatoConfContrasenau = new JPasswordField();
        DatoConfContrasenau.setBounds(200, 510, 220, 20);
        panel.add(DatoConfContrasenau);
        DatoConfContrasenau.setVisible(true);

        //Botón Crear
        crear = new JButton();
        crear.setText("Guardar");
        crear.setBounds(70, 590, 120, 20);
        panel.add(crear);
        crear.setVisible(true);

        ActionListener accionmod = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                f.us[fil][2] = DatoNombresu.getText();
                f.us[fil][3] = DatoApellidosu.getText();
                f.us[fil][4] = DatoUsuariou.getText();
                f.us[fil][5] = DatoRolu.getSelectedItem();
                f.us[fil][6] = DatoContrasenau.getText();
                f.us[fil][7] = DatoConfContrasenau.getText();
                
                FormVer t = new FormVer();
                t.FormVer();
            }
        };
        
        //Botón Buscar
        buscar = new JButton();
        buscar.setText("Buscar");
        buscar.setBounds(70, 30, 120, 20);
        panel.add(buscar);
        buscar.setVisible(true);
        
        ActionListener buuscar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < f.us.length; i++) {
                    if (BuscarIDu.getText().equals(f.us[i][1].toString())) {
                        DatoNombresu.setText(f.us[i][2].toString());
                        DatoApellidosu.setText(f.us[i][3].toString());
                        DatoUsuariou.setText(f.us[i][4].toString());
                        DatoRolu.setSelectedItem(f.us[i][5].toString());
                        DatoContrasenau.setText(f.us[i][6].toString());
                        DatoConfContrasenau.setText(f.us[i][7].toString());
                        fil = i;
                        break;

                    }
                }
            }
        };
        
        

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
        crear.addActionListener(accionmod);
        buscar.addActionListener(buuscar);

    }

}
