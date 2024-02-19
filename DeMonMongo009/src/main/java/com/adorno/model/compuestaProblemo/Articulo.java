package com.adorno.model.compuestaProblemo;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "articulos")
@CompoundIndexes({
    @CompoundIndex(name = "marca_referencia_index", def = "{'marca': 1, 'referencia': 1}")
})
public class Articulo {
	private Marca marca;
	private Long referencia;
}
