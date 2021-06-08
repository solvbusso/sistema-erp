package com.comercio.SAP.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "compras", "ventas"})
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_producto;

    private String nombre;

    private double costo;

    private double precio;

    private int stock_critico;

    private int stock_optimo;

    @ManyToMany(mappedBy = "productos")
    Set<Compra> compras;

    @ManyToMany(mappedBy = "productos")
    Set<Venta> ventas;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    private Proveedor proveedor;

    public int getId_producto() { return id_producto; }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock_critico() {
        return stock_critico;
    }

    public void setStock_critico(int stock_critico) {
        this.stock_critico = stock_critico;
    }

    public int getStock_optimo() {
        return stock_optimo;
    }

    public void setStock_optimo(int stock_optimo) {
        this.stock_optimo = stock_optimo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Set<Compra> getCompras() {
        return compras;
    }

    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }

    public Set<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(Set<Venta> ventas) {
        this.ventas = ventas;
    }
}
