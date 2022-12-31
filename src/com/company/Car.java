package com.company;

public class Car {

    //ATRIBUTOS
    //Caracteristicas y que varian de un carro a otro

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

public Car(){

}
    //CONSTRUCTORES
    //metodo que nos permiten crear objetos
    // de esa clase si no agregamos un constructor habra uno por defecto que permitira crear objetos pero sin agregar valores
    // a los parametros
//empieza por mayuscula y lleva el mismo nombre de la clase
    public Car(String color, String fabricante, String modelo, Double peso, Double largo ){

        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

    }






    //comportamiento metodos

    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad  <= 120){

            this.velocidad += cantidad;
        }




    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
