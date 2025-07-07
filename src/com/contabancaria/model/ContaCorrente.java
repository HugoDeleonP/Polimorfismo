package com.contabancaria.model;

public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, double limiteChequeEspecial){
        super(numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial){
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial(){
        return limiteChequeEspecial;
    }

    @Override
    public String toString(){
        return "Conta Corrente número: " + numero + " - Limite: R$ " + limiteChequeEspecial;
    }
}
