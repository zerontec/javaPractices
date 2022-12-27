package com.company;
import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {

        try {

            leernombres();
        }catch (NameForException e) {

          e.printStackTrace();
        }

    }

private static void leernombres() throws NameForException {

        Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce tu nombre");
    while(teclado.hasNext()) {

        System.out.println("introduce tu Nombre");
        String nombre = teclado.nextLine();
        if(nombre.length() < 8){
            teclado.close();
            throw new NameForException("El nombre debe contener minimo 8 letras ");


        }


    }

    teclado.close();


}

//throws Indica que va a lanzar una excepcion
    //throw sin la "S" que va alanzar la excepcion

}
