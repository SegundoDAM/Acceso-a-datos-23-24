package com.adorno.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modelo.Persona;

@SpringBootTest
class PersonaServiceTest {

	@Autowired
	PersonaService personaService;
	
	@Test
	void testPersonaService() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPersonas() {
		fail("Not yet implemented");
	}

	@Test
	void testAddPersona() {
		try {
			personaService.addPersona(new Persona("5", "Estaban", 11));
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
