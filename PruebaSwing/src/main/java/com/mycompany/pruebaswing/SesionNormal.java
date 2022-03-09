
package com.mycompany.pruebaswing;

import static com.mycompany.pruebaswing.Bibliografias.paneltablab;
import static com.mycompany.pruebaswing.Bibliografias.sd;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SesionNormal extends JFrame{
    
    Bibliografias m = new Bibliografias();
    JScrollPane baseu = new JScrollPane();
    JButton verprestamos, buscartema, logoutu, bprestar;
    JTextField insertartema;
    private JLabel iconologo;
    private JLabel iconousuario;
    JTable tabla = new JTable();
    
    
    public void SesionNormal() {
        //Marco
        setSize(1100, 600);
        setLayout(null);
        setTitle("USUARIO NORMAL");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(baseu);
        baseu.setLayout(null);
        baseu.setSize(1100, 600);
        baseu.setVisible(true);
        
        //Etiquetas
        iconologo = new JLabel();
        iconologo.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\1S 2022\\IPC 1\\practicas\\logo1peq.png"));
        iconologo.setBounds(30, 5, 225, 111);
        baseu.add(iconologo);
        iconologo.setVisible(true);

        iconousuario = new JLabel();
        iconousuario.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\1S 2022\\IPC 1\\practicas\\logousuario.png"));
        iconousuario.setBounds(840, 30, 50, 50);
        baseu.add(iconousuario);
        iconousuario.setVisible(true);
        
        
        //Botones
        logoutu = new JButton();
        logoutu.setText("Logout");
        logoutu.setBounds(900, 45, 100, 20);
        baseu.add(logoutu);
        logoutu.setVisible(true);

        ActionListener logouttu = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuElegir u = new MenuElegir();
                u.MenuElegir();
                dispose();
            }
        };
        
        logoutu.addActionListener(logouttu);
        
//        buscartema = new JButton();
//        buscartema.setText("Buscar");
//        buscartema.setBounds(290, 50, 100, 20);
//        baseu.add(buscartema);
//        buscartema.setVisible(true);
        //TextField buscar
//        insertartema = new JTextField();
//        insertartema.setBounds(400, 50, 170, 20);
//        baseu.add(insertartema);
//        insertartema.setVisible(true);
//        
//        ActionListener buscarbb = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                MenuElegir u = new MenuElegir();
////                u.MenuElegir();
////                dispose();
//            }
//        };
//        
//        buscartema.addActionListener(buscarbb);
        
        verprestamos = new JButton();
        verprestamos.setText("Ver Préstamos");
        verprestamos.setBounds(600, 30, 130, 20);
        baseu.add(verprestamos);
        verprestamos.setVisible(true);
        
        ActionListener verprestados = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                MenuElegir u = new MenuElegir();
//                u.MenuElegir();
//                dispose();
            }
        };
        
        verprestamos.addActionListener(verprestados);
        
        bprestar = new JButton();
        bprestar = new JButton();
        bprestar.setText("Prestar");
        bprestar.setBounds(600, 60, 100, 20);
        baseu.add(bprestar);
        bprestar.setVisible(true);
        
        ActionListener prestar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int columna = 11;
                  int fila = m.MostrarB.getSelectedRow();
                  if (fila > 0) {
                      System.out.println("sí funciona");
                  }
                  else {
                      JOptionPane.showMessageDialog(null, "Debe selecionar una Fila");
                  }
                        
                      sd[fila][columna] = (int)sd[fila][columna] - 1;
                      
            }
        };
        
        bprestar.addActionListener(prestar);
        
        //ayuda
        
        m.ObtenerBibliografias();

        //ayuda
        
        baseu.add(m.paneltablab);
        m.paneltablab.setVisible(true);
        
    }
}
