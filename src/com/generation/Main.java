package com.generation;

import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {
	// estos son metodos
        Ave ave = new Ave("perico");
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();

        System.out.println("------------------");
        Perro lomito = new Perro("micky");
        lomito.jugar();
        lomito.comer();

        /*
        Animal animal = new Animal ();
        animal.comer();
        animal.hacerNido;

         */
    }
}
