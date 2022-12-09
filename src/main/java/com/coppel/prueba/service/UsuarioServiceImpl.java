package com.coppel.prueba.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coppel.prueba.model.Usuario;
import com.coppel.prueba.repository.IUsuarioReposiroty;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioReposiroty usuarioRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findById(Long id) {
		return usuarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}

	@Override
	public Iterable<Usuario> findByNombre(String nombre) {
		return usuarioRepository.findByNombre(nombre);
	}

	@Override
	public Iterable<Usuario> findByApellidoPaterno(String apellidoPaterno) {
		return usuarioRepository.findByApellidoPaterno(apellidoPaterno);
	}

	@Override
	public Iterable<Usuario> findByApellidoMaterno(String apellidoMaterno) {
		return usuarioRepository.findByApellidoMaterno(apellidoMaterno);
	}

	@Override
	public Iterable<Usuario> findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	@Override
	public Iterable<Usuario> findByTelefono(String telefono) {
		return usuarioRepository.findByTelefono(telefono);
	}

	@Override
	public Iterable<Usuario> findByEdad(Integer edad) {
		return usuarioRepository.findByEdad(edad);
	}

}
