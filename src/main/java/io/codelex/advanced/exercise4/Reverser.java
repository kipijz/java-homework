package io.codelex.advanced.exercise4;

import java.io.*;
import java.util.Stack;

public class Reverser {
    private static final String PATH = "C:\\Users\\yo\\Desktop\\CODELEX\\java-homework\\src\\main\\java\\io\\codelex\\advanced\\exercise4\\example\\";

    public static void main(String[] args) throws IOException {
        String fileName = "text";
        String reversedFileName = new StringBuilder().append(fileName).reverse().toString();
        BufferedReader in = new BufferedReader(new FileReader(PATH + fileName + ".txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH + reversedFileName + ".txt"));

        String line;
        StringBuilder output = new StringBuilder();
        while ((line = in.readLine()) != null) {
            output.append(line);
        }

        String[] outputSplit = output.toString().split("");
        Stack<String> reversed = new Stack<>();
        for (String data: outputSplit) {
            reversed.push(data);
        }

        while (!reversed.isEmpty()) {
            out.write(reversed.pop());
        }
        in.close();
        out.close();
    }
}
