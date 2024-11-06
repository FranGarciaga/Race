package org.example;

public abstract class Vehiculo {
    private String marca;
    protected int velocity;
    private int ruedas;

    public Vehiculo(String marca, int ruedas) {
        this.marca = marca;
        this.velocity = 0;
        this.ruedas = ruedas;

    }

    public String getMarca() {
        return marca;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getRuedas() {
        return ruedas;
    }

    public abstract void acelerar();

    public abstract void frenar();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", velocity=" + velocity +
                ", ruedas=" + ruedas +
                '}';
    }
}
