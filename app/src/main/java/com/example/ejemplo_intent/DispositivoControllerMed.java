package com.example.ejemplo_intent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class DispositivoControllerMed {
    private static ArrayList<DispositivoMed> listaDispositivoMed = new ArrayList<>();

    public static void addDispositivoMed(String gasConc, String o2Conc) {
        DispositivoMed d = new DispositivoMed(listaDispositivoMed.size()+1, gasConc, o2Conc);
        listaDispositivoMed.add(d);
    }

    public static void removeDispositivoMed(int id) {
        listaDispositivoMed.remove(id);
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
        /*if (listaDispositivoMed.size() == 0) {
            addDispositivoMed( "50 (Media)", "20 (Baja)");
            addDispositivoMed( "80 (Alta)", "20 (Baja)");
            addDispositivoMed( "10 (Baja)", "50 (Media)");
        }*/
    }
}
