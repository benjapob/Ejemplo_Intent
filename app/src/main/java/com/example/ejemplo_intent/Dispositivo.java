package com.example.ejemplo_intent;

public class Dispositivo {
    Integer idDispositivo;
    String nombreDispositivo;
    String acidoSulf;
    String azufre;
    String gas;
    String latitud;
    String longitud;
    Integer idEmpresa;

    public Dispositivo() {
    }

    public Dispositivo(Integer idDispositivo, String nombreDispositivo, String acidoSulf, String azufre, String gas, String latitud, String longitud, Integer idEmpresa) {
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

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
