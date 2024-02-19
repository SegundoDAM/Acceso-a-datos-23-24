package com.adorno.model.adorno.model.nmproblemo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "usuarios")
@Data
@NoArgsConstructor
public class Usuario {

	@Id
	private String id;
	private String nombre;
	private String email;
	private List<Equipo> equipos;
	
	public Usuario(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.equipos=new ArrayList();
	}

	public void addEquipo(Equipo equipo) {
		this.equipos.add(equipo);
	}
	// Getters y setters
	
}
