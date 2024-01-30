package com.adorno.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adorno.modelo.Persona;

@Service
public class PersonaService {
	// Esto hace de repo
	ArrayList<Persona> personas;
	private boolean resultado = false;

	public PersonaService() throws Exception {
		personas = new ArrayList<>();
		personas.add(new Persona("1", "Ramos", 32));
		personas.add(new Persona("2", "Elias", 24));
		personas.add(new Persona("3", "Julian", 24));
		personas.add(new Persona("4", "Roberto", 24));
	}

	public ArrayList<Persona> getPersonas() {
		System.out.println("aqui consultandillo");
		return this.personas;
	}

	public boolean addPersona(Persona persona) {
		return this.personas.add(persona);
	}

	private Optional<Persona> findById(int id) {
		return personas.stream().filter((per) -> per.getId() == id).findFirst();
	}

	public boolean delete(int id) {
		return personas.removeIf((per) -> per.getId() == id);
	}
}
