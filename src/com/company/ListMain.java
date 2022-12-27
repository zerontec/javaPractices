package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        //de esta manera con listas para tipo de datos
        List<String> nombres = new ArrayList<>();


        nombres.add("Nombre1");
        nombres.add("Nombre2");
        nombres.add("Nombre3");



        System.out.println(nombres);
        
        //interar con listas 

        for(String nombre : nombres){

            System.out.println(nombre);

        }

        List<Coche>coches = new ArrayList<>();

     coches.add(new Coche ("Ferrari"));
     coches.add(new Coche ("AlfaRomeo"));

        System.out.println(coches);

       for(Coche coche : coches){

           System.out.println(coche);

       }

    }

    @Override
    public String toString() {
        return "ListMain{}";
    }
}
