
package Funciones;

import java.io.Serializable;


public class Medicamento implements Serializable{
    
    private String nombremed;
    private String fechacad;
    private int cantidadrestante;
    private boolean tipo;
    private String nota;
    
    public Medicamento(){
        
    }

    public Medicamento(String nombremed, String fechacad, int cantidadrestante, boolean tipo, String nota) {
        this.nombremed = nombremed;
        this.fechacad = fechacad;
        this.cantidadrestante = cantidadrestante;
        this.tipo = tipo;
        this.nota = nota;
    }

    public String getNombremed() {
        return nombremed;
    }

    public void setNombremed(String nombremed) {
        this.nombremed = nombremed;
    }

    public String getNota() {
        return nombremed;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
    public String getFechacad() {
        return fechacad;
    }

    public void setFechacad(String fechacad) {
        this.fechacad = fechacad;
    }

    public int getCantidadrestante() {
        return cantidadrestante;
    }

    public void setCantidadrestante(int cantidadrestante) {
        this.cantidadrestante = cantidadrestante;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    
  
}
