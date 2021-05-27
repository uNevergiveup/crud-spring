package com.example.tcsejercicio2.mongo.repositories;

import com.example.tcsejercicio2.mongo.entities.PlanetEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanetRepository extends MongoRepository<PlanetEntity, String> {

}
