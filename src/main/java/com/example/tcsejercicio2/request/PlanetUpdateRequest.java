package com.example.tcsejercicio2.request;

import lombok.Data; //get, set , tostring

import java.util.Date;
@Data
public class PlanetUpdateRequest {
    private String id;
    private  String name;
    private  int age;
    private String mass;
    private String diameter;
    private Date discoveryDate;
}
