package com.adorno.modelo;

import java.time.LocalDate;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Socio {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@NonNull
	private boolean activo;
	@NonNull
	private LocalDate fechaAdscripcion;
	@NonNull
	private String apellidos,nombre;
	@NonNull
	private float saldo;
	
	public Socio(boolean activo, LocalDate fechaAdscripcion, String apellidos, String nombre, float saldo) {
		super();
		this.activo = activo;
		this.fechaAdscripcion = fechaAdscripcion;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	
}
