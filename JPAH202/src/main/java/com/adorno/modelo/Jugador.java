package com.adorno.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Jugador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String apodo;

	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "jugadores")
	private List<Partido> partidos=new ArrayList<>();
	
	
	public Jugador() {
		super();
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public Jugador(String apodo) {
		super();
		this.apodo = apodo;
	}

	public Long getId() {
		return id;
	}

	public String getApodo() {
		return apodo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apodo, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(apodo, other.apodo) && Objects.equals(id, other.id);
	}

}
