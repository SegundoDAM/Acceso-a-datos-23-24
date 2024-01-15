package com.adorno.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private LocalDate localDate;
	private double amount;
	
	@ManyToOne
	private Persona persona;

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(LocalDate localDate, double amount, Persona persona) {
		super();
		this.localDate = localDate;
		this.amount = amount;
		this.persona = persona;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public double getAmount() {
		return amount;
	}

	public Persona getPersona() {
		return persona;
	}
	
}
