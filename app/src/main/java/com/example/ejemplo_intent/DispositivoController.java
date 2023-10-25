package com.example.ejemplo_intent;

import java.util.ArrayList;
import java.util.Random;

public class DispositivoController {
    private static ArrayList<Dispositivo> listaDispositivo = new ArrayList<>();

    public static void addDispositivo(Dispositivo d) {
        listaDispositivo.add(d);
    }

    public static Dispositivo findDispositivo(int id) {
        for (Dispositivo e : listaDispositivo) {
            if (id == e.getIdDispositivo()){
                return e;
            }
        }
        return null;
    }

    public static ArrayList<Dispositivo> getListaDispositivo() {
        return listaDispositivo;
    }

    public static void cargarLista() {
    }
}
