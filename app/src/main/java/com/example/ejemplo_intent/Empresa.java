package com.example.ejemplo_intent;

import java.io.Serializable;

public class Empresa {
    private Integer idEmpresa;
    private String nombreEmpresa;
    private String rutEmpresa;
    private String contraseña;
    private String email;
    private String telefono;
    private DispositivoControllerMed listaMed;

    public Empresa(Integer idEmpresa, String nombreEmpresa, String rutEmpresa, String contraseña, String email, String telefono) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.rutEmpresa = rutEmpresa;
        this.contraseña = contraseña;
        this.email = email;
        this.telefono = telefono;
        this.listaMed = new DispositivoControllerMed();
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public DispositivoControllerMed getListaMed() {
        return listaMed;
    }

    public void setListaMed(DispositivoControllerMed listaMed) {
        this.listaMed = listaMed;
    }
}
