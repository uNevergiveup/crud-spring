package com.example.tcsejercicio2.request.mappers;
import com.example.tcsejercicio2.mongo.entities.PlanetEntity;
import com.example.tcsejercicio2.request.PlanetRegisterRequest;

public class PlanetRegisterRequestMapper {
    public PlanetEntity mapIn(PlanetRegisterRequest request){
        PlanetEntity planet = new PlanetEntity();
        planet.setName(request.getName());
        planet.setAge(request.getAge());
        planet.setMass(request.getMass());
        planet.setDiameter(request.getDiameter());
        planet.setDiscoveryDate(request.getDiscoveryDate());
        return planet;
    }
}
