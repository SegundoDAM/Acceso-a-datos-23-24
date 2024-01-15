package com.adorno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adorno.modelo.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
