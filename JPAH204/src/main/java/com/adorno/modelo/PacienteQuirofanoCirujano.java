package com.adorno.modelo;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@IdClass(PacienteQuirofanoCirujanoKey.class)
public class PacienteQuirofanoCirujano {
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	private Quirofano quirofano;
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	private Paciente paciente;
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	private Cirujano cirujano;
	@Id
	private LocalDate fecha;
	private String resultado;
}
