package com.company.interfaces;

import com.company.Car;
import com.company.CocheElectrico;
import com.company.interfaces.CocheService;

public class CocheServiClassicImpl implements CocheService {

    //Implementacion
    @Override

    public Car crearCocheDemo() {

        System.out.println("Creando coche Clasico");
        return new CocheElectrico();
    }

    @Override
    public Car actualizarCoche() {
        System.out.println("Actualizando Coche Clasico");
        return null;
    }

    ;

    @Override
    public Car removerCoche() {
        System.out.println("Removido Coche Clasico");
        return null;
    }


}