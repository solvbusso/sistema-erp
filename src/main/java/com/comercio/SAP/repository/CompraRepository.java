package com.comercio.SAP.repository;

import com.comercio.SAP.model.Compra;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

public interface CompraRepository extends CrudRepository <Compra, Integer> {

    @Query(value = "select * from compra where month(fecha) = :month", nativeQuery = true)
    Collection<Compra> getComprasByMonth(@Param("month") int month);
}
