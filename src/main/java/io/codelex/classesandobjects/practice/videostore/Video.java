package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean isCheckedOut;
    private int rating;
    private int totalGottenRatings;
    private int badRating;
    private int goodRating;

    public Video(String title) {
        this.title = title;
    }

    public void checkedOut() {
        isCheckedOut = true;
    }

    public void checkedIn() {
        isCheckedOut = false;
    }

    public void recieveRating(int rating) {
        totalGottenRatings++;
        this.rating = rating;
        if (rating > 3) goodRating++;
        else badRating++;
    }

    public int calculateRating() {
        if (goodRating != 0) {
            return totalGottenRatings / goodRating * 100;
        } else return 0;
    }

    //    GETTERS
    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public int getRating() {
        return rating / totalGottenRatings;
    }
}
