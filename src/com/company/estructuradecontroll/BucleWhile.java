package com.company.estructuradecontroll;

public class BucleWhile {

    public static void main(String[] args) {

    //for es un bucle determinado
        //while es un bucle indeterminado

        int contador = 0;


        while (contador < 10) {
//            System.out.println("Eres lo maximo :)");
            contador ++;
            if(contador == 5){

                break;
                //continue;   braak y continue afectas a bucles for tambien

            }

            System.out.println("contador vale  " + contador);

        }



    }

}
