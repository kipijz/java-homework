package io.codelex.advanced.exercise3;

import java.util.Arrays;
import java.util.List;

public class Joiner {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public <T> String join(T... objects) {
        List<String> stringList = Arrays.stream(objects)
                .map(Object::toString)
                .toList();
        return String.join(separator, stringList);
    }
}
