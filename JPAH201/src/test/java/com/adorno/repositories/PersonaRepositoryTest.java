package com.adorno.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modelo.Persona;

@SpringBootTest
class PersonaRepositoryTest {

	@Autowired
	PersonaRepository personaRepository;
	
	@Test
	void test() {
		personaRepository.save(new Persona("Faustino", "Gomex"));
	}

}
