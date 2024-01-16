package com.adorno.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Partido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Jugador> jugadores=new ArrayList<>();
	
	private String nombre;

	public Partido() {
		super();
	}

	public Partido(String nombre) {
		super();
		this.nombre = nombre;
	}

	public boolean addJugador(Jugador jugador) {
		return jugadores.add(jugador);
	}
	
	
	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public Long getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
