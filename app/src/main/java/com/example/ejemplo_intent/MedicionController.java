package com.example.ejemplo_intent;

import java.util.ArrayList;

public class MedicionController {
    private static ArrayList<Medicion> listaDispositivoMed = new ArrayList<>();

    public static void addDispositivoMed(String gasConc, String o2Conc, String ubicacion) {
        Medicion d = new Medicion(listaDispositivoMed.size()+1, gasConc, o2Conc, ubicacion);
        listaDispositivoMed.add(d);
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

    public static ArrayList<Medicion> cargarLista(int idDispositivo) {
        /*if (listaDispositivoMed.size() == 0) {
            addDispositivoMed( "50 (Media)", "20 (Baja)", "66");
            addDispositivoMed( "80 (Alta)", "20 (Baja)", "77");
            addDispositivoMed( "10 (Baja)", "50 (Media)", "77");
        }*/
        ArrayList<Medicion> listaMediciones = new ArrayList<>();
        return listaMediciones;
    }
}
