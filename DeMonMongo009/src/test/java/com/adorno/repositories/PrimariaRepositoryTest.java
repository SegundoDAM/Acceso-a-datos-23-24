package com.adorno.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.adorno.model.herencia.Infante;
import com.adorno.model.herencia.Primaria;

@SpringBootTest
class PrimariaRepositoryTest {

	@Autowired
	PrimariaRepository primariaRepository;
	@Autowired
	InfanteRepository infanteRepository;
	@Autowired
	MongoTemplate mongoTemplate;
	@Test
	void test() {
		mongoTemplate.getCollection("primarias").drop();
		Primaria save = primariaRepository.save(new Primaria(1L, "Norberto", "under the bridge", "otros"));
		System.out.println();
	}

}
