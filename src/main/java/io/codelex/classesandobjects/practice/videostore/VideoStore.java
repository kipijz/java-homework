package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {
    //ArrayList, priekš visiem videos
    private ArrayList<Video> videos = new ArrayList<Video>();
    //Konstruktors, kuram padodot title un rating, viņš izveido Video objektu un pievieno ArrayListā
    public void addVideo(String title, int rating) {
        Video video = new Video(title);
        videos.add(video);
        video.recieveRating(rating);
    }
    //Metode, kas meklē vai iekš ArrayList ir tāda filma pēc title, ja ir, tad nomaina boolean isCheckedOut uz false
    public void checkOutVideo(String title) {
        for (int i = 0; i < videos.size(); i++) {
            if (videos.get(i).getTitle().equals(title)) {
                videos.get(i).checkedOut();
                System.out.println("The percentage of users that liked this video: %" + videos.get(i).calculateRating());
                break;
            }
        }
    }
    //Tas pats, kas 16. rindā, bet nomaina  boolean isCheckedOut uz true
    public void returnVideo(String title, int rating) {
        for (int i = 0; i < videos.size(); i++) {
            if (videos.get(i).getTitle().equals(title)) {
                videos.get(i).checkedIn();
                videos.get(i).recieveRating(rating);
                break;
            }
        }

    }

    //Izdrukā nosaukumu, vidējo reitingu, vai ir pieejams.
    public void getVideos() {
        for (int i = 0; i < videos.size(); i++) {
            System.out.println("Title: " + videos.get(i).getTitle());
            System.out.println("Average rating: " + videos.get(i).getRating());
            System.out.println("Checked out?: " + videos.get(i).isCheckedOut());
            System.out.println("----------------------------");
        }
    }
}