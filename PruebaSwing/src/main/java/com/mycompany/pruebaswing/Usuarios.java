package com.mycompany.pruebaswing;
import javax.swing.*;
public class Usuarios {

static Object[][] us = new Object[100][8];    
static int borra = 0;
static JScrollPane mdpanel = new JScrollPane();
JTable MostrarU = new JTable();    



    public int ID1;
    public String Nombre1;
    public String Apellido1;
    public String Usuario1;
    public String Rol1;
    public String Contrasena1;
    public String Contrasena2;

    public Usuarios () {
}
    
    public Usuarios(int ID1, String Nombre1, String Apellido1, String Usuario1, String Rol1, String Contrasena1, String Contrasena2) {
        this.ID1 = ID1;
        this.Nombre1 = Nombre1;
        this.Apellido1 = Apellido1;
        this.Usuario1 = Usuario1;
        this.Rol1 = Rol1;
        this.Contrasena1 = Contrasena1;
        this.Contrasena2 = Contrasena2;
    }

    public int getID1() {
        return ID1;
    }

    public void setID1(int ID1) {
        this.ID1 = ID1;
    }

    public String getNombre1() {
        return Nombre1;
    }

    public void setNombre1(String Nombre1) {
        this.Nombre1 = Nombre1;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getUsuario1() {
        return Usuario1;
    }

    public void setUsuario1(String Usuario1) {
        this.Usuario1 = Usuario1;
    }

    public String getRol1() {
        return Rol1;
    }

    public void setRol1(String Rol1) {
        this.Rol1 = Rol1;
    }

    public String getContrasena1() {
        return Contrasena1;
    }

    public void setContrasena1(String Contrasena1) {
        this.Contrasena1 = Contrasena1;
    }

    public String getContrasena2() {
        return Contrasena2;
    }

    public void setContrasena2(String Contrasena2) {
        this.Contrasena2 = Contrasena2;
    }

    
    
    public void ObtenerUsuarios() {
        
                    us[borra][0] = borra;
                    us[borra][1] = getID1();
                    us[borra][2] = getNombre1();
                    us[borra][3] = getApellido1();
                    us[borra][4] = getUsuario1(); 
                    us[borra][5] = getRol1();
                    us[borra][6] = getContrasena1();
                    us[borra][7] = getContrasena2();
                    
                    borra = borra + 1;
                    
        String [] columnas = {"No.", "ID", "Nombre", "Apellido", "Usuario", "Rol", "Contraseña"};
                MostrarU = new JTable(us, columnas);
                mdpanel = new JScrollPane(MostrarU);
                mdpanel.setSize(1000, 600);
                mdpanel.setLocation(50, 100);
        
    }
    
}
