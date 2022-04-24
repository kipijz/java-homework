package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.readAllLines;

public class FlightPlanner {
    private static final Charset CHARSET = Charset.defaultCharset();
    private static final String FILE = "/collections/flights.txt";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws IOException, URISyntaxException {
        flightPlanner();
    }

    private static void flightPlanner() throws URISyntaxException, IOException {
        boolean isInputValid;
        int userChoice;
        do {
            System.out.println("What would you like to do: ");
            System.out.println("To display list of the cities press 1");
            System.out.println("To exit program press 3");
            userChoice = SCANNER.nextInt();

            if (userChoice != 1 && userChoice != 3) {
                System.out.println("Invalid input, try again...");
                isInputValid = false;
            } else {
                isInputValid = true;
            }
        } while (!isInputValid);

        displayPlanner(userChoice);
    }

    private static void displayPlanner(int userChoice) throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(FILE).toURI());
        List<String> linesList = readAllLines(path, CHARSET);
        HashMap<String, ArrayList> fromToHashMap = getFlights(linesList);
        ArrayList<String> usersRoute = new ArrayList<>();

        if (userChoice == 1) {
            displayList(linesList);
            System.out.println("Type the city from which you'd like to start: ");
            SCANNER.nextLine();
            String userFirstCityChoice = SCANNER.nextLine();
            usersRoute.add(userFirstCityChoice);
            System.out.println("Next available cities: ");
            System.out.println(fromToHashMap.get(userFirstCityChoice));

            boolean choosesNext = true;

            while (choosesNext) {
                System.out.println("Choose the next city: ");
                String usersNextCityChoice = SCANNER.nextLine();

                if (userFirstCityChoice.equals(usersNextCityChoice)) {
                    choosesNext = false;
                    usersRoute.add(usersNextCityChoice);
                } else {
                    System.out.println(fromToHashMap.get(usersNextCityChoice));
                    usersRoute.add(usersNextCityChoice);
                }
            }
            displayUsersRoute(usersRoute);
        } else {
            System.out.println("Exiting!");
        }
    }

    private static void displayUsersRoute(ArrayList usersRoute) {
        System.out.println("Your route was: ");
        for (int i = 0; i < usersRoute.size(); i++) {
            if (i + 1 == usersRoute.size()) {
                System.out.print(usersRoute.get(i));
                break;
            }
            System.out.print(usersRoute.get(i) + " -> ");
        }
    }

    private static HashMap<String, ArrayList> getFlights(List<String> linesList) {
        HashMap<String, ArrayList> fromToHashMap = new HashMap<>();
        ArrayList<String> destinations = new ArrayList<>();

        for (int i = 0; i < linesList.size(); i++) {
            String[] parts = (linesList.get(i).split(" -> ", 2));

            String key = parts[0];
            if (!fromToHashMap.containsKey(key)) {
                destinations.clear();
            }
            destinations.add(parts[1]);

            ArrayList<String> destinationsClone = (ArrayList<String>) destinations.clone();
            fromToHashMap.put(key, destinationsClone);
        }
        return fromToHashMap;
    }

    private static void displayList(List<String> linesList) {
        for (String element : linesList) {
            System.out.println(element);
        }
    }
}
