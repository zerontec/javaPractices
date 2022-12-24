package com.company;

public class CocheElectrico extends Car {

        String motorElec;

        public CocheElectrico() {

        }





        public CocheElectrico(String motorElec) {

                this.motorElec = motorElec;


        }


        public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo) {
                super(color,fabricante,modelo,peso,largo);
                this.motorElec = motorElec;
        }
//sobre escribir
        @Override //notacion son elementos sintaticos que permiten aportar metadatos a metodos y claes
        public void acelerar(Integer cantidad) {
                Integer cantidadAjustada = cantidad * 2;
                super.acelerar(cantidadAjustada);
        }
}


