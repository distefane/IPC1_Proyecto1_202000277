
package com.mycompany.pruebaswing;

public class ReporteUsuarios {
    
    
    //LO "CONSTRUÍ" PERO NO ME DIO TIEMPO DE RELACIONARLO
    
    
    
    private String Inicio = "<!DOCTYPE html>\n" + 
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "   <title>Reporte Usuarios</title>\n" +
                            "</head>\n" +
                            "<body>\n" + 
                            "   <table border=\"\">\n";
    
    private String Fin = "   </table>\n" + 
                        "</body>\n" + 
                        "</html";
    private Usuarios[] filasu;
    private String[] columnasu;
    
    public void ReporteUsuarios(Usuarios[] filasu, String[] columnasu){
        this.filasu = filasu;
        this.columnasu = columnasu;
    }
    
    public String GenerarReporteUsuarios (){
        String tcolu = "";
        tcolu += "               <tr>\n";
        for (int i = 0; i < columnasu.length; i++) {
            tcolu += "                 <th>" + columnasu[i] + "</th>\n";
        }
        tcolu += "</tr>\n";
        
        String tfilu = "";
        
        for (int i = 0; i < filasu.length; i++) {
            if (filasu[i] != null) {
            tfilu += "           <tr>\n";
            
            tfilu += "                   <td>" + filasu[i].getID1() + "</td>\n";
            tfilu += "                   <td>" + filasu[i].getNombre1()+ "</td>\n";
            tfilu += "                   <td>" + filasu[i].getApellido1()+ "</td>\n";
            tfilu += "                   <td>" + filasu[i].getUsuario1() + "</td>\n";
            tfilu += "                   <td>" + filasu[i].getRol1() + "</td>\n";
            tfilu += "                   <td>" + filasu[i].getContrasena1() + "</td>\n";
            tfilu += "                   <td>" + filasu[i].getContrasena2() + "</td>\n";
            
            tcolu += "               </tr>\n";
        }
            
        }
        return Inicio + tcolu + tfilu + Fin;
    }
    
    
}
