package com.adorno.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modelo.Contrato;
import com.adorno.modelo.Persona;

@SpringBootTest
class ContratoRepositoryTest {

	@Autowired
	ContratoRepository contratoRepository;
	@Autowired
	PersonaRepository personaRepository;
	
	@Test
	void test() {
		Persona persona = new Persona("Joaquin", "Sabina");
		personaRepository.save(persona);
		contratoRepository.save(new Contrato("vida", persona));
		Persona persona2 = new Persona("Felix", "Sabina");
		personaRepository.save(persona2);
	}
	
	@Test
	void test2() {
		Optional<Persona> byId = personaRepository.findById(2L);
		byId.ifPresent(per->{
			contratoRepository.save(new Contrato("hogar", per));
		});
	}

}
