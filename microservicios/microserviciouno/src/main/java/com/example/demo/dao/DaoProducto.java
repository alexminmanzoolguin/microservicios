package com.example.demo.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Producto;

public interface DaoProducto extends CrudRepository<Producto,Long>{

	
}
