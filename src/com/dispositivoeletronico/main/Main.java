package com.dispositivoeletronico.main;
import com.dispositivoeletronico.model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new Dispositivo("Smartwatch"));
        dispositivos.add(new Smartphone("Samsung Galaxy M32", "Android"));
        dispositivos.add(new Notebook("Vaio FE15", 22.5));

        for (Dispositivo dispositivoUnit: dispositivos){
            System.out.println(dispositivoUnit.toString());
        }
    }
}
