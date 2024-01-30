package com.adorno.modelo;

import lombok.Data;

@Data
public class Persona {
	private int id;
	private DNI dni;
	private String nombre;
	private Edad edad;
	private Float ff;

	public Persona(String dni, String nombre, int edad) throws Exception {
		super();
		this.dni = new DNI(dni);
		this.nombre = nombre;
		this.edad = new Edad(edad);
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	public void update(Persona persona) {
		setId(persona.getId());
		setNombre(persona.getNombre());
		edad.setEdad(this.getEdad());
	}

	public String getDNI() {
		return dni.getNumero();
	}
	
	public int getEdad() {
		return edad.getEdad();
	}
	
}
