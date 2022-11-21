package com.spring.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.app.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
