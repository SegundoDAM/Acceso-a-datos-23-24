package com.adorno.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Viajero extends Persona {
	private LocalDate fechaAlta;

	public Viajero(Long id, String nombre,LocalDate fecha) {
		super(id, nombre);
		this.fechaAlta=fecha;
	}

	
	
}
