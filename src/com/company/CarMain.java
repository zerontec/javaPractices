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


        CocheElectrico cocheElectrico= new CocheElectrico();

        cocheElectrico.motorElec = "56rg";
        cocheElectrico.color = "Verde";
        cocheElectrico.velocidad= 250;
        cocheElectrico.peso=350.20;
        cocheElectrico.fabricante="UnaEmpresa";

        System.out.println(cocheElectrico);


        String motorHibrido = null;
        CocheHibrido cocheHibrido20 = new CocheHibrido( motorHibrido);
        cocheHibrido20.motorHibrido= "MX650";
        cocheHibrido20.color="rosado";
        cocheHibrido20.modelo="Ferrari";
        cocheHibrido20.velocidad=250;

        System.out.println(cocheHibrido20);

        CocheElectrico cocheElectricoB = new CocheElectrico( );
                cocheElectricoB.motorElec="XXR";
                cocheElectricoB.color="ROSA";
                cocheElectricoB.acelerar(50);


        System.out.println(cocheElectricoB);
        cocheElectricoB.acelerar(60);
        System.out.println(cocheElectricoB);


    }

}
