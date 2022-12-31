package com.company.funciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
//        System.out.println();
//
//        Scanner in = new Scanner(System.in);
//        Double[] notas = new Double[5];
//
//        for (int i = 0; i < notas.length; i++) {
//            System.out.print("Introduce la  nota: ");
//
//            notas[i] = in.nextDouble();
//        }
        double[] notas = {4.5, 3.2, 2.7, 3.9, 2.1};
List<Double> notasmayores = obtenerNotasA( notas, 3.0);
        System.out.println(notasmayores);


      }

    public static List<Double> obtenerNotasA(double[] notas, double tope){

        List<Double> notasMayores = new ArrayList<>();
        for(double nota : notas){
            if(nota > tope){

                notasMayores.add(nota);
            }

        }

        return notasMayores;

    }



}


