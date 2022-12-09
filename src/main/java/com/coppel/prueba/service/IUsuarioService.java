package com.coppel.prueba.service;

import java.util.Optional;

import com.coppel.prueba.model.Usuario;

public interface IUsuarioService {
	
	public Iterable<Usuario> findAll();
	
	public Optional<Usuario> findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void deleteById(Long id);
	
	public Iterable<Usuario> findByNombre(String nombre);
	
	public Iterable<Usuario> findByApellidoPaterno(String apellidoPaterno);
	
	public Iterable<Usuario> findByApellidoMaterno(String apellidoMaterno);
	
	public Iterable<Usuario> findByEmail(String email);
	
	public Iterable<Usuario> findByTelefono(String telefono);
	
	public Iterable<Usuario> findByEdad(Integer edad);

}
