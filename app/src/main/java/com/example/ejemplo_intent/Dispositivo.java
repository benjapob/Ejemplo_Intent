package com.example.ejemplo_intent;

public class Dispositivo {
    int idDisp;
    String nombreDisp;
    String ubiDisp;

    public Dispositivo(int idDisp, String nombreDisp, String ubiDisp) {
        this.idDisp = idDisp;
        this.nombreDisp = nombreDisp;
        this.ubiDisp = ubiDisp;
    }

    public int getIdDisp() {
        return idDisp;
    }

    public void setIdDisp(int idDisp) {
        this.idDisp = idDisp;
    }

    public String getNombreDisp() {
        return nombreDisp;
    }

    public void setNombreDisp(String nombreDisp) {
        this.nombreDisp = nombreDisp;
    }

    public String getUbiDisp() {
        return ubiDisp;
    }

    public void setUbiDisp(String ubiDisp) {
        this.ubiDisp = ubiDisp;
    }
}