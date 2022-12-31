package com.company.estructuradecontroll;

public class ForEach {

    public static void main(String[] args) {


        //ForEach
        String[] nombres ={"Wuil", "Leoberto", "Amaia", "Hannah", "Leonardo"};
        for(String nombre: nombres){

            System.out.println(nombre);
        }

        int[ ] numeros = {5,2,6};
        int suma = 0;

        for(int numero : numeros){

            suma = suma + numero;

            System.out.println(suma);

        }

    }

        }









