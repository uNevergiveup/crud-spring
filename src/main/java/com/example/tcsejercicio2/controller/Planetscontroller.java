package com.example.tcsejercicio2.controller;
import com.example.tcsejercicio2.mongo.entities.PlanetEntity;
import com.example.tcsejercicio2.mongo.repositories.PlanetRepository;
import com.example.tcsejercicio2.request.PlanetRegisterRequest;
import com.example.tcsejercicio2.request.PlanetUpdateRequest;
import com.example.tcsejercicio2.request.mappers.PlanetRegisterRequestMapper;
import com.example.tcsejercicio2.request.mappers.PlanetUpdateRequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api-planet")
public class Planetscontroller{
    @Autowired
    private PlanetRepository planetRepository;

    //Retorna todos los planetas que existen en nuestra BD
    @GetMapping
    public ResponseEntity<List<PlanetEntity>>listAll(){
            return  ResponseEntity.ok(
                planetRepository.findAll()
        );
    }
    @GetMapping("/{id}")
    public ResponseEntity<PlanetEntity> finById(
            @PathVariable(name= "id") String id
    ){
        Optional<PlanetEntity> optionalPlanet = planetRepository.findById(id);
        if(optionalPlanet.isPresent()) {
            return ResponseEntity.ok( // Status 200
                    optionalPlanet.get()
            );
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); //Status 204
        }
    }
    @PostMapping
    public  ResponseEntity<PlanetEntity> register(
        @RequestBody PlanetRegisterRequest request
    ){
        return ResponseEntity.ok(
            planetRepository.save(
                new PlanetRegisterRequestMapper().mapIn(request)
            )
        );
    }
    @PutMapping
    public  ResponseEntity<PlanetEntity> update(
            @RequestBody PlanetUpdateRequest request
    ) {
        return ResponseEntity.ok(
            planetRepository.save(
                new PlanetUpdateRequestMapper().mapIn(request)
            )
        );
    }
    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> delete(
        @PathVariable(name = "id") String id
    ){
        planetRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}   
