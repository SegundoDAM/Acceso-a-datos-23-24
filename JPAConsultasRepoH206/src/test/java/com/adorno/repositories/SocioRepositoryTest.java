package com.adorno.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modelo.Contrato;
import com.adorno.modelo.Socio;
import com.adorno.modelo.Tipo;

@SpringBootTest
class SocioRepositoryTest {

	@Autowired
	SocioRepository socioRepository;
	@Autowired
	ContratoRepository contratoRepository;
	
	@BeforeEach
	void beforeEach() {
		 List<Socio> listaSocios = new ArrayList<>();
	        listaSocios.add(new Socio(true, LocalDate.of(2023, 5, 10), "García", "Martín", 100.0f));
	        listaSocios.add(new Socio(false, LocalDate.of(2022, 8, 25), "López", "Sofía", 150.0f));
	        listaSocios.add(new Socio(true, LocalDate.of(2023, 2, 15), "Fernández", "Alejandro", 200.0f));
	        listaSocios.add(new Socio(false, LocalDate.of(2022, 11, 3), "Rodríguez", "Laura", 120.0f));
	        listaSocios.add(new Socio(true, LocalDate.of(2023, 1, 1), "Gómez", "Pablo", 80.0f));
	        listaSocios.add(new Socio(false, LocalDate.of(2023, 4, 5), "Díaz", "Ana", 130.0f));
	        listaSocios.add(new Socio(true, LocalDate.of(2022, 10, 15), "Martínez", "Carlos", 90.0f));
	        listaSocios.add(new Socio(true, LocalDate.of(2022, 7, 8), "Pérez", "Elena", 110.0f));
	        listaSocios.add(new Socio(false, LocalDate.of(2023, 3, 1), "González", "Javier", 160.0f));
	        listaSocios.add(new Socio(true, LocalDate.of(2022, 12, 10), "Sánchez", "Laura", 70.0f));
	        listaSocios.add(new Socio(false, LocalDate.of(2023, 6, 18), "Romero", "Francisco", 180.0f));
	        socioRepository.saveAll(listaSocios);
	        contratoRepository.save(Contrato.builder()
	        		.tipo(Tipo.alquiler)
	        		.socio(socioRepository.findById(1l).get())
	        		.build());
	}
	
	@Test
	void test() {
		int activos=6;
		boolean activo = true;
		assertEquals(activos, socioRepository.findAllByActivo(activo).size());
		LocalDate of = LocalDate.of(2022,12,31);
		assertEquals(activos, 
				socioRepository
				.findAllByFechaAdscripcionAfter(of).size());
		int apellidosSuecos=8;
		String terminacionSueca="ez";
		assertEquals(apellidosSuecos, socioRepository.findAllByApellidosEndsWith(terminacionSueca).size());
		Long idSocio=1l;
		int contratos=1;
		assertEquals(contratos, contratoRepository.findAllBySocio(socioRepository.findById(1l).get()).size());
		int lauras=2;
		String socio = "Laura";
//		assertEquals(lauras, contratoRepository.findAllBySocioNombreLike("Laura").size());
		assertEquals(1, contratoRepository.findAllBySocioNombre("Martín").size());
	}

}
