package com.adorno.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Contrato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String descripcion;

	@OneToOne
	private Persona persona;
	
	public Contrato() {
		super();
	}

	public Contrato(String descripcion, Persona persona) {
		super();
		this.descripcion = descripcion;
		this.persona = persona;
	}

	public Persona getPersona() {
		return persona;
	}

	public Long getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
