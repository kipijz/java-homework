package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> linesList = Files.readAllLines(path, charset);

        int chars = 0;
        int words = 0;
        int lines = linesList.size();

        boolean foundWord = false;
        for (int i = 0; i < linesList.size(); i++) {
            for (int j = 0; j < linesList.get(i).length(); j++) {
                chars++;
            }
            //pie šitā dažas stundas pasēdēju, nevarēju nonākt pie risinājuma ar Character.isLetterOrDigit.
            //ar Regex viņš arī nedod tos 47, bet tajā piemērā ir dīvaini skaitīti vārdi - piemēram, "O" ieskaitīts kā vārds, visus vārdus, kuri satur apostrofu, pieskaita kā 2 vārdus, nevis 1.
            words += linesList.get(i).split("[\\pP\\s&&[^']]+").length;
        }


        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
        System.out.println("Chars = " + chars);

    }
}
