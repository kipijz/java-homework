package io.codelex.oop.computers;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Ryzen 2600", "16 GB", "GTX 1080 Ti", "Gigabyte", "TAF2-31");
        Computer computer2 = new Computer("Ryzen 1600", "32 GB", "GTX 1070 Ti", "Asus", "TAF66-31");
        Computer computer3 = new Computer("i5-7400", "8 GB", "GTX 650 Ti", "ROG", "TAF41-31");

        System.out.println("First computer's model: ");
        System.out.println(computer1.getModel());
        System.out.println();

        System.out.println("Second computer's ram: ");
        System.out.println(computer1.getRam());
        System.out.println();

        System.out.println("Third computer's graphics card: ");
        System.out.println(computer3.getGraphicsCard());
        System.out.println();

        Laptop laptop = new Laptop("i3-1544", "4 GB", "GTX 650 Ti", "Samsung", "DAWDFG-13", "WEDFFF-1");

        System.out.println("Laptop's processor: ");
        System.out.println(laptop.getProcessor());

        System.out.println();

        System.out.println("Laptop's battery: ");
        System.out.println(laptop.getBattery());

    }
}
