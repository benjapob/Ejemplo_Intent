package com.example.ejemplo_intent;

public class Dispositivo {
    Integer idDispositivo;
    String nombreDispositivo;
    Float gas;
    Float o2;
    Float latitud;
    Float longitud;

    public Dispositivo(Integer idDispositivo, String nombreDispositivo, Float gas, Float o2, Float latitud, Float longitud) {
        this.idDispositivo = idDispositivo;
        this.nombreDispositivo = nombreDispositivo;
        this.gas = gas;
        this.o2 = o2;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Integer getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(Integer idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public Float getGas() {
        return gas;
    }

    public void setGas(Float gas) {
        this.gas = gas;
    }

    public Float getO2() {
        return o2;
    }

    public void setO2(Float o2) {
        this.o2 = o2;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }
}
