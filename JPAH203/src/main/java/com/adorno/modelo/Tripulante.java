package com.adorno.modelo;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Tripulante extends Persona {
	private String categoria;

	public Tripulante(Long id, String nombre, String categoria) {
		super(id, nombre);
		this.categoria=categoria;
	}	
	
}
