package com.adorno.modeloDos;

import com.adorno.modelo.Piloto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Socio extends Humano{
	private String cosas;
}
