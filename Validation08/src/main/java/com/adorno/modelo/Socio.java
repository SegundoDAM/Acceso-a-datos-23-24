package com.adorno.modelo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Socio {
	@Min(value = 1,message = "que chico eres")
	private int id;
	@Size(min = 2, max = 30)
	@NotBlank
	private String nombre;
	@Positive
	@Max(value = 100)
	private int edad;
}
