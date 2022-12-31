package com.company;

public class PolimorfismoMain {
    public static void main(String[] args) {

Car car1 = new Car();


CocheElectrico car2 = new CocheElectrico();

//CocheHibrido car3 = new CocheHibrido();


//POLIMORFISMO

        Car car4 = new CocheElectrico();
        car4.peso= 13.25;
        car4.modelo="mx56";


        Car car5 = new CocheHibrido();
        car5.peso = 12.35;
        car5.modelo = "toyota";
        System.out.println(car5);

        if(car4 instanceof  CocheElectrico){
            System.out.println("coche electrico");

        }






    }




}
