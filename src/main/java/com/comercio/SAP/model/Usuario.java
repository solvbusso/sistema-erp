package com.comercio.SAP.model;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_usuario;

    private String nombre;
    private String domicilio;
    private int telefono;

    @OneToOne(cascade = CascadeType.ALL) //cascade cuando hay tablas anidadas
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    //primero mi nombre de columna, despues el que referencia de la otra tabla
    private Rol rol; //es de clase Base que es la otra tabla

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
