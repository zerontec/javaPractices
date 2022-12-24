package com.company;

public class CocheHibrido extends Car {

    String motorHibrido;

public  CocheHibrido(String motorHibrido){

    this.motorHibrido = motorHibrido;
    this.color = "rojo";
    this.velocidad = 50;
    this.fabricante = "fabricante";




}

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorHibrido='" + motorHibrido + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
