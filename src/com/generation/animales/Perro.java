package com.generation.animales;

public class Perro extends Animal {

    // estos son los atributos
    private int patas;
    private boolean cola;
    private String raza;

    //este es un constructor y se utiliza para inicializar objetos metodo especial
    public Perro(String nombre) {
        super(nombre);
    }

    //estos son métodos
    public void jugar() {
        System.out.println("Estoy jugando");
    }
    public void ladrar() {
        System.out.println("Estoy ladrando");
    }
    public void morder() {
        System.out.println("Te voa morder");
    }
    // metodo de anulacion, hereda el metodo pero realiza cambios
    @Override
    public void comer() {
        System.out.println("Comiendo croquetas");
    }
    @Override
    public void respirar() {
        System.out.println("Respirando");
    }
}
