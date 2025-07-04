package com.animalapp.model;

public class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println(nome + "faz um som genérico");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal: " + nome;
    }
}
