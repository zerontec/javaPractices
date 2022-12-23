package com.company;

public class BuclesWhile {

    public static void main(String[] args) {
        //Bucles while

        //condicion

        boolean check = true;

       int count = 0;
        while(count < 10){
            count ++; //condicion
            if(count == 6)
                continue;
            // salta a la siguiente iteracion

            System.out.println("Hola Mundo " + count);

    }

        System.out.println("fin");



        while(count < 10){
            count ++; //condicion
            if(count == 6)
               break;

            //continue  salta a la siguiente iteracion
            //break = rompeel flujo de ejecucion

            System.out.println("Hola Mundo " + count);

        }

        System.out.println("fin");



    }

}
