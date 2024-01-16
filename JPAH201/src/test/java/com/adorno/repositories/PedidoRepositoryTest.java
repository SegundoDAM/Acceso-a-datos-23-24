package com.adorno.repositories;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modelo.Pedido;
import com.adorno.modelo.Persona;

@SpringBootTest
class PedidoRepositoryTest {

	@Autowired
	PedidoRepository pedidoRepository;

	@Autowired
	PersonaRepository personaRepository;
	@Test
	void test() {
		Persona persona = new Persona("Faustino", "Gomex");
		personaRepository.save(persona);
		pedidoRepository.save(new Pedido(LocalDate.now(),1,persona));
		pedidoRepository.save(new Pedido(LocalDate.now(),2,persona));
		pedidoRepository.save(new Pedido(LocalDate.now(),3,persona));
		pedidoRepository.save(new Pedido(LocalDate.now(),4,persona));
		pedidoRepository.save(new Pedido(LocalDate.now(),5,persona));
		List<Pedido> byPersona = pedidoRepository.findByPersona(personaRepository.findById(1L).get());
		System.err.println();
	}

}
