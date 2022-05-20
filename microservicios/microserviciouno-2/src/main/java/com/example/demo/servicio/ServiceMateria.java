package com.example.demo.servicio;
import java.util.List;
import com.example.demo.entity.Materia;


public interface ServiceMateria {
public List<Materia> findAll();
public Materia finById(Long id);
}
