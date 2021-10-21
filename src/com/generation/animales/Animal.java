package com.generation.animales;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    //esto es un constructor
    public Animal(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor padre");

    }

    public void comunicarse() {
        System.out.println("Hola");

    }
    public void comer() {
        System.out.println("Estoy comiendo");
    }
    public abstract void respirar();
}
