package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    static VideoStore videoStore = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();
            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard);
                case 2 -> rentVideo(keyboard);
                case 3 -> returnVideo(keyboard);
                default -> {
                }
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            movieName += scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            videoStore.addVideo(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        movieName += scanner.nextLine();
        videoStore.checkOutVideo(movieName);
        System.out.println("Checked out!");
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        movieName += scanner.nextLine();
        System.out.println("Enter rating");
        int rating = scanner.nextInt();
        videoStore.returnVideo(movieName, rating);
        System.out.println("Returned! All available inventory: ");
        videoStore.getVideos();
    }
}
