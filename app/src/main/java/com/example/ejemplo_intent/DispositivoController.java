package com.example.ejemplo_intent;

import java.util.ArrayList;

public class DispositivoController {
    private static ArrayList<Dispositivo> listaDispositivo = new ArrayList<>();

    public static void addDispositivo(int id, String nombre, String ubicacion) {
        Dispositivo d = new Dispositivo(id, nombre, ubicacion);
        listaDispositivo.add(d);
    }

    public static Dispositivo findDispositivo(int id) {
        for (Dispositivo d : listaDispositivo) {
            if (id == d.getIdDisp()){
                return d;
            }
        }
        return null;
    }

    public static ArrayList<Dispositivo> getListaDispositivo() {
        return listaDispositivo;
    }

    public static void cargarLista() {
        if (listaDispositivo.size() == 0) {
            addDispositivo(1,"Sensor 1", "Cocina");
            addDispositivo(2, "Sensor 2", "Pasillo");
            addDispositivo(3, "Sensor 3", "Living");
        }
    }
}
