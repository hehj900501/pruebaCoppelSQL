package com.coppel.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coppel.prueba.model.Usuario;

@Repository
public interface IUsuarioReposiroty extends JpaRepository<Usuario, Long>{
	
	@Transactional(readOnly = true)
	Iterable<Usuario> findByNombre(String nombre);
	
	@Transactional(readOnly = true)
	Iterable<Usuario> findByApellidoPaterno(String apellidoPaterno);
	
	@Transactional(readOnly = true)
	Iterable<Usuario> findByApellidoMaterno(String apellidoMaterno);
	
	@Transactional(readOnly = true)
	Iterable<Usuario> findByEmail(String email);
	
	@Transactional(readOnly = true)
	Iterable<Usuario> findByTelefono(String telefono);
	
	@Transactional(readOnly = true)
	Iterable<Usuario> findByEdad(Integer edad);

}
