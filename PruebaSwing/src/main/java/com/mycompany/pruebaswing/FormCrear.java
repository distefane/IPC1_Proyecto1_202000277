package com.mycompany.pruebaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.*;

public class FormCrear extends JFrame {

//     JButton buscar;
    JLabel titulo;
    JButton crear;
    JButton cancelar;
    JLabel ID;
    JLabel Nombres;
    JLabel Apellidos;
    JLabel Usuario;
    JLabel Rol;
    JLabel Contrasena;
    JLabel ConfContrasena;
    JTextField BuscarID;
    JTextField DatoID;
    JTextField DatoNombres;
    JTextField DatoApellidos;
    JTextField DatoUsuario;
    JComboBox DatoRol;
    JPasswordField DatoContrasena;
    JPasswordField DatoConfContrasena;
    JPanel panel = new JPanel();
    Usuarios usuario = new Usuarios();
    
    public void FormCrear() {
 
        //Marco
        setSize(500, 700);
        setLayout(null);
        setTitle("Crear Usuario");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(panel);
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setSize(500, 700);

        //Etiquetas
        titulo = new JLabel("INGRESE LOS DATOS SOLICITADOS");
        titulo.setBounds(150, 30, 220, 20);
        panel.add(titulo);
        titulo.setVisible(true);

        ID = new JLabel("ID: ");
        ID.setBounds(80, 90, 120, 20);
        panel.add(ID);
        ID.setVisible(true);

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
//        BuscarID = new JTextField();
//        BuscarID.setBounds(200, 30, 220, 20);
//        panel.add(BuscarID);
//        BuscarID.setVisible(true);
        DatoID = new JTextField();
        DatoID.setBounds(200, 90, 220, 20);
        panel.add(DatoID);
        DatoID.setVisible(true);
        
        DatoNombres = new JTextField();
        DatoNombres.setBounds(200, 160, 220, 20);
        panel.add(DatoNombres);
        DatoNombres.setVisible(true);
        
//        usuario.Nombre1 = DatoNombres.getText();
//        System.out.println(usuario);

        DatoApellidos = new JTextField();
        DatoApellidos.setBounds(200, 230, 220, 20);
        panel.add(DatoApellidos);
        DatoApellidos.setVisible(true);

        DatoUsuario = new JTextField();
        DatoUsuario.setBounds(200, 300, 220, 20);
        panel.add(DatoUsuario);
        DatoUsuario.setVisible(true);

        String[] roles = {"Estudiante", "Catedrático"};
        DatoRol = new JComboBox(roles);
        DatoRol.setBounds(200, 370, 220, 20);
        panel.add(DatoRol);
        DatoRol.setVisible(true);

        DatoContrasena = new JPasswordField();
        DatoContrasena.setBounds(200, 440, 220, 20);
        panel.add(DatoContrasena);
        DatoContrasena.setVisible(true);

        DatoConfContrasena = new JPasswordField();
        DatoConfContrasena.setBounds(200, 510, 220, 20);
        panel.add(DatoConfContrasena);
        DatoConfContrasena.setVisible(true);

        //Botón Crear
        crear = new JButton();
        crear.setText("Crear Usuario");
        crear.setBounds(70, 590, 120, 20);
        panel.add(crear);
        crear.setVisible(true);

        ActionListener accioncrear = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuarios f = new Usuarios();
                f.setID1(Integer.parseInt(DatoID.getText()));
                f.setNombre1(DatoNombres.getText());
                f.setApellido1(DatoApellidos.getText());
                f.setUsuario1(DatoUsuario.getText());
                f.setRol1(DatoRol.getSelectedItem().toString());
                f.setContrasena1(DatoContrasena.getText());
                f.setContrasena2(DatoConfContrasena.getText());
                f.ObtenerUsuarios();
                
                FormVer t = new FormVer();
                t.FormVer();
            }
        };

//        //Botón Buscar
//        buscar = new JButton();
//        buscar.setText("Buscar");
//        buscar.setBounds(70, 30, 120, 20);
//        panel.add(buscar);
//        buscar.setVisible(true);
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
        crear.addActionListener(accioncrear);

    }

}
