package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        ArrayList<String> carsArrayList = new ArrayList<String>(Arrays.asList(array));
        System.out.println("Arraylist: ");

        for (String car : carsArrayList) {
            System.out.println(car);
        }
        System.out.println();
        //todo - replace array with a HashSet and print out the results
        HashSet<String> carsHashSet = new HashSet<String>(Arrays.asList(array));
        System.out.println("Hashset: ");

        for (String car : carsHashSet) {
            System.out.println(car);
        }
        System.out.println();
        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        HashMap<String, String> carsHashMap = new HashMap<String, String>();
        carsHashMap.put("Audi", "Germany");
        carsHashMap.put("BMW", "Germany");
        carsHashMap.put("Honda", "Japan");
        carsHashMap.put("Mercedes", "Germany");
        carsHashMap.put("Volkswagen", "Germany");
        carsHashMap.put("Tesla", "USA");
        System.out.println("Hashmap: ");
        for (String i : carsHashMap.keySet()) {
            System.out.println("key: " + i + " value: " + carsHashMap.get(i));
        }

    }
}
