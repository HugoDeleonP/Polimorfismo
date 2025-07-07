package com.veiculoapp.main;
import com.veiculoapp.model.*;
import java.util.ArrayList;


public class Main {
    public static void main(String args[]){
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Veiculo("Volkswagen"));
        veiculos.add(new Moto("General Motors", false));
        veiculos.add(new Carro("Ford Verona" ,2));

        for(Veiculo veiculoUnit: veiculos){
            System.out.println(veiculoUnit.toString());
        }
    }
}
