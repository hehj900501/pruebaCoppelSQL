package com.coppel.prueba.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coppel.prueba.model.Usuario;
import com.coppel.prueba.service.IUsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuairoController {

	@Autowired
	private IUsuarioService usuarioService;

	// BUSCAR POR ID
	@GetMapping("/{usuarioId}")
	public ResponseEntity<?> findById(@PathVariable Long usuarioId) {
		Optional<Usuario> oUsuario = usuarioService.findById(usuarioId);

		if (!oUsuario.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(oUsuario);
	}

	// MOSTRAR TODOS
	@GetMapping("/listar")
	public ResponseEntity<?> showAllUsuarios() {
		Iterable<Usuario> usuarios = usuarioService.findAll();
		return ResponseEntity.ok(usuarios);
	}

	// CREAR NUEVO USUARIO
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Usuario usuario) {
		Usuario responseUsuario = usuarioService.save(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(responseUsuario);
	}

	// ACTUALIZAR USUARIO
	@PutMapping("/{usuarioId}")
	public ResponseEntity<?> update(@RequestBody Usuario usuario, @PathVariable Long usuarioId) {
		Optional<Usuario> oUsuairo = usuarioService.findById(usuarioId);

		if (!oUsuairo.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		oUsuairo.get().setNombre(usuario.getNombre());
		oUsuairo.get().setApellidoPaterno(usuario.getApellidoPaterno());
		oUsuairo.get().setApellidoMaterno(usuario.getApellidoMaterno());
		oUsuairo.get().setEmail(usuario.getEmail());
		oUsuairo.get().setTelefono(usuario.getTelefono());
		oUsuairo.get().setEdad(usuario.getEdad());
		oUsuairo.get().setIsActive(usuario.getIsActive());

		Usuario responseUsuario = usuarioService.save(oUsuairo.get());
		return ResponseEntity.status(HttpStatus.CREATED).body(responseUsuario);
	}

	// ELIMINAR USUARIO
	@DeleteMapping("/{usuarioId}")
	public ResponseEntity<?> delete(@PathVariable Long usuarioId) {
		Optional<Usuario> oUsuairo = usuarioService.findById(usuarioId);

		if (!oUsuairo.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		oUsuairo.get().setIsActive(false);
		usuarioService.save(oUsuairo.get()); // BORRADO LOGICO
		return ResponseEntity.ok().build();
	}

	// BUSCAR POR NOMBRE
	@GetMapping("/buscar/nombre/{usuarioNombre}")
	public ResponseEntity<?> findByNombre(@PathVariable String usuarioNombre) {
		Iterable<Usuario> usuarios = usuarioService.findByNombre(usuarioNombre);
		return ResponseEntity.ok(usuarios);
	}

	// BUSCAR POR APELLIDO PATERNO
	@GetMapping("/buscar/apellido_paterno/{usuarioApellidoPaterno}")
	public ResponseEntity<?> findByApellidoPaterno(@PathVariable String usuarioApellidoPaterno) {
		Iterable<Usuario> usuarios = usuarioService.findByApellidoPaterno(usuarioApellidoPaterno);
		return ResponseEntity.ok(usuarios);
	}

	// BUSCAR POR APELLIDO MATERMNO
	@GetMapping("/buscar/apellido_materno/{usuarioApellidoMaterno}")
	public ResponseEntity<?> findByApellidoMaterno(@PathVariable String usuarioApellidoMaterno) {
		Iterable<Usuario> usuarios = usuarioService.findByApellidoMaterno(usuarioApellidoMaterno);
		return ResponseEntity.ok(usuarios);
	}

	// BUSCAR POR EMAIL
	@GetMapping("/buscar/email/{usuarioEmail}")
	public ResponseEntity<?> findByEmail(@PathVariable String usuarioEmail) {
		Iterable<Usuario> usuarios = usuarioService.findByEmail(usuarioEmail);
		return ResponseEntity.ok(usuarios);
	}

	// BUSCAR POR TELEFONO
	@GetMapping("/buscar/telefono/{usuarioTelefono}")
	public ResponseEntity<?> findByTelefono(@PathVariable String usuarioTelefono) {
		Iterable<Usuario> usuarios = usuarioService.findByTelefono(usuarioTelefono);
		return ResponseEntity.ok(usuarios);
	}

	// BUSCAR POR EDAD
	@GetMapping("/buscar/edad/{usuarioEdad}")
	public ResponseEntity<?> findByEdad(@PathVariable Integer usuarioEdad) {
		Iterable<Usuario> usuarios = usuarioService.findByEdad( usuarioEdad);
		return ResponseEntity.ok(usuarios);
	}

}
