package com.adorno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adorno.modelo.PacienteQuirofanoCirujano;
import com.adorno.modelo.PacienteQuirofanoCirujanoKey;

public interface PacienteQuirofanoCirujanoRepository extends JpaRepository<PacienteQuirofanoCirujano, PacienteQuirofanoCirujanoKey> {

}
