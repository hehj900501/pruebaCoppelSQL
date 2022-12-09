package com.coppel.prueba.dto;

import java.io.Serializable;

import com.coppel.prueba.model.Usuario;

public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 6973203776854367929L;

	private Long id;
	
	private String nombre;
	
	private String apellidoPaterno;

	private String apellidoMaterno;
	
	private String email;
	
	private String telefono;
	
	private Integer edad;
	
	private Boolean isActive;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public UsuarioDTO mapUsuario(Usuario usuario) {
		UsuarioDTO usuarioDto = new UsuarioDTO();
		usuarioDto.setId(usuario.getId());
		usuarioDto.setNombre(usuario.getNombre());
		usuarioDto.setApellidoPaterno(usuario.getApellidoPaterno());
		usuarioDto.setApellidoMaterno(usuario.getApellidoMaterno());
		usuarioDto.setEmail(usuario.getEmail());
		usuarioDto.setTelefono(usuario.getTelefono());
		usuarioDto.setEdad(usuario.getEdad());
		return usuarioDto;
	}
	
}
