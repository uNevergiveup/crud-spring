package com.example.tcsejercicio2.request;

import lombok.Data;

import java.util.Date;
@Data
public class PlanetUpdateRequest {
    private String id;
    private  String name;
    private  int age;
    private Date discoveryDate;
}
