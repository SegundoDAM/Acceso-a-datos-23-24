package com.adorno.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Contrato {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
	@Enumerated(EnumType.STRING)
	public Tipo tipo;
	@ManyToOne
	public Socio socio;

}
