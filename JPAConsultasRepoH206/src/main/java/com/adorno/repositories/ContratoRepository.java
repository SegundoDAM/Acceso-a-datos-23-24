package com.adorno.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adorno.modelo.Contrato;
import com.adorno.modelo.Socio;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long> {
	public List<Contrato> findAllBySocio(Socio socio);
	public List<Contrato> findAllBySocioNombre(String socio);
}
