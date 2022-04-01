package io.codelex.advanced.exercise3;

public class Joiner {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public <T> String join(T... objects) {
        StringBuilder joinerResult = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            if (i + 1 == objects.length) {
                joinerResult.append(objects[i]);
            } else {
                joinerResult.append(objects[i]).append(separator);
            }
        }
        return joinerResult.toString();
    }
}
