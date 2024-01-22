package com.adorno.repositories;

import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modelo.Socio;

@SpringBootTest
class SocioRepositoryTest {

	@Autowired
	SocioRepository socioRepository;
	
	@BeforeEach
	void beforeEach() {
		 List<Socio> listaSocios = new ArrayList<>();

	        listaSocios.add(new Socio(true, LocalDate.of(2023, 5, 10), "García", "Martín", 100.0f));
	        listaSocios.add(new Socio(false, LocalDate.of(2022, 8, 25), "López", "Sofía", 150.0f));
	        listaSocios.add(new Socio(true, LocalDate.of(2023, 2, 15), "Fernández", "Alejandro", 200.0f));
	        listaSocios.add(new Socio(false, LocalDate.of(2022, 11, 3), "Rodríguez", "Laura", 120.0f));
	        listaSocios.add(new Socio(true, LocalDate.of(2023, 1, 20), "Gómez", "Pablo", 80.0f));
	        listaSocios.add(new Socio(false, LocalDate.of(2023, 4, 5), "Díaz", "Ana", 130.0f));
	        listaSocios.add(new Socio(true, LocalDate.of(2022, 10, 15), "Martínez", "Carlos", 90.0f));
	        listaSocios.add(new Socio(true, LocalDate.of(2022, 7, 8), "Pérez", "Elena", 110.0f));
	        listaSocios.add(new Socio(false, LocalDate.of(2023, 3, 1), "González", "Javier", 160.0f));
	        listaSocios.add(new Socio(true, LocalDate.of(2022, 12, 10), "Sánchez", "Isabel", 70.0f));
	        listaSocios.add(new Socio(false, LocalDate.of(2023, 6, 18), "Romero", "Francisco", 180.0f));
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
