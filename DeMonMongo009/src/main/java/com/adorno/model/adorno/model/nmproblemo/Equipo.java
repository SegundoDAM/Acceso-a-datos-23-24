package com.adorno.model.adorno.model.nmproblemo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "equipos")
@Data
@NoArgsConstructor
public class Equipo {
	@Id
	private String id;
	private String nonmbre;
//	@DBRef
	private List<Usuario> jugadores;
	
	public Equipo(String nonmbre, List<Usuario> jugadores) {
		super();
		this.nonmbre = nonmbre;
		this.jugadores = jugadores;
	}
	
	
}
