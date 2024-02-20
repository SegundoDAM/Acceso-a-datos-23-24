package com.adorno.repositories;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.adorno.model.herencia.Infante;

public interface InfanteRepository extends MongoRepository<Infante, ObjectId> {
public Optional<Infante> findByFicha(ObjectId ficha);
}
