package com.adorno.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adorno.modelo.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Long> {
//	Quiero una lista de los socios activos
	public List<Socio> findAllByActivo(boolean activo);
	//quiero un lista de socios posteriores a un fecha dada
	public List<Socio> findAllByFechaAdscripcionAfter(LocalDate fecha);
	// socios cuyo apellido termine en un valor dado
	public List<Socio> findAllByApellidosEndsWith(String endingString);
	//socios dados de alta entre dos fechas dadas
}
