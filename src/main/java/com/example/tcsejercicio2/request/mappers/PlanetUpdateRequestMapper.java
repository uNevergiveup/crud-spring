package com.example.tcsejercicio2.request.mappers;

import com.example.tcsejercicio2.mongo.entities.PlanetEntity;
import com.example.tcsejercicio2.request.PlanetUpdateRequest;

public class PlanetUpdateRequestMapper {
    public PlanetEntity mapIn(PlanetUpdateRequest request){
        PlanetEntity planet = new PlanetEntity();
        planet.setName(request.getName());
        planet.setAge(request.getAge());
        planet.setMass(request.getMass());
        planet.setDiameter(request.getDiameter());
        planet.setDiscoveryDate(request.getDiscoveryDate());
        return planet;
    }
}
