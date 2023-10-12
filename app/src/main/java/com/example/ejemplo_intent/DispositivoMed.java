package com.example.ejemplo_intent;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DispositivoMed {
    int idMed;
    String gasConc;
    String o2Conc;
    String fechaMedicion;

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

    public DispositivoMed(int idMed, String gasConc, String o2Conc) {
        this.idMed = idMed;
        this.gasConc = gasConc;
        this.o2Conc = o2Conc;
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String fecha = df.format(c);
        SimpleDateFormat df2 = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String hora = df2.format(c);
        this.fechaMedicion =  fecha + " " + hora;
    }

}