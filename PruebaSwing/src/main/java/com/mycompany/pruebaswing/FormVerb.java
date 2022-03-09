package com.mycompany.pruebaswing;

import javax.swing.*;

public class FormVerb extends JFrame {
    Object[][] biblio = new Object[100][11];
    JLabel listadob;
    JPanel panverb = new JPanel();
    
    Bibliografias u = new Bibliografias();
    
    CargaIndividual bibin = new CargaIndividual();
    

    public void FormVerb() {

        //Marco
        setSize(1100, 700);
        setLayout(null);
        setTitle("Ver Bibliografías");
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(panverb);
        panverb.setLayout(null);
        panverb.setSize(1100, 700);
        panverb.setVisible(true);

        //Etiqueta
        listadob = new JLabel("Listado de Bibliografías Registradas en el Sistema");
        listadob.setBounds(50, 50, 300, 20);
        panverb.add(listadob);
        listadob.setVisible(true);

        
        
        //Llamar tabla donde se muestren las bibliografías ingresadas por parte del admin
//        u.ObtenerBibliografias(); no llamar
        panverb.add(u.paneltablab);
        u.paneltablab.setVisible(true);
    }
    
    
}
