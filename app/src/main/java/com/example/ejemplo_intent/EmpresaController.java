package com.example.ejemplo_intent;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class EmpresaController {
    private static ArrayList<Empresa> listaEmpresa = new ArrayList<>();

    public static void addEmpresa(int id, String nombre, String rut, String contraseña, String email, String telefono) {
        Empresa e = new Empresa(id, nombre, rut, contraseña, email, telefono);
        listaEmpresa.add(e);
    }

    public static Empresa findEmpresa(int id) {
        for (Empresa e : listaEmpresa) {
            if (id == e.getIdEmpresa()){
                return e;
            }
        }
        return null;
    }

    public static DispositivoControllerMed login(String email, String contraseña) {
        for (Empresa e : listaEmpresa){
            if (email.equals(e.getEmail()) && contraseña.equals(e.getContraseña()) ){
                return e.getListaMed();
            }
        }
        return null;
    }

    public static ArrayList<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public static void cargarLista() {

        if (listaEmpresa.size() == 0) {
            addEmpresa(1,"emp1","1-1","admin","correo@correo.com","123");
        }
    }
}
