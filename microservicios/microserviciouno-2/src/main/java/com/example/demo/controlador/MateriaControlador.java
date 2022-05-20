package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Materia;

import com.example.demo.servicio.ServiceMateria;

@RestController
public class MateriaControlador {
@Autowired
private ServiceMateria materiaService;
@GetMapping("/listar")
public List<Materia> Lista(){
	return materiaService.findAll();
}
@GetMapping("/listar/{id}")
public Materia detalle(@PathVariable Long id) {
	return materiaService.finById(id);
}

}
