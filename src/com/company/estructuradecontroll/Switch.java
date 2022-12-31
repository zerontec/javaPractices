package com.company.estructuradecontroll;

public class Switch {

    public static void main(String[] args) {

        String dias ="Lunes";

        switch(dias){

            case "Lunes":
                System.out.println(" hoy es dia Lunes");

                break;
            case "Martes":
                System.out.println(" hoy es dia Martes");

                break;
            case "Miercoles":
                System.out.println(" hoy es dia Miercoles");

                break;
        case "Jueves":
            System.out.println(" hoy es dia Jueves");

            break;
            case "Viernes":

                System.out.println(" hoy es dia Viernes");

                break;

            case "Sabado":

                System.out.println(" hoy es dia Sabado");

                break;

            case "Domingo":

                System.out.println(" hoy es dia Domingo");

                break;

            default:
                System.out.println(" no es un dia");
        }

    }

}
