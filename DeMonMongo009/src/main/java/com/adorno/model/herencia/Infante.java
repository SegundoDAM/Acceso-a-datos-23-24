package com.adorno.model.herencia;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//no necesario si es abstract pero si lo es si tiene el id
//da igual si la pones o no. al ser abstract no se crea
//@Document(collection = "infantes")
public abstract class Infante {
	@Id
	private ObjectId id;
	private Long ficha;
	private String nombre;	
	private String direccion;
	
	public Infante(Long ficha, String nombre, String direccion) {
		super();
		this.ficha = ficha;
		this.nombre = nombre;
		this.direccion = direccion;
	}
}
