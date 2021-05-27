package com.example.tcsejercicio2.mongo.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
//Genera los getters and setters en tiempo de ejecucion
@Getter
@Setter
@Document(collection = "planets")
public class PlanetEntity {
    private String id;
    private String name;
    private int age;
    private String mass;
    private String diameter;
    private Date discoveryDate;
}
