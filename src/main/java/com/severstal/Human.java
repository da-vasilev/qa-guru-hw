package com.severstal;

public class Human {
    String name;
    String surname;
    String gender;
    int age;
    double growth;
    int weight;

    public String say() {
        return String.format("Hello, my name is %s", name);
    }

}
