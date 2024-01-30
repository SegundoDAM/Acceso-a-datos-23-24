package com.adorno.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adorno.modelo.Persona;
import com.adorno.modelo.Socio;
import com.adorno.services.PersonaService;
import com.adorno.services.SocioServiceMock;

import jakarta.validation.Valid;

@Controller
@RequestMapping("personal")
public class PersonaController {
	
	private final PersonaService personaService;
	private final SocioServiceMock socioServiceMock;
	
	
	public PersonaController(PersonaService personaService, SocioServiceMock socioServiceMock) {
		super();
		this.personaService = personaService;
		this.socioServiceMock = socioServiceMock;
	}


	@GetMapping("todos")
	public ResponseEntity<List<Persona>> getAll(){
		return ResponseEntity.ok().body(personaService.getPersonas());
	}

	@PostMapping("nueva")
	public ResponseEntity<Boolean> add(@RequestBody Persona persona){
		return ResponseEntity.ok(personaService.addPersona(persona));
	}
	@PostMapping("nuevoSocio")
	public ResponseEntity<Boolean> add(@Valid @RequestBody Socio socio){
		return ResponseEntity.ok(socioServiceMock.add(socio));
	}
}
