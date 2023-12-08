package com.example.ejemplo_intent;

public class Dispositivo {
    Integer idDispositivo;
    String nombreDispositivo;
    Double acidoSulf;
    Double azufre;
    Double gas;
    Double latitud;
    Double longitud;
    Integer idEmpresa;

    public Dispositivo() {
    }

    public Dispositivo(Integer idDispositivo, String nombreDispositivo, Double acidoSulf, Double azufre, Double gas, Double latitud, Double longitud, Integer idEmpresa) {
        this.idDispositivo = idDispositivo;
        this.nombreDispositivo = nombreDispositivo;
        this.acidoSulf = acidoSulf;
        this.azufre = azufre;
        this.gas = gas;
        this.latitud = latitud;
        this.longitud = longitud;
        this.idEmpresa = idEmpresa;
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

    public Double getAcidoSulf() {
        return acidoSulf;
    }

    public void setAcidoSulf(Double acidoSulf) {
        this.acidoSulf = acidoSulf;
    }

    public Double getAzufre() {
        return azufre;
    }

    public void setAzufre(Double azufre) {
        this.azufre = azufre;
    }

    public Double getGas() {
        return gas;
    }

    public void setGas(Double gas) {
        this.gas = gas;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
