package com.contabancaria.model;

public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public ContaPoupanca(int numero, double taxaJuros){
        super(numero);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String toString(){
        return "Conta Poupança número: " + numero + " - Juros: " + taxaJuros + "%";
    }
}
