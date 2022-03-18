package io.codelex.classesandobjects.exercises.exercise4;

public class Test {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie[] movie = new Movie[3];
        movie[0] = movie1;
        movie[1] = movie2;
        movie[2] = movie3;

        Movie[] movieTest = Movie.getPG(movie);
        for (Movie value : movieTest) {
            System.out.println(value);
        }

    }
}
