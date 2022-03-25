package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<String, String> dataTreeMap;
    private int dataCount;

    public PhoneDirectory() {
        dataTreeMap = new TreeMap<>();
    }

    private boolean find(String name) {
        return dataTreeMap.containsKey(name);
    }

    public String getNumber(String name) {
        if (find(name)) {
            return dataTreeMap.get(name);
        } else {
            return null;
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        if (find(name)) {
            dataTreeMap.put(name, number);
        } else {
            dataTreeMap.put(name, number);
            dataCount++;
        }
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "dataTreeMap=" + dataTreeMap +
                ", dataCount=" + dataCount +
                '}';
    }
}
