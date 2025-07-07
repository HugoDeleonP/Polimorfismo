package com.contabancaria.main;
import com.contabancaria.model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        contas.add(new Conta(123));
        contas.add(new ContaCorrente(360, 1700));
        contas.add(new ContaPoupanca(180, 2.56));

        for(Conta contaUnit: contas){
            System.out.println(contaUnit.toString());
        }
    }
}
