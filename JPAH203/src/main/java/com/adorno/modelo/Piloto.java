package com.adorno.modelo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Piloto extends Tripulante {
	private boolean internacional;

	public Piloto(Long id, String nombre, String categoria,boolean internacional) {
		super(id, nombre, categoria);
		this.internacional=internacional;
	}

}
