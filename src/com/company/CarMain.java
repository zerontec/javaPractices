package com.company;

public class CarMain {

    public static void main(String[] args) {


        String car = "Alfa Romeo";

        Car carObj =  new Car("Amarillo", "una","Alfa Romeo", 45.52, 39.20); //invocamos el metod constructor de Car


        Car carObj2 = new Car("rojo","UnaEmpresa", "Alfa Romeo", 45.52, 39.20); //instaciamos una clase

        System.out.println(carObj);
        carObj2.acelerar(55);
        System.out.println(carObj2);


        carObj2.peso = 650.50;
        System.out.println(carObj2);
    }

}
