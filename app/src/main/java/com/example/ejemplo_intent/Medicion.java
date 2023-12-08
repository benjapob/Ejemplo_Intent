package com.example.ejemplo_intent;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Medicion implements Serializable {
    private int idMed;
    private String gas;
    private String acidoSulf;
    private String azufre;
    private Integer idEmpresa;
    private String ubicacion;
    private String fechaMedicion;
    private boolean activo;

    public Medicion(int idMed, String gas, String acidoSulf, String azufre, String ubicacion, Integer idEmpresa) {
        this.idMed = idMed;
        this.gas = gas;
        this.acidoSulf = acidoSulf;
        this.azufre = azufre;
        this.idEmpresa = idEmpresa;
        this.ubicacion = ubicacion;
        this.activo = true;
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String fecha = df.format(c);
        SimpleDateFormat df2 = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String hora = df2.format(c);
        this.fechaMedicion =  fecha + " " + hora;
    }

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getAcidoSulf() {
        return acidoSulf;
    }

    public void setAcidoSulf(String acidoSulf) {
        this.acidoSulf = acidoSulf;
    }

    public String getAzufre() {
        return azufre;
    }

    public void setAzufre(String azufre) {
        this.azufre = azufre;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}