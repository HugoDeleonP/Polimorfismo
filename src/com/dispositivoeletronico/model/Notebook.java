package com.dispositivoeletronico.model;

public class Notebook extends Dispositivo{
    private double tamanhoTela;

    public Notebook(String nome, double tamanhoTela){
        super(nome);
        this.tamanhoTela = tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public String toString(){
        return "Notebook: " + nome + " - Tela: " + tamanhoTela + " polegadas";
    }
}
