package com.adorno.repositories;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modelo.Piloto;
import com.adorno.modelo.Viajero;

@SpringBootTest
class PilotoTest {

	@Autowired
	PilotoRepository pilotoRepository;
	@Autowired
	ViajeroRepository viajeroRepository;
	
	@Test
	void test() {
		Piloto piloto=new Piloto(2L, "Cayetano", "baja", false);
		pilotoRepository.save(piloto);
		Viajero viajero=new Viajero(1l,"jose luis",LocalDate.now());
		viajeroRepository.save(viajero);
	}

}
