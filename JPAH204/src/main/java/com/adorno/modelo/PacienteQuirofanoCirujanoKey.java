package com.adorno.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//no es una entity pero es serializable. 
public class PacienteQuirofanoCirujanoKey implements Serializable{
	private static final long serialVersionUID = 1L;
	private Quirofano quirofano;
	private Paciente paciente;
	private Cirujano cirujano;
	private LocalDate fecha;
}
