package com.example.demo.servicio;

import java.util.List;

import com.example.demo.entity.Producto;

public interface ServiceProducto {
	public List<Producto> findAll();
	public Producto finById(Long id);
}
