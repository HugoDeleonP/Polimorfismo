package com.animalapp.model;

public class Gato extends Animal{

    public Gato(String nome){
        super(nome);
    }

    @Override
    public void fazerSom(){
        System.out.println(getNome() + " mia");
    }

    @Override
    public String toString(){
        return "Gato: " + getNome() + " - Miau!";
    }
}
