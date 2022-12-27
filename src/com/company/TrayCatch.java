package com.company;

public class TrayCatch {

    public static void main(String[] args) {
    try {
        int result = 5 / 0;       //codigo que puede dar problemas

    }catch(ArithmeticException e){
        e.printStackTrace();


    }finally {
        System.out.println("Cierre de Recurso");
    }
       System.out.println("fin");


    }
}
