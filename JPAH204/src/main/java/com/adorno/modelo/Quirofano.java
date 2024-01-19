package com.adorno.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quirofano {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
}
