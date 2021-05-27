package com.example.tcsejercicio2.request;
import java.util.Date;


public class PlanetRegisterRequest {
    private String name;
    private Integer age;
    private Date discoveryDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDiscoveryDate() {
        return discoveryDate;
    }

    public void setDiscoveryDate(Date discoveryDate) {
        this.discoveryDate = discoveryDate;
    }

    @Override
    public String toString() {
        return "PlanetRegisterRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", discoveryDate='" + discoveryDate + '\'' +
                '}';
    }
}
