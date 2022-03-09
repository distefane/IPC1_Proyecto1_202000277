package com.mycompany.pruebaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuElegir extends JFrame {

    JLabel bienvenida;
    JLabel logo;
    JLabel logousuario;
    JLabel titulovision;
    JLabel contenido1;
    JLabel contenido2;
    JLabel contenido3;
    JOptionPane acercade;
    JButton botlogin;
    JButton EliminarUsuario;
    JButton ModificarUsuario;
    JButton about;
    JPanel panelprincipal = new JPanel();

    public void MenuElegir() {
        setSize(770, 500);
        setDefaultCloseOperation(3);
        setTitle("BIBLIOTECA FIUSAC - Menú Principal");
        setVisible(true);
        setLocationRelativeTo(null);
        panelprincipal.setLayout(null);
        panelprincipal.setSize(770, 500);
        panelprincipal.setVisible(true);
        getContentPane().add(panelprincipal);

        //Logo
        logo = new JLabel();
        logo.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\1S 2022\\IPC 1\\practicas\\logo1.png"));
        logo.setBounds(50, 140, 300, 148);
        panelprincipal.add(logo);
        logo.setVisible(true);
        //Logo usuario
        logousuario = new JLabel();
        logousuario.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\1S 2022\\IPC 1\\practicas\\logousuario.png"));
        logousuario.setBounds(530, 45, 50, 50);
        panelprincipal.add(logousuario);
        logousuario.setVisible(true);

        //Vision y bienvenida
        bienvenida = new JLabel("¡Te damos la bienvenida al portal de la Biblioteca FIUSAC!");
        bienvenida.setBounds(60, 60, 400, 20);
        panelprincipal.add(bienvenida);
        bienvenida.setVisible(true);

        titulovision = new JLabel("VISIÓN:");
        titulovision.setBounds(390, 170, 50, 20);
        panelprincipal.add(titulovision);
        titulovision.setVisible(true);
        contenido1 = new JLabel("Ser la unidad de información especializada y técnica");
        contenido1.setBounds(390, 190, 300, 20);
        panelprincipal.add(contenido1);
        contenido1.setVisible(true);
        contenido2 = new JLabel("con estándates de Biblioteca Universitaria en benefi-");
        contenido2.setBounds(390, 210, 300, 20);
        panelprincipal.add(contenido2);
        contenido2.setVisible(true);
        contenido3 = new JLabel("cio del desarrollo de la ciencia y tecnología en el país.");
        contenido3.setBounds(390, 230, 320, 20);
        panelprincipal.add(contenido3);
        contenido3.setVisible(true);

        //Botón login
        botlogin = new JButton();
        botlogin.setText("Login");
        botlogin.setBounds(580, 60, 100, 20);
        panelprincipal.add(botlogin);
        botlogin.setVisible(true);

        ActionListener llevarlogin = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login z = new Login();
                z.setVisible(true);
                dispose();
            }
        };

//        //Botón llamar a FormModificar
//        ModificarUsuario = new JButton();
//        ModificarUsuario.setText("Modificar Usuario");
//        ModificarUsuario.setBounds(250, 120, 100, 20);
//        panelprincipal.add(ModificarUsuario);
//        ModificarUsuario.setVisible(true);
//
//        ActionListener llevarModificar = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                FormModificar b = new FormModificar();
//                b.setVisible(true);
//            }
//        };
//        //Botón llamar a FormModificar
//        EliminarUsuario = new JButton();
//        EliminarUsuario.setText("Eliminar Usuario");
//        EliminarUsuario.setBounds(250, 180, 100, 20);
//        panelprincipal.add(EliminarUsuario);
//        EliminarUsuario.setVisible(true);
//
//        ActionListener llevarEliminar = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                FormEliminar c = new FormEliminar();
//                c.setVisible(true);
//            }
//        };
        //Botón About
        about = new JButton();
        about.setText("About");
        about.setBounds(70, 380, 100, 20);
        panelprincipal.add(about);
        about.setVisible(true);

        ActionListener acercadeapp = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acercade = new JOptionPane();
                acercade.showMessageDialog(acercade, "Podrás prestar bibliografías que se encuentran registradas en el sistema.", "About", JOptionPane.INFORMATION_MESSAGE);
                getContentPane().add(acercade);
                acercade.setVisible(true);
            }
        };
        setVisible(true);//extra
        //Acción about
        botlogin.addActionListener(llevarlogin);
        //Acción salir 
        about.addActionListener(acercadeapp);

    }

    public static void main(String[] args) {
        MenuElegir d = new MenuElegir();
        d.MenuElegir();
        
//        Login m = new Login();
//        m.Login();
//            SesionAdmin r = new SesionAdmin();
//            r.SesionAdmin();

//            FormVer u = new FormVer();
//            u.FormVer();

//        ElegirSimpleMasiva r = new ElegirSimpleMasiva();
//        r.ElegirSimpleMasiva();

//CargaIndividual i = new CargaIndividual();
//i.CargaIndividual();

//CargaMasiva o = new CargaMasiva();
//o.CargaMasiva();

//        SesionNormal h = new SesionNormal();
//        h.SesionNormal();

//FormModificarb h = new FormModificarb();
//h.FormModificarb();
    }

}
