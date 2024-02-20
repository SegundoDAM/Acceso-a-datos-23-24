package com.adorno.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.adorno.model.herencia.Primaria;

public interface PrimariaRepository
	extends MongoRepository<Primaria, ObjectId> {
}

