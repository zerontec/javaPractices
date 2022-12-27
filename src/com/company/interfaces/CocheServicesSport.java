package com.company.interfaces;

import com.company.Car;
import com.company.CocheElectrico;
import com.company.CocheHibrido;

public class CocheServicesSport implements CocheService {


    @Override
    public Car crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return  new CocheElectrico();
    }

    @Override
    public Car actualizarCoche() {
        System.out.println("Actualizando coche de carreras");
        return null;
    }

    @Override
    public Car removerCoche() {
        System.out.println("Remover coche de carreras");
        return null;
    }


}
