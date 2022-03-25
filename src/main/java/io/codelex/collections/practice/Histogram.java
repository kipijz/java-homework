package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    private static StringBuilder zeroToNine = new StringBuilder();
    private static StringBuilder tenToNineteen = new StringBuilder();
    private static StringBuilder twentyToTwentyNine = new StringBuilder();
    private static StringBuilder thirtyToThirtyNine = new StringBuilder();
    private static StringBuilder fourthyToFourthyNine = new StringBuilder();
    private static StringBuilder fifthyToFifthyNine = new StringBuilder();
    private static StringBuilder sixtyToSixtyNine = new StringBuilder();
    private static StringBuilder seventyToSeventyNine = new StringBuilder();
    private static StringBuilder eightyToEightyNine = new StringBuilder();
    private static StringBuilder ninetyToNinetyNine = new StringBuilder();
    private static StringBuilder hundread = new StringBuilder();

    private static LinkedHashMap<String, String> histogram = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        generateHistogram();
    }

    private static void generateHistogram() throws URISyntaxException, IOException {
        setHistogramStars();
        putDataInHistogram();
        printHistogram();
    }

    private static void printHistogram() {
        for (String key : histogram.keySet()) {
            System.out.printf("%5s", key);
            System.out.print(": " + histogram.get(key) + "\n");
        }
    }

    private static void putDataInHistogram() {
        histogram.put("00-09", String.valueOf(zeroToNine));
        histogram.put("10-19", String.valueOf(tenToNineteen));
        histogram.put("20-29", String.valueOf(twentyToTwentyNine));
        histogram.put("30-39", String.valueOf(thirtyToThirtyNine));
        histogram.put("40-49", String.valueOf(fourthyToFourthyNine));
        histogram.put("50-59", String.valueOf(fifthyToFifthyNine));
        histogram.put("60-69", String.valueOf(sixtyToSixtyNine));
        histogram.put("70-79", String.valueOf(seventyToSeventyNine));
        histogram.put("80-89", String.valueOf(eightyToEightyNine));
        histogram.put("90-99", String.valueOf(ninetyToNinetyNine));
        histogram.put("100", String.valueOf(hundread));
    }

    private static void setHistogramStars() throws URISyntaxException, IOException {
        final String scores = fileContent();
        String[] scoresArray = scores.split(" ");
        for (String s : scoresArray) {
            if (Integer.parseInt(s) <= 9 && Integer.parseInt(s) >= 0) {
                zeroToNine.append("*");
            }
            if (Integer.parseInt(s) <= 19 && Integer.parseInt(s) >= 10) {
                tenToNineteen.append("*");
            }
            if (Integer.parseInt(s) <= 29 && Integer.parseInt(s) >= 20) {
                twentyToTwentyNine.append("*");
            }
            if (Integer.parseInt(s) <= 39 && Integer.parseInt(s) >= 30) {
                thirtyToThirtyNine.append("*");
            }
            if (Integer.parseInt(s) <= 49 && Integer.parseInt(s) >= 40) {
                fourthyToFourthyNine.append("*");
            }
            if (Integer.parseInt(s) <= 59 && Integer.parseInt(s) >= 50) {
                fifthyToFifthyNine.append("*");
            }
            if (Integer.parseInt(s) <= 69 && Integer.parseInt(s) >= 60) {
                sixtyToSixtyNine.append("*");
            }
            if (Integer.parseInt(s) <= 79 && Integer.parseInt(s) >= 70) {
                seventyToSeventyNine.append("*");
            }
            if (Integer.parseInt(s) <= 89 && Integer.parseInt(s) >= 80) {
                eightyToEightyNine.append("*");
            }
            if (Integer.parseInt(s) <= 99 && Integer.parseInt(s) >= 90) {
                ninetyToNinetyNine.append("*");
            } else if (Integer.parseInt(s) == 100) {
                hundread.append("*");
            }
        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
