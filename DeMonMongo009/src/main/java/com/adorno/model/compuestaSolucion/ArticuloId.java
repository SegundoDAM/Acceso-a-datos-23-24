package com.adorno.model.compuestaSolucion;

import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloId {
	@DBRef
	public Marca marca;
	public Long referencia;
}