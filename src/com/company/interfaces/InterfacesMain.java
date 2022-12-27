package com.company.interfaces;

import com.company.Car;

public class InterfacesMain {

    public static void main(String[] args) {
//interface
    CocheService service = new CocheServiClassicImpl(); //implementacion
    CocheService service2 = new CocheServicesSport();
    CocheService service3 = new CocheServiClassicImpl();

   Car coche1 =  service.crearCocheDemo();

   Car coche2 = service2.crearCocheDemo();

   Car coche3 = service3.actualizarCoche();

   Car cohe3 = service3.removerCoche();



//creo la interface
        //declaro los metodos
        //implemento los metodos
        //puedo crear varias implementaciones utilizando los metodos de la interface
        // Instacion de las Interface es como si usra polimorfismo
//llamo a los metodos y listo





    }
}
