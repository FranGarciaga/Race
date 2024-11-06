package org.example;

public class Car extends Vehiculo {
    public Car(String marca) {
        super(marca, 2);
    }

    @Override
    public void acelerar() {
        this.velocity += 20;
    }

    @Override
    public void frenar() {
        this.velocity -= 20;
    }

    @Override
    public String toString() {
        return "El coche va a: " + this.velocity + "Km/h";
    }
}
