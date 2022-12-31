package com.company.estructuradecontroll;

public class IFElseIf {

    public static void main(String[] args) {

        String dia = "Lunes";

        //ejemplo comparar
        boolean result = dia.equals("martes"); // cuando comparamos texto equal()

        if(result){

            System.out.println("Animo con la semana Campeon  ");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");
        }


    }
}
