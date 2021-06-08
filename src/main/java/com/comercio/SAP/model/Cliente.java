package com.comercio.SAP.model;

import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cliente;

    private String nombre;

    private String cuit;

    private String domicilio;

    private int telefono;

    @OneToOne(cascade = CascadeType.ALL) //cascade cuando hay tablas anidadas
    @JoinColumn(name = "usuario_asignado", referencedColumnName = "id_usuario")
    //primero mi nombre de columna, despues el que referencia de la otra tabla
    private Usuario usuario; //es de clase Base que es la otra tabla

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
