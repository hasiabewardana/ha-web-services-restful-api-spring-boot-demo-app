package com.example.hawebservicesrestfulapispringbootdemoapp.hello_world_api.domain;

public class Course {

    int id;
    String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
