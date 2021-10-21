package com.generation.animales;

public class Ave extends Animal {

    private int alas;
    private int patas;
    private boolean vuela;

    public Ave (String nombre) {
        super(nombre);
        System.out.println("Constructor hijo");
    }
    
    public void hacerNido() {
        System.out.println("Estoy haciendo mi nido");
    }
    public void ponerHuevo() {
        System.out.println("Estoy poniendo un huevo");
    }
    // metodo de anulacion, hereda el metodo pero realiza cambios
    @Override
    public void comer() {
        System.out.println("Comiendo alpiste");
    }
    @Override
    public void respirar() {
        System.out.println("Respirando por el pico");
    }
}
