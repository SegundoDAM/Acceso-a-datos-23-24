package com.adorno.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.model.Usuario;

@SpringBootTest
class UsuarioRepositoryTest {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Test
	void test() {
		usuarioRepository.save(new Usuario("Arturito","hh"));
	}

}
