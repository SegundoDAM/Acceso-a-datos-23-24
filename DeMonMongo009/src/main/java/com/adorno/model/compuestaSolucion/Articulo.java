package com.adorno.model.compuestaSolucion;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "articulosb")

public class Articulo {
	@Id
	private ArticuloId id;
	private String descripcion;
}
