/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author doria
 */

public class FuncionArchivar {

    File archivos;
    private static DatosUser usuario;
    ArrayList<DatosUser> listausuarios;
private static Medicamento medicamento;
    ArrayList<Medicamento> listamedicamentos;
    public FuncionArchivar() {

    }
    public boolean existenciaArchivo(String ruta){
    archivos=new File(ruta);
    return archivos.exists();
    }
    
    public void escribirArchivo(String Fichero, ArrayList array) {
        try {
            FileOutputStream fos = new FileOutputStream(Fichero);
            ObjectOutputStream serializar = new ObjectOutputStream(fos);

            serializar.writeObject(array);

            serializar.close();
            serializar.flush();
            fos.close();
        } catch (IOException e) {
            System.out.println("Error de la serialización");
        }
    }

    public ArrayList mostarArchivoDatosUsuarios(String ruta) throws ClassNotFoundException {
        listausuarios = null;
        listausuarios = new ArrayList<DatosUser>();
        try {
            FileInputStream foi = new FileInputStream(ruta);
            ObjectInputStream deserializar = new ObjectInputStream(foi);
            listausuarios = (ArrayList<DatosUser>) deserializar.readObject();
        } catch (IOException e) {
            System.out.println("Error al deserializar el archivo");
        }
        return listausuarios;
    }
     public ArrayList mostarArchivoDatosMedicamento(String ruta) throws ClassNotFoundException {
        listamedicamentos = null;
        listamedicamentos = new ArrayList<Medicamento>();
        try {
            FileInputStream foi = new FileInputStream(ruta);
            ObjectInputStream deserializar = new ObjectInputStream(foi);
            listamedicamentos = (ArrayList<Medicamento>) deserializar.readObject();
        } catch (IOException e) {
            System.out.println("Error al deserializar el archivo");
        }
        return listamedicamentos;
    }

    public void eliminarArchivo(String ruta) {
        archivos = new File(ruta);
        archivos.delete();
    }

}
