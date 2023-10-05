package com.example.ejemplo_intent;

public class Dispositivo {
    int idDisp;
    String nombreDisp;
    String ubiDisp;
    String gas;
    String dueño;

    public Dispositivo(int idDisp, String nombreDisp, String ubiDisp, String gas, String dueño) {
        this.idDisp = idDisp;
        this.nombreDisp = nombreDisp;
        this.ubiDisp = ubiDisp;
        this.gas = gas;
        this.dueño = dueño;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
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