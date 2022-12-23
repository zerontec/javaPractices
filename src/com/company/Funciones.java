package com.company;

public class Funciones {
    public static void main(String[] args) {

        holaMundo("Leoberto");
        //holaMundo("Lisa");

        // las funciones son agrupaciones de sentencias
        // que va a ser ejecutadas en cualquier
        // parte de nuestra aplicacion

       // String hola = devolverHola();
        //System.out.println(hola);


        String wuil = devolverHola("wuilmaris");
        System.out.println(wuil);

        String wuil2 = devolverHola("Osma", 5);

        System.out.println(wuil2);

    }

    public static String devolverHola(String nombre){
       return  nombre;
               
               

    }
    public static void holaMundo(String name){

        System.out.println("Hola  " +  name);

    }


    //si retorna algo no lleva el modificador void
    public static  String devolverHola(){

        return "Hola";

    }



  public static String devolverHola(String nombre, int num1){
      return nombre + num1;

    }

    //sobrecarga de Funciones
    // porque hemo duplicado su nombre y no arroja error
    //pero como tienen diferentes parametros es sobre carga

    //ejemplo sobrecarga




}
