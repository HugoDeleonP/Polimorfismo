package com.veiculoapp.model;

public class Carro extends Veiculo{
    private int numeroDePortas;

    public Carro(String marca, int numeroDePortas){
        super(marca);
        this.numeroDePortas = numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas(){
        return numeroDePortas;
    }

    @Override
    public String toString(){
        return "Marca: " + marca + " - Número de portas: " + numeroDePortas;
    }
}
