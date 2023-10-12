package com.example.ejemplo_intent;

import java.util.ArrayList;
import java.util.Random;

public class DispositivoControllerMed {
    private static ArrayList<DispositivoMed> listaDispositivoMed = new ArrayList<>();

    public static void addDispositivoMed(int id, String gasConc, String o2Conc) {
        DispositivoMed d = new DispositivoMed(id, gasConc, o2Conc);
        listaDispositivoMed.add(d);
    }

    public static DispositivoMed findDispositivoMed(int id) {
        for (DispositivoMed d : listaDispositivoMed) {
            if (id == d.getIdMed()){
                return d;
            }
        }
        return null;
    }

    public static ArrayList<DispositivoMed> getListaDispositivoMed() {
        return listaDispositivoMed;
    }

    public static void cargarLista() {
        Random r = new Random();

        if (listaDispositivoMed.size() == 0) {
            addDispositivoMed(1, "50 (Media)", "20 (Baja)");
            addDispositivoMed(2, "80 (Alta)", "20 (Baja)");
            addDispositivoMed(3, "10 (Baja)", "50 (Media)");
        }
    }
}
