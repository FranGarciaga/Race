package org.example;

public class Moto extends Vehiculo {
    public Moto(String marca) {
        super(marca, 2);
    }

    @Override
    public void acelerar() {
        this.velocity += 30;
    }

    @Override
    public void frenar() {
        this.velocity -= 10;
    }

    @Override
    public String toString() {
        return "La moto va a: " + this.velocity + "Km/h";
    }
}

