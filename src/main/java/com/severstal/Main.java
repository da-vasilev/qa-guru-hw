package com.severstal;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Anton";
        human.surname = "Pupkov";
        human.age = 20;
        human.gender = "Male";
        human.weight = 120;
        human.growth = 1.8;

        human.say();
    }
}
