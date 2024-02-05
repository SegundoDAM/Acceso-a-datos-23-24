package com.adorno.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adorno.model.Contrato;
import com.adorno.model.Usuario;

public interface ContratoRepository extends MongoRepository<Contrato, String>  {
	public Optional<Contrato> findByUsuario(Usuario usuario);
}
