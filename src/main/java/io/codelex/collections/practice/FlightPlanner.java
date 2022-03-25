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
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        flightPlanner();
    }

    private static void flightPlanner() throws URISyntaxException, IOException {
        Scanner scanner = new Scanner(System.in);

        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> linesList = readAllLines(path, charset);
        HashMap<String, ArrayList> fromToHashMap = getFlights(linesList);
        ArrayList<String> usersRoute = new ArrayList<>();
        boolean isInputValid;
        int userChoice;
        do {
            System.out.println("What would you like to do: ");
            System.out.println("To display list of the cities press 1");
            System.out.println("To exit program press 3");
            userChoice = scanner.nextInt();

            if (userChoice != 1 && userChoice != 3) {
                System.out.println("Invalid input, try again...");
                isInputValid = false;
            } else {
                isInputValid = true;
            }
        } while (!isInputValid);


        if (userChoice == 1) {
            displayList(linesList);
            System.out.println("Type the city from which you'd like to start: ");
            scanner.nextLine();
            String userFirstCityChoice = scanner.nextLine();
            usersRoute.add(userFirstCityChoice);
            System.out.println(fromToHashMap.get(userFirstCityChoice));

            boolean choosesNext = true;

            while (choosesNext) {
                System.out.println("Choose the next city: ");
                String usersNextCityChoice = scanner.nextLine();
                if (userFirstCityChoice.equals(usersNextCityChoice)) {
                    choosesNext = false;
                    usersRoute.add(usersNextCityChoice);
                } else {
                    System.out.println(fromToHashMap.get(usersNextCityChoice));
                    usersRoute.add(usersNextCityChoice);
                }
            }

            System.out.println("Your route: ");
            System.out.println(usersRoute.toString());
        } else {
            System.out.println("Exiting!");
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
