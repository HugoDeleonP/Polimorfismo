package com.contabancaria.model;

public class Conta {
    protected int numero;

    public Conta(int numero){
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String toString(){
        return "Conta número: " + numero;
    }
}
