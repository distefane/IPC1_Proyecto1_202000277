package com.mycompany.pruebaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SesionAdmin extends JFrame {

    private JLabel iconologo;
    private JLabel iconousuario;
    private JLabel manipulacionusuarios;
    private JLabel manipulacionbibliografia;
    private JLabel manipulacionreportes;

    private JButton crearu;
    private JButton veru;
    private JButton eliminaru;
    private JButton modificaru;

    private JButton reporteu;
    private JButton reporteb;
    private JButton reporteprestar;

    private JButton crearb;
    private JButton verb;
    private JButton eliminarb;
    private JButton modificarb;

    private JButton logout;

    private JPanel base = new JPanel();

    public void SesionAdmin() {
        setSize(850, 600);
        setLayout(null);
        setTitle("ADMINISTRADOR");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(base);
        base.setLayout(null);
        base.setSize(850, 600);
        base.setVisible(true);

        //Etiquetas
        iconologo = new JLabel();
        iconologo.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\1S 2022\\IPC 1\\practicas\\logo1peq.png"));
        iconologo.setBounds(30, 20, 225, 111);
        base.add(iconologo);
        iconologo.setVisible(true);

        iconousuario = new JLabel();
        iconousuario.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\1S 2022\\IPC 1\\practicas\\logousuario.png"));
        iconousuario.setBounds(550, 30, 50, 50);
        base.add(iconousuario);
        iconousuario.setVisible(true);

        manipulacionusuarios = new JLabel("Usuarios----------------------------------------------------");
        manipulacionusuarios.setBounds(50, 310, 300, 20);
        base.add(manipulacionusuarios);
        manipulacionusuarios.setVisible(true);

        manipulacionreportes = new JLabel("Reportes--------------------------------------------------");
        manipulacionreportes.setBounds(420, 120, 300, 20);
        base.add(manipulacionreportes);
        manipulacionreportes.setVisible(true);

        manipulacionbibliografia = new JLabel("Bibliografía-----------------------------------------------");
        manipulacionbibliografia.setBounds(420, 310, 300, 20);
        base.add(manipulacionbibliografia);
        manipulacionbibliografia.setVisible(true);

        //Botones Acciones Usuario
        crearu = new JButton();
        crearu.setText("Crear");
        crearu.setBounds(50, 360, 100, 20);
        base.add(crearu);
        crearu.setVisible(true);

        ActionListener llevarcrear = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormCrear c = new FormCrear();
                c.FormCrear();
            }
        };
        crearu.addActionListener(llevarcrear);

        veru = new JButton();
        veru.setText("Ver");
        veru.setBounds(210, 360, 100, 20);
        base.add(veru);
        veru.setVisible(true);

        ActionListener llevarver = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormVer c = new FormVer();
                c.FormVer();
            }
        };
        veru.addActionListener(llevarver);

        eliminaru = new JButton();
        eliminaru.setText("Eliminar");
        eliminaru.setBounds(210, 450, 100, 20);
        base.add(eliminaru);
        eliminaru.setVisible(true);

        ActionListener llevareliminar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormEliminar el = new FormEliminar();
                el.FormEliminar();
            }
        };
        eliminaru.addActionListener(llevareliminar);

        modificaru = new JButton();
        modificaru.setText("Modificar");
        modificaru.setBounds(50, 450, 100, 20);
        base.add(modificaru);
        modificaru.setVisible(true);

        ActionListener llevarmodificar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormModificar mod = new FormModificar();
                mod.FormModificar();
            }
        };
        modificaru.addActionListener(llevarmodificar);

        //Botones Acciones Bibliografías
        crearb = new JButton();
        crearb.setText("Crear");
        crearb.setBounds(420, 360, 100, 20);
        base.add(crearb);
        crearb.setVisible(true);

        ActionListener llevarcrearb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ElegirSimpleMasiva c = new ElegirSimpleMasiva();
                c.ElegirSimpleMasiva();
                dispose();
            }
        };
        crearb.addActionListener(llevarcrearb);

        verb = new JButton();
        verb.setText("Ver");
        verb.setBounds(580, 360, 100, 20);
        base.add(verb);
        verb.setVisible(true);

        ActionListener llevarverb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormVerb c = new FormVerb();
                c.FormVerb();
            }
        };
        verb.addActionListener(llevarverb);

        eliminarb = new JButton();
        eliminarb.setText("Eliminar");
        eliminarb.setBounds(580, 450, 100, 20);
        base.add(eliminarb);
        eliminarb.setVisible(true);

        ActionListener llevareliminarb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormEliminarb el = new FormEliminarb();
                el.FormEliminarb();
            }
        };
        eliminarb.addActionListener(llevareliminarb);

        modificarb = new JButton();
        modificarb.setText("Modificar");
        modificarb.setBounds(420, 450, 100, 20);
        base.add(modificarb);
        modificarb.setVisible(true);

        ActionListener llevarmodificarb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormModificarb mod = new FormModificarb();
                mod.FormModificarb();
            }
        };
        modificarb.addActionListener(llevarmodificarb);

        //Botones Acciones Reportes
        reporteu = new JButton();
        reporteu.setText("Usuarios");
        reporteu.setBounds(420, 170, 100, 20);
        base.add(reporteu);
        reporteu.setVisible(true);

        ActionListener reportaru = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReporteUsuarios m = new ReporteUsuarios();
                m.GenerarReporteUsuarios();
            }
        };
        reporteu.addActionListener(reportaru);

        reporteb = new JButton();
        reporteb.setText("Bibliografías");
        reporteb.setBounds(570, 170, 110, 20);
        base.add(reporteb);
        reporteb.setVisible(true);

        ActionListener reportarb = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                ReporteBibliografias k = new ReporteBibliografias();
//                k.GenerarReporteBibliografias();
            }
        };
        reporteb.addActionListener(reportarb);

        reporteprestar = new JButton();
        reporteprestar.setText("Préstamos");
        reporteprestar.setBounds(495, 250, 100, 20);
        base.add(reporteprestar);
        reporteprestar.setVisible(true);

        ActionListener reportarprestar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormEliminarb el = new FormEliminarb();
                el.FormEliminarb();
            }
        };
        eliminaru.addActionListener(reportarprestar);

        //Botón Logout
        logout = new JButton();
        logout.setText("Logout");
        logout.setBounds(620, 45, 100, 20);
        base.add(logout);
        logout.setVisible(true);

        ActionListener logoutt = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuElegir u = new MenuElegir();
                u.MenuElegir();
                dispose();
            }
        };
        logout.addActionListener(logoutt);

    }
}
