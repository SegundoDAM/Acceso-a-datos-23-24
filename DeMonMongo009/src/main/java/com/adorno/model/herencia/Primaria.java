package com.adorno.model.herencia;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Document(collection = "primarias")
public class Primaria extends Infante {

	private String otros;

	public Primaria(Long ficha, String nombre, String direccion, String otros) {
		super(ficha, nombre, direccion);
		this.otros = otros;
	}
	
}
