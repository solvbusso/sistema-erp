package com.comercio.SAP.repository;
import com.comercio.SAP.model.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface ProductoRepository extends CrudRepository <Producto, Integer> {

    @Query(value = "select * from producto where id_proveedor = :idProv", nativeQuery = true)
    Collection<Integer> getProductoByProv(@Param("idProv") int idProv);
}
