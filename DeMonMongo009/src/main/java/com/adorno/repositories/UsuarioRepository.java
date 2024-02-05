package com.adorno.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adorno.model.Usuario;

public interface UsuarioRepository  extends MongoRepository<Usuario, String>{

}
