package com.example.ejemplo_intent;

import java.util.ArrayList;

public class MedicionController {
    public static ArrayList<Medicion> listaDispositivoMed = new ArrayList<>();

    public static Medicion addDispositivoMed(String gas, String acidoSulf, String azufre, String ubicacion, Integer idEmpresa) {
        Medicion d = new Medicion(listaDispositivoMed.size()+1, gas, acidoSulf, azufre, ubicacion, idEmpresa);
        listaDispositivoMed.add(d);
        return d;
    }

    public static void removeDispositivoMed(int id) {
        findDispositivoMed(id).setActivo(false);
    }

    public static Medicion findDispositivoMed(int id) {
        for (Medicion d : listaDispositivoMed) {
            if (id == d.getIdMed()){
                return d;
            }
        }
        return null;
    }

    public static ArrayList<Medicion> getListaDispositivoMed() {
        ArrayList<Medicion> listaMedicionesActive = new ArrayList<>();
        for (Medicion d: listaDispositivoMed) {
            if (d.isActivo()){
                listaMedicionesActive.add(d);
            }

        }
        return listaMedicionesActive;
    }
}
