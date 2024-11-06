package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        List<Vehiculo> peloton = List.of(new Camion("Camión"), new Car("Coche"), new Moto("Moto"));

        Race race = new Race(peloton);
        race.start();

        Car car1 = new Car("1");



    }
}