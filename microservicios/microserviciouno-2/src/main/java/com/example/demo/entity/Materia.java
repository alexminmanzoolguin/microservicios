package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materia")
public class Materia implements Serializable{

	
	private static final long serialVersionUID = 5408277096551053987L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String NombreMateria;

private String Profesor;

private Double Matricula;


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNombreMateria() {
	return NombreMateria;
}

public void setNombreMateria(String nombreMateria) {
	NombreMateria = nombreMateria;
}

public String getProfesor() {
	return Profesor;
}

public void setProfesor(String profesor) {
	Profesor = profesor;
}

public Double getMatricula() {
	return Matricula;
}

public void setMatricula(Double matricula) {
	Matricula = matricula;
}



	

}
