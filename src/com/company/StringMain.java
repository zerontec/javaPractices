package com.company;

public class StringMain {

    public static void main(String[] args) {


//class String
/*
legth
startWidth("")
endWidth("")
indeOf("")
subString("")
trim()
equals()
compareTo()

 */





String mensaje = "Hola Mundo";


        System.out.println(mensaje.length());
        String mensajeMayu = mensaje.toUpperCase();
        System.out.println(mensajeMayu);
        System.out.println(mensajeMayu.trim()); //quito los espacio
        mensajeMayu = mensajeMayu.trim();
        String otro= "HOLA MUNDO";

        if(mensajeMayu.equals(otro)){
            System.out.println("verdadero");

        };



    }


}
