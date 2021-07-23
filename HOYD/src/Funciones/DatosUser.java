package Funciones;

import java.io.*;

public class DatosUser implements Serializable {

    public DatosUser() {
    }

    public DatosUser(String nombre, char[] contra, String pregsecret, String respsecret) {
        this.nombre = nombre;
        this.contra = contra;
        this.pregsecret = pregsecret;
        this.respsecret = respsecret;
    }

    public void setRespsecret(String respsecret) {
        this.respsecret = respsecret;
    }

    public String getRespSecret() {
        return respsecret;
    }

    private String pregsecret;
    private String respsecret;
    private String nombre;
    private char[] contra;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char[] getContra() {
        return contra;
    }

    public void setContra(char[] contra) {
        this.contra = contra;
    }

    public String getPregsecret() {
        return pregsecret;
    }

    public String getRespsecret() {
        return respsecret;
    }

}
