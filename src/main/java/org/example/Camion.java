package org.example;

public class Camion extends Vehiculo {
    public Camion(String marca) {
        super(marca, 8);
    }

    @Override
    public void acelerar() {
        this.velocity += 60;
    }

    @Override
    public void frenar() {
        this.velocity -= 10;
    }

    @Override
    public String toString() {
        return "El camión va a: " + this.velocity + "Km/h";
    }
}
