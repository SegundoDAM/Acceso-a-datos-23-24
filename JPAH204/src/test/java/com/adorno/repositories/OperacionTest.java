package com.adorno.repositories;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modelo.Cirujano;
import com.adorno.modelo.Paciente;
import com.adorno.modelo.PacienteQuirofanoCirujano;
import com.adorno.modelo.Quirofano;

@SpringBootTest
class OperacionTest {
	@Autowired
	QuirofanoRepo quirofanoRepo;
	@Autowired
	PacienteRepo pacienteRepo;
	@Autowired
	CirujanoRepo cirujanoRepo;
	@Autowired
	PacienteQuirofanoCirujanoRepository pacienteQuirofanoCirujanoRepository;

	@Test
	void test() {
		Quirofano quirofano = new Quirofano();
		quirofanoRepo.save(quirofano);
		Paciente paciente2 = new Paciente();
		Paciente paciente=new Paciente();
		pacienteRepo.save(paciente);
		Cirujano cirujano=new Cirujano();
		cirujanoRepo.save(cirujano);
		PacienteQuirofanoCirujano operacion
		=new PacienteQuirofanoCirujano
		(quirofano, paciente, cirujano, LocalDate.now(), "mal");
		pacienteQuirofanoCirujanoRepository.save(operacion);
		PacienteQuirofanoCirujano operacion2
		=new PacienteQuirofanoCirujano
		(quirofano, paciente, cirujano, LocalDate.now(), "regular");
		pacienteQuirofanoCirujanoRepository.save(operacion2);
		pacienteRepo.save(paciente2);
		PacienteQuirofanoCirujano operacion3
		=new PacienteQuirofanoCirujano
		(quirofano, paciente2, cirujano, LocalDate.now(), "excelente");
		pacienteQuirofanoCirujanoRepository.save(operacion3);
	}

}
