package com.company.funciones;

import java.util.Scanner;

public class AnoBiciesto {

    public static void main(String[] args) {

            System.out.println();
            Scanner scanner = new Scanner(System.in);

            // Pido el año
            System.out.println("Introduce un año");
            int anio = scanner.nextInt();

            //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
                System.out.println("El año " + anio + " es bisiesto");
            } else {
                System.out.println("El año " + anio + " no es bisiesto");
            }



        }





}
