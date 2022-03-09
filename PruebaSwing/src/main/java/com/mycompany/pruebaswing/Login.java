package com.mycompany.pruebaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {
    private JLabel logologin;
    Usuarios x = new Usuarios();
     JLabel usuariologin;
    private JLabel contrasenalogin;
    private JTextField usuariolog;
    private JPasswordField contrasenalog;
    private JButton entrarsis;
    private JButton cancelregresar;
    private JPanel panellogin;

    public Login(){
        panellogin = new JPanel();
        //Marco
        setSize(400, 400);
        setLayout(null);
        setTitle("Login");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(panellogin);
        panellogin.setLayout(null);
        panellogin.setSize(400, 400);
        panellogin.setVisible(true);
        
        //Etiquetas
        logologin = new JLabel();
        logologin.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\1S 2022\\IPC 1\\practicas\\logousuario.png"));
        logologin.setBounds(165, 40, 50, 50);
        panellogin.add(logologin);
        logologin.setVisible(true);
        
        usuariologin = new JLabel("Usuario: ");
        usuariologin.setBounds(50, 140, 220, 20);
        panellogin.add(usuariologin);
        usuariologin.setVisible(true);
        
        contrasenalogin = new JLabel("Contraseña: ");
        contrasenalogin.setBounds(50, 200, 120, 20);
        panellogin.add(contrasenalogin);
        contrasenalogin.setVisible(true);
        
        //Campos texto
        usuariolog = new JTextField();
        usuariolog.setBounds(150, 140, 190,20);
        panellogin.add(usuariolog);
        usuariolog.setVisible(true);
        
        contrasenalog = new JPasswordField();
        contrasenalog.setBounds(150, 200, 190,20);
        panellogin.add(contrasenalog);
        contrasenalog.setVisible(true);
        
        //Botones ingresar y cancelar
        entrarsis = new JButton();
        entrarsis.setText("Entrar");
        entrarsis.setBounds(60, 280, 100, 20);
        panellogin.add(entrarsis);
        entrarsis.setVisible(true);

        ActionListener entrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usuariolog.getText().equals("admin") && contrasenalog.getText().equals("password")) {
                SesionAdmin a = new SesionAdmin();
                a.SesionAdmin();
                dispose();
                }
                else if (!usuariolog.getText().equals("admin") && !contrasenalog.getText().equals("password")) {
                    
                    for (int i = 0; i < x.us.length; i++) {
                        if (usuariolog.getText().equals(x.us[i][4]) && contrasenalog.getText().equals(x.us[i][6])) {
                            SesionNormal m = new SesionNormal();
                            m.SesionNormal();
                            dispose();
                            break;
                        }
                        else if (usuariolog.getText().equals(x.us[i][4]) && !contrasenalog.getText().equals(x.us[i][6])) {
                            JOptionPane.showMessageDialog(null, "Credenciales Inválidas, por favor intente nuevamente.");
                            break;
                        }
                        else if (!usuariolog.getText().equals(x.us[i][4])) {
                            JOptionPane.showMessageDialog(null, "El usuario no existe. Por favor póngase en contacto con el Administrador para efectuar su registro.");
                            break;
                        }
                    }
                    }
            }
        };
        //Acción salir 
        entrarsis.addActionListener(entrar);
        
        cancelregresar = new JButton();
        cancelregresar.setText("Cancelar");
        cancelregresar.setBounds(230, 280, 100, 20);
        panellogin.add(cancelregresar);
        cancelregresar.setVisible(true);

        ActionListener regresarprincipal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuariolog.setText(null);
                contrasenalog.setText(null);
                MenuElegir m = new MenuElegir();
                m.MenuElegir();
                dispose();
            }
        };
        
        //Acción salir 
        cancelregresar.addActionListener(regresarprincipal);
        
    };
}
