package com.mycompany.pruebaswing;

import javax.swing.*;

public class Bibliografias {

    public String Tipo1;

    static Object[][] sd = new Object[100][12];
    static int lapiz = 0;
    static JScrollPane paneltablab = new JScrollPane();
    JTable MostrarB = new JTable();
    public String Autor1;
    public String Titulo1;
    public int Edicion1;
    public String Descripcion1;
    public String[] Tema1;
    public int copias1;
    public int disponibles1;
    public String Frecuencia1;
    public int ejemplares1;
    public String area1;

    public Bibliografias() {

    }

    public Bibliografias(String Tipo1, String Autor1, String Titulo1, int Edicion1, String Descripcion1, String[] Tema1, int copias1, int disponibles1, String Frecuencia1, int ejemplares1, String area1) {
        this.Tipo1 = Tipo1;
        this.Autor1 = Autor1;
        this.Titulo1 = Titulo1;
        this.Edicion1 = Edicion1;
        this.Descripcion1 = Descripcion1;
        this.Tema1 = Tema1;
        this.copias1 = copias1;
        this.disponibles1 = disponibles1;
        this.Frecuencia1 = Frecuencia1;
        this.ejemplares1 = ejemplares1;
        this.area1 = area1;
    }

    public String getTipo1() {
        return Tipo1;
    }

    public void setTipo1(String Tipo1) {
        this.Tipo1 = Tipo1;
    }

    public String getAutor1() {
        return Autor1;
    }

    public void setAutor1(String Autor1) {
        this.Autor1 = Autor1;
    }

    public String getTitulo1() {
        return Titulo1;
    }

    public void setTitulo1(String Titulo1) {
        this.Titulo1 = Titulo1;
    }

    public int getEdicion1() {
        return Edicion1;
    }

    public void setEdicion1(int Edicion1) {
        this.Edicion1 = Edicion1;
    }

    public String getDescripcion1() {
        return Descripcion1;
    }

    public void setDescripcion1(String Descripcion1) {
        this.Descripcion1 = Descripcion1;
    }

    public String[] getTema1() {
        return Tema1;
    }

    public void setTema1(String[] Tema1) {
        this.Tema1 = Tema1;
    }

    public int getCopias1() {
        return copias1;
    }

    public void setCopias1(int copias1) {
        this.copias1 = copias1;
    }

    public int getDisponibles1() {
        return disponibles1;
    }

    public void setDisponibles1(int disponibles1) {
        this.disponibles1 = disponibles1;
    }

    public String getFrecuencia1() {
        return Frecuencia1;
    }

    public void setFrecuencia1(String Frecuencia1) {
        this.Frecuencia1 = Frecuencia1;
    }

    public int getEjemplares1() {
        return ejemplares1;
    }

    public void setEjemplares1(int ejemplares1) {
        this.ejemplares1 = ejemplares1;
    }

    public String getArea1() {
        return area1;
    }

    public void setArea1(String area1) {
        this.area1 = area1;
    }

    public void ObtenerBibliografias() {

        if (getAutor1()==null) {
            String[] columnas = {"No.", "Tipo", "Autor", "Título", "Edición", "Descripción", "Temas", "Area", "Frecuencia", "Ejemplares", "Copias", "Disponibles"};
            MostrarB = new JTable(sd, columnas);
            paneltablab = new JScrollPane(MostrarB);
            paneltablab.setSize(1000, 600);
            paneltablab.setLocation(50, 100);
            System.out.println("sdfsd");
        } else {
            
            
            sd[lapiz][0] = lapiz;
            sd[lapiz][1] = getTipo1();
            sd[lapiz][2] = getAutor1();
            sd[lapiz][3] = getTitulo1();
            sd[lapiz][4] = getEdicion1();
            sd[lapiz][5] = getDescripcion1();
            sd[lapiz][6] = getTema1();
            sd[lapiz][7] = getArea1();
            sd[lapiz][8] = getFrecuencia1();
            sd[lapiz][9] = getEjemplares1();
            sd[lapiz][10] = getCopias1();
            sd[lapiz][11] = getDisponibles1();
            
            lapiz = lapiz + 1;
            
            String[] columnas = {"No.", "Tipo", "Autor", "Título", "Edición", "Descripción", "Temas", "Area", "Frecuencia", "Ejemplares", "Copias", "Disponibles"};
            MostrarB = new JTable(sd, columnas);
            paneltablab = new JScrollPane(MostrarB);
            paneltablab.setSize(1000, 600);
            paneltablab.setLocation(50, 100);
            
            
        }

    }

}
