package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> linesList = Files.readAllLines(path, charset);
        String cleanedUpText = Arrays.toString(String.join(" ", linesList).split("\'"));

        int chars = 0;
        int words = 0;
        int lines = linesList.size();

        for (String s : linesList) {
            for (int j = 0; j < s.length(); j++) {
                chars++;
            }
        }

        boolean foundWord = false;
        for (int i = 0; i < cleanedUpText.length(); i++) {
            if (Character.isLetterOrDigit(cleanedUpText.charAt(i))) {
                if (!foundWord) {
                    foundWord = true;
                    words++;
                }
            } else {
                if (foundWord) {
                    foundWord = false;
                }
            }
        }
        System.out.print("Lines = " + lines + "\nWords = " + words + "\nChars = " + chars);
    }
}
