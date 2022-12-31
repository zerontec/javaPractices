package com.company;

public class MasFunciones {

    public static void main(String[] args) {

        String menu = getMenu();
        System.out.println(menu);

        double price = getPrice();
        System.out.println(price);

        //funcion con parametros y sin tipo de retorno

        imprimirSaludo("openBootcamp");

        //con parametros y tipo de retorno
        String nombre = "Leoberto";
        String apellido = "Zeron";
       String saludo =  obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int sumatoria = suma(25, 35);

        System.out.println(sumatoria);


    }


    static int suma(int num1, int num2){
      int res = num1 + num2;

        return res;
    }

    static String obtenerSaludo(String nombre, String apellido){

        String saludo = "Buenas tardes " + nombre + " " + apellido;
        return saludo;


    }
   static void imprimirSaludo(String nombre) {
        System.out.println( "Hola como estas " +  nombre);

    }


    static double getPrice() {
        return 10.25;
    }

    static String getMenu() {

        System.out.println("muestra Menu");

        return null;
    }
}
