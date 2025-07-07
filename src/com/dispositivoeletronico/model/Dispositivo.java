package com.dispositivoeletronico.model;

public class Dispositivo {
    protected String nome;

    public Dispositivo(String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return "Dispositivo: " + nome;
    }
}
