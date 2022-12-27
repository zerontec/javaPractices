package com.company;
import java.util.Scanner;

public class ScannerMain {


    public static void main(String[] args) {

        System.out.println();

      Scanner scanner = new Scanner(System.in);
      System.out.print("Introduce tu nombre");
      String name = scanner.nextLine();
        System.out.print("Introduce un mumero");
        int mumero = scanner.nextInt();
           System.out.print("El numero introducido es  " +  mumero);
           System.out.print("El nombre Introducido es "  +  name);

    }

}
