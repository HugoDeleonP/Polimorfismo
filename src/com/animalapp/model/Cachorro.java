package com.animalapp.model;

import java.sql.SQLOutput;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void fazerSom(){
        System.out.println(getNome() + " late");
    }

    @Override
    public String toString(){
        return "Cachorro: " + getNome() + " - Au Au!";
    }
}
