
package com.mycompany.pruebaswing;

public class ReporteBibliografias {
    
    
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
    private Bibliografias[] filas;
    private String[] columnas;
    
    public ReporteBibliografias(Bibliografias[] filas, String[] columnas){
        this.filas = filas;
        this.columnas = columnas;
    }
    
    public String GenerarReporteBibliografias (){
        String tcol = "";
        tcol += "               <tr>\n";
        for (int i = 0; i < columnas.length; i++) {
            tcol += "                 <th>" + columnas[i] + "</th>\n";
        }
        tcol += "</tr>\n";
        
        String tfil = "";
        
        for (int i = 0; i < filas.length; i++) {
            if (filas[i] != null) {
            tfil += "           <tr>\n";
            
            tfil += "                   <td>" + filas[i].getTipo1() + "</td>\n";
            tfil += "                   <td>" + filas[i].getAutor1() + "</td>\n";
            tfil += "                   <td>" + filas[i].getTitulo1() + "</td>\n";
            tfil += "                   <td>" + filas[i].getEdicion1() + "</td>\n";
            tfil += "                   <td>" + filas[i].getDescripcion1() + "</td>\n";
            tfil += "                   <td>" + filas[i].getTema1().toString() + "</td>\n";
            tfil += "                   <td>" + filas[i].getCopias1() + "</td>\n";
            tfil += "                   <td>" + filas[i].getDisponibles1() + "</td>\n";
            tfil += "                   <td>" + filas[i].getFrecuencia1() + "</td>\n";
            tfil += "                   <td>" + filas[i].getEjemplares1() + "</td>\n";
            tfil += "                   <td>" + filas[i].getArea1() + "</td>\n";
            
            tcol += "               </tr>\n";
        }
            
        }
        return Inicio + tcol + tfil + Fin;
    }
    
}
