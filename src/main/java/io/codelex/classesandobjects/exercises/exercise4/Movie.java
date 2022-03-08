package io.codelex.classesandobjects.exercises.exercise4;

import java.util.Objects;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public Movie[] getPG(Movie[] array) {
        Movie[] sortedArray = new Movie[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i].toString(), "PG")) sortedArray[index] = array[i];
            index++;
        }
        return sortedArray;
    }


}
