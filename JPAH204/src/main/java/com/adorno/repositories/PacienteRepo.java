package com.adorno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adorno.modelo.Paciente;

public interface PacienteRepo extends JpaRepository<Paciente, Long>{

}
