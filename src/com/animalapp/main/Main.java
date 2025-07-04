package com.animalapp.main;

import com.animalapp.model.Animal;
import com.animalapp.model.Cachorro;
import com.animalapp.model.Gato;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Animal> animais = new ArrayList<>();

        animais.add(new Animal("Animal genérico"));
        animais.add(new Gato("Bolota"));
        animais.add(new Cachorro("Jorisvaldo"));

        for (Animal animalUnit:animais){
            System.out.println(animalUnit.toString());
        }
    }
}