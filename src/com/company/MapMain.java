package com.company;

import java.util.HashMap;

import java.util.Map;
public class MapMain {


    public static void main(String[] args) {


        Map<String, String> personas = new HashMap<>();

        personas.put("123434", "John");
        personas.put("12343", "Jne");

        System.out.println(personas);

        //iterando sobre el map

        for (String key : personas.keySet()) {  //sacamos laas claves

            System.out.println(key);

        }

        for (String value : personas.values()) {  //sacamos los valores

            System.out.println(value);

        }


        for (Map.Entry<String, String> pair : personas.entrySet()) {

            System.out.println(pair.getKey() + " / " + pair.getValue());


        }

    }
}