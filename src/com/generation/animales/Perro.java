package com.generation.animales;

public class Perro extends Animal implements Mascotas, Mamiferos {

    // estos son los atributos
    private int patas;
    private boolean cola;
    private String raza;

    //este es un constructor y se utiliza para inicializar objetos metodo especial
    public Perro(String nombre) {
        super(nombre);
    }

    //estos son métodos
    /*
    public void jugar() {
        System.out.println("Estoy jugando");
    }
     */
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
    public void hablar() {

    }

    @Override
    public void respirar() {
        System.out.println("Respirando");
    }
    @Override
    public void jugar() {
        System.out.println("estoy jugando :)");
    }

    @Override
    public void gestar() {
        System.out.println("Tiempo de dos meses");
    }

    @Override
    public void ingestarLeche() {
        System.out.println("Estoy tomando leche ");
    }

    @Override
    public void movilidad() {
        System.out.println("Puedo caminar");
    }

}
