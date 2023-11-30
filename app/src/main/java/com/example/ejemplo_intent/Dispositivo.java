package com.example.ejemplo_intent;

public class Dispositivo {
    Integer idDispositivo;
    String nombreDispositivo;
    Float acidoSulf;
    Float azufre;
    Float nox;
    Float latitud;
    Float longitud;
    Empresa empresa;

    public Dispositivo(Integer idDispositivo, String nombreDispositivo, Float gas, Float o2, Float latitud, Float longitud) {
        this.idDispositivo = idDispositivo;
        this.nombreDispositivo = nombreDispositivo;
        this.acidoSulf = acidoSulf;
        this.azufre = azufre;
        this.nox = nox;
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

    public Float getAcidoSulf() {
        return acidoSulf;
    }

    public void setAcidoSulf(Float acidoSulf) {
        this.acidoSulf = acidoSulf;
    }

    public Float getAzufre() {
        return azufre;
    }

    public void setAzufre(Float azufre) {
        this.azufre = azufre;
    }

    public Float getNox() {
        return nox;
    }

    public void setNox(Float nox) {
        this.nox = nox;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
