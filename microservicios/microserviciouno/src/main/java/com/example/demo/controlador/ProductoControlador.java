package com.example.demo.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.entity.Producto;
import com.example.demo.servicio.ServiceProducto;


@RestController
public class ProductoControlador {
@Autowired
private ServiceProducto productoService;

@GetMapping("/listar")
public List<Producto> Lista(){
	return productoService.findAll();
}
@GetMapping("/listar/{id}")
public Producto detalle(@PathVariable Long id) {
	return productoService.finById(id);
}
}
