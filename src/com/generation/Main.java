package com.generation;

import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.uber.UberBlack;
import com.generation.uber.UberDriver;

public class Main {

    public static void main(String[] args) {


        UberDriver driver = new UberDriver();
        UberBlack driverBlack = new UberBlack();

        //esto estos son los objetos
        System.out.println("uber");
        System.out.println(driver.calculatePrice(6));

        System.out.println("uner black");
        System.out.println(driver.calculatePrice(6));

	// estos son metodos
        /*
        Ave ave = new Ave("perico");
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();

        System.out.println("------------------");
        Perro lomito = new Perro("micky");
        lomito.jugar();
        lomito.comer();


        Animal animal = new Animal ();
        animal.comer();
        animal.hacerNido;

         */
    }
}
