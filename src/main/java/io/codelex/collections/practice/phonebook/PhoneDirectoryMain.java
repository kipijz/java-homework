package io.codelex.collections.practice.phonebook;

public class PhoneDirectoryMain {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.putNumber("Zevs", "41415551");
        phoneDirectory.putNumber("Koks", "41415151");
        phoneDirectory.putNumber("Bonis", "51985195781");
        phoneDirectory.putNumber("Zygimantas", "1589076");

        System.out.println(phoneDirectory);

        phoneDirectory.putNumber("Koks", "4544444444444444444");

        System.out.println(phoneDirectory);
        System.out.println(phoneDirectory.getNumber("Zevs"));
        System.out.println(phoneDirectory.getNumber("Koks"));


    }
}
