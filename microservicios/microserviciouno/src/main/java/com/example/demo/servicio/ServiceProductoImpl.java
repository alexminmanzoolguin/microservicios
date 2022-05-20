package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoProducto;
import com.example.demo.entity.Producto;

@Service
public class ServiceProductoImpl implements ServiceProducto{
	@Autowired
	private DaoProducto productoDao;

	@Override
	//@Transactional(readOnly = true)
	public List<Producto> findAll() {
		
		return (List<Producto>)productoDao.findAll();
	}

	@Override
	//@Transactional(readOnly = true)
	public Producto finById(Long id) {
		
		return productoDao.findById(id).orElse(null);
	}

	

}
