package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise3 {

    //TODO: Write a Java program to insert an element into the array list at the first position.
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);

        System.out.println("After adding the element at first position: ");
        colors.add(0, "Magenta");
        System.out.println(colors);
        //TODO: Add new color at the first and third position of the list
        System.out.println("After adding the elements at first, third position: ");
        colors.add(0, "Hot Pink");
        colors.add(2, "Gray");
        System.out.println(colors);
    }

}
