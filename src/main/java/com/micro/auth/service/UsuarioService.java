package com.micro.auth.service;

import java.util.Set;

import com.micro.auth.entity.Usuario;
import com.micro.auth.entity.UsuarioRol;



public interface UsuarioService {
	 public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
	 
	 public Usuario actualizarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

	 
	    public Usuario obtenerUsuario(String username);

	    public void eliminarUsuario(Long usuarioId);
}
