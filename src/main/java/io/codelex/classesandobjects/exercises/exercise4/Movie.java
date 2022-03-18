package io.codelex.classesandobjects.exercises.exercise4;

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

    public static Movie[] getPG(Movie[] array) {
        Movie[] sortedArray = new Movie[array.length];
        int index = 0;
        for (Movie movie : array) {
            if (movie.rating.equals("PG")) {
                sortedArray[index] = movie;
                index++;
            }
        }
        return sortedArray;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
