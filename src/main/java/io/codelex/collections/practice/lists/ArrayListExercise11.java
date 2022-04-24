package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> randomStrings = new ArrayList<String>();
        //TODO: Add 10 values to list
        randomStrings.add("Tommy");
        randomStrings.add("Oliver");
        randomStrings.add("Tatar");
        randomStrings.add("DMA");
        randomStrings.add("Dehuc");
        randomStrings.add("Razja");
        randomStrings.add("RVB");
        randomStrings.add("Skrt");
        randomStrings.add("Pika");
        randomStrings.add("Parti");

        //TODO: Add new value at 5th position
        System.out.println("Before adding new value at 5th position: ");
        System.out.println(randomStrings);
        System.out.println("After adding new value at 5th position: ");
        randomStrings.set(4, "Yaba");
        System.out.println(randomStrings);
        //TODO: Change value at last position (Calculate last position programmatically)
        System.out.println("After changing value at last position: ");
        randomStrings.set(randomStrings.size() - 1, "YabaYabaYabaYaba");
        System.out.println(randomStrings);
        //TODO: Sort your list in alphabetical order
        Collections.sort(randomStrings);
        System.out.println("After sorting: ");
        System.out.println(randomStrings);
        //TODO: Check if your list contains "Foobar" element
        if (randomStrings.contains("Foobar")) {
            System.out.println("Foobar located!");
        } else {
            System.out.println("No foobar's allowed!");
        }
        //TODO: Print each element of list using loop
        System.out.println("Printing all elements: ");
        for (String element : randomStrings) {
            System.out.println(element);
        }
    }

}
