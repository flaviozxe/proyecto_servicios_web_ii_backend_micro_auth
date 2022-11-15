package com.micro.auth.service;

import java.util.List;

import com.micro.auth.entity.Rol;


public interface RolService {
	
	public Rol buscarRolporId(Long id);
	
	public Rol buscarRolNombre(String rolNombre);
	
	public List<Rol> listarRol();

}
