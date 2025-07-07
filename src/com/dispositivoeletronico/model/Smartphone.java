package com.dispositivoeletronico.model;

public class Smartphone extends Dispositivo{

    private String sistemaOperacional;

    public Smartphone(String nome, String sistemaOperacional){
        super(nome);
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String toString(){
        return "Smartphone: " + nome + " - SO: " + sistemaOperacional;
    }
}
