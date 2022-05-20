package com.example.demo.servicio;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoMateria;
import com.example.demo.entity.Materia;

@Service
public abstract class ServiceMateriaImpl implements ServiceMateria{
@Autowired
private DaoMateria materiaDao;

@Override
//@Transactional(readOnly = true)
public List<Materia> findAll() {
	
	return (List<Materia>)materiaDao.findAll();
}

@Override
//@Transactional(readOnly = true)
public Materia finById(Long id) {
	
	return materiaDao.findById(id).orElse(null);
}


}
