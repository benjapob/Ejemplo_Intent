package com.example.ejemplo_intent;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class EmpresaController {
    public static ArrayList<Empresa> listaEmpresa = new ArrayList<>();

    public static Empresa addEmpresa(String nombre, String rut, String contraseña, String email, String telefono) {
        Empresa e = new Empresa(listaEmpresa.size()+1, nombre, rut, contraseña, email, telefono);
        listaEmpresa.add(e);
        return e;
    }

    public static Empresa findEmpresa(int id) {
        for (Empresa e : listaEmpresa) {
            if (id == e.getIdEmpresa()){
                return e;
            }
        }
        return null;
    }

    public static Integer login(String email, String contraseña) {
        for (Empresa e : listaEmpresa){
            if (email.equals(e.getEmail()) && contraseña.equals(e.getContraseña()) ){
                return e.getIdEmpresa();
            }
        }
        return null;
    }

    public static ArrayList<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public static void cargarLista() {

    }
}
