package com.adorno.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modelo.Viajero;

@SpringBootTest
class ViajeroTest {

	@Autowired
	ViajeroRepository viajeroRepository;
	@Test
	void test() {
		Viajero viajero=new Viajero(1l,"jose luis",LocalDate.now());
		viajeroRepository.save(viajero);
	}

}
