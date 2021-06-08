package com.comercio.SAP.controller;

import com.comercio.SAP.model.*;
import com.comercio.SAP.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path = "/comercio/ERP")
public class MainController {

    // ------------- INYECCIONES ----------- //

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private ProductoRepository productoRepository;

    // ------------- GET ----------- //

    @GetMapping(path = "/estado/all")
    public @ResponseBody Iterable<Estado> getAllEstados() { return estadoRepository.findAll(); }

    @GetMapping(path = "/estado/all/{id_estado}")
    public @ResponseBody Optional<Estado> getEstadoById(@PathVariable("id_estado") int id_estado) {

        return estadoRepository.findById(id_estado);
    }

    @GetMapping(path = "/rol/all")
    public @ResponseBody Iterable<Rol> getAllRoles() { return rolRepository.findAll(); }

    @GetMapping(path = "/rol/all/{id_rol}")
    public @ResponseBody Optional<Rol> getRolById(@PathVariable("id_rol") int id_rol) {

        return rolRepository.findById(id_rol);
    }

    @GetMapping(path = "/usuario/all")
    public @ResponseBody Iterable<Usuario> getAllUsuarios() { return usuarioRepository.findAll(); }

    @GetMapping (path = "/usuario/all/{id_usuario}")
    public @ResponseBody Optional<Usuario> getUsuarioById(@PathVariable("id_usuario") int id_usuario){

        return usuarioRepository.findById(id_usuario);
    }

    @GetMapping(path = "/proveedor/all")
    public @ResponseBody Iterable<Proveedor> getAllProveedores() { return proveedorRepository.findAll(); }

    @GetMapping(path = "/proveedor/all/{id_proveedor}")
    public @ResponseBody Optional<Proveedor> getProveedorById(@PathVariable("id_proveedor") int id_proveedor) {

        return proveedorRepository.findById(id_proveedor);
    }

    @GetMapping(path = "/cliente/all")
    public @ResponseBody Iterable<Cliente> getAllClientes() { return clienteRepository.findAll(); }

    @GetMapping(path = "/cliente/all/{id_cliente}")
    public @ResponseBody Optional<Cliente> getClienteById(@PathVariable("id_cliente") int id_cliente) {

        return clienteRepository.findById(id_cliente);
    }

    @GetMapping(path = "/compra/all")
    public @ResponseBody Iterable<Compra> getAllCompras() { return compraRepository.findAll(); }

    @GetMapping(path = "/compra/all/{id_compra}")
    public @ResponseBody Optional<Compra> getCompraById(@PathVariable("id_compra") int id_compra) {

        return compraRepository.findById(id_compra);
    }

    @GetMapping(path = "/compra/mes/{month}")
    public @ResponseBody
    Collection<Integer> getComprasByMonth(@PathVariable("month") int month) {

        return compraRepository.getComprasByMonth(month);
    }

    @GetMapping(path = "/venta/all")
    public @ResponseBody Iterable<Venta> getAllVentas() { return ventaRepository.findAll(); }

    @GetMapping(path = "/venta/all/{id_venta}")
    public @ResponseBody Optional<Venta> getVentaById(@PathVariable("id_venta") int id_venta) {

        return ventaRepository.findById(id_venta);
    }

    @GetMapping(path = "/producto/all")
    public @ResponseBody Iterable<Producto> getAllProductos() { return productoRepository.findAll(); }

    @GetMapping(path = "/producto/all/{id_producto}")
    public @ResponseBody Optional<Producto> getProductoById(@PathVariable("id_producto") int id_producto) {

        return productoRepository.findById(id_producto);
    }

    @GetMapping(path = "/producto/proveedor/{idProv}")
    public @ResponseBody
    Collection<Integer> getProductoByProv(@PathVariable("idProv") int idProv) {

        return productoRepository.getProductoByProv(idProv);
    }

    // ------------- POST ----------- //

    @PostMapping(path = "/estado/create", consumes = "application/json", produces = "application/json")
    public Estado createEstado(@RequestBody Estado estado) { return estadoRepository.save(estado); }

    @PostMapping(path = "/rol/create", consumes = "application/json", produces = "application/json")
    public Rol createRol(@RequestBody Rol rol) { return rolRepository.save(rol); }

    @PostMapping(path = "/usuario/create", consumes = "application/json", produces = "application/json")
    public Usuario createUsuario(@RequestBody Usuario usuario) { return usuarioRepository.save(usuario); }

    @PostMapping(path = "/proveedor/create", consumes = "application/json", produces = "application/json")
    public Proveedor createProveedor(@RequestBody Proveedor proveedor) {
        return proveedorRepository.save(proveedor) ;
    }

    @PostMapping(path = "/cliente/create", consumes = "application/json", produces = "application/json")
    public Cliente createCliente(@RequestBody Cliente cliente) { return clienteRepository.save(cliente); }

    @PostMapping(path = "/compra/create", consumes = "application/json", produces = "application/json")
    public Compra createCompra(@RequestBody Compra compra) { return compraRepository.save(compra); }

    @PostMapping(path = "/venta/create", consumes = "application/json", produces = "application/json")
    public Venta createVenta(@RequestBody Venta venta) {
        return ventaRepository.save(venta) ;
    }

    @PostMapping(path = "/producto/create", consumes = "application/json", produces = "application/json")
    public Producto createVenta(@RequestBody Producto producto) {
        return productoRepository.save(producto) ;
    }

    // ------------- PUT ----------- //

    @PutMapping(path = "/estado/update")
    public Estado updateEstado(@RequestBody Estado estado) { return estadoRepository.save(estado); }

    @PutMapping(path = "/rol/update")
    public Rol updateRol(@RequestBody Rol rol) { return rolRepository.save(rol); }

    @PutMapping(path = "/usuario/update")
    public Usuario updateUsuario(@RequestBody Usuario usuario) { return usuarioRepository.save(usuario); }

    @PutMapping(path = "/proveedor/update")
    public Proveedor updateProveedor(@RequestBody Proveedor proveedor) {
        return proveedorRepository.save(proveedor) ;
    }

    @PutMapping(path = "/cliente/update")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente) ;
    }

    @PutMapping(path = "/compra/update")
    public Compra updateCompra(@RequestBody Compra compra) {
        return compraRepository.save(compra) ;
    }

    @PutMapping(path = "/venta/update")
    public Venta updateVenta(@RequestBody Venta venta) {
        return ventaRepository.save(venta) ;
    }

    @PutMapping(path = "/producto/update")
    public Producto updateVenta(@RequestBody Producto producto) {
        return productoRepository.save(producto) ;
    }

    // ------------- DELETE ----------- //

    @DeleteMapping(path = "/estado/delete/{id_estado}")
    public @ResponseBody Iterable<Estado> deleteEstadoById(@PathVariable("id_estado") int id_estado) {

        estadoRepository.deleteById(id_estado);
        return estadoRepository.findAll();
    }

    @DeleteMapping(path = "/rol/delete/{id_rol}")
    public @ResponseBody Iterable<Rol> deleteRolById(@PathVariable("id_rol") int id_rol) {

        rolRepository.deleteById(id_rol);
        return rolRepository.findAll();
    }

    @DeleteMapping(path = "/usuario/delete/{id_usuario}")
    public @ResponseBody Iterable<Usuario> deleteUsuarioById(@PathVariable("id_usuario") int id_usuario) {

        usuarioRepository.deleteById(id_usuario);
        return usuarioRepository.findAll();
    }

    @DeleteMapping(path = "/proveedor/delete/{id_estado}")
    public @ResponseBody Iterable<Proveedor> deleteProveedorById(@PathVariable("id_proveedor") int id_proveedor) {

        proveedorRepository.deleteById(id_proveedor);
        return proveedorRepository.findAll();
    }

    @DeleteMapping(path = "/cliente/delete/{id_cliente}")
    public @ResponseBody Iterable<Cliente> deleteClienteById(@PathVariable("id_cliente") int id_cliente) {

        clienteRepository.deleteById(id_cliente);
        return clienteRepository.findAll();
    }

    @DeleteMapping(path = "/compra/delete/{id_compra}")
    public @ResponseBody Iterable<Compra> deleteCompraById(@PathVariable("id_compra") int id_compra) {

        compraRepository.deleteById(id_compra);
        return compraRepository.findAll();
    }

    @DeleteMapping(path = "/venta/delete/{id_venta}")
    public @ResponseBody Iterable<Venta> deleteVentaById(@PathVariable("id_venta") int id_venta) {

        ventaRepository.deleteById(id_venta);
        return ventaRepository.findAll();
    }







    @DeleteMapping(path = "/producto/delete/{id_producto}")
    public @ResponseBody Iterable<Producto> deleteProductoById(@PathVariable("id_producto") int id_producto) {

        productoRepository.deleteById(id_producto);
        return productoRepository.findAll();
    }


}
