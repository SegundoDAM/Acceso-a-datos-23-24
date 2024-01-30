package com.adorno.modelo;

import lombok.Data;

@Data
public class Edad {
	private int edad;

	public Edad(int edad){
		super();
		if(edad>89||edad<18) throw new IllegalArgumentException("edad no valida");
		this.edad = edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
}
