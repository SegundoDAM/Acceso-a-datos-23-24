package com.adorno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adorno.modelo.Partido;

public interface PartidoRepositorio extends JpaRepository<Partido, Long> {
}
