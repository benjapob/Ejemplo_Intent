package com.example.ejemplo_intent;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Medicion implements Serializable {
    private int idMed;
    //usar la clase dispositivo en vez de atributos
    private String gasConc;
    private String o2Conc;
    private String fechaMedicion;
    private Dispositivo dispositivo;
    private boolean activo;

    public Medicion(int idMed, String gasConc, String o2Conc, String ubicacion) {
        this.idMed = idMed;
        this.gasConc = gasConc;
        this.o2Conc = o2Conc;
        this.activo = true;
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String fecha = df.format(c);
        SimpleDateFormat df2 = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String hora = df2.format(c);
        this.fechaMedicion =  fecha + " " + hora;
        //this.dispositivo = dispositivo;
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getGasConc() {
        return gasConc;
    }

    public void setGasConc(String gasConc) {
        this.gasConc = gasConc;
    }

    public String getO2Conc() {
        return o2Conc;
    }

    public void setO2Conc(String o2Conc) {
        this.o2Conc = o2Conc;
    }

    public String getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(String fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
}