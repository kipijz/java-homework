package io.codelex.oop.parcels;

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(50, 50, 50, 15, true);
        Parcel parcel2 = new Parcel(50, 50, 50, 50, true);
        Parcel parcel3 = new Parcel(50, 15, 50, 25, true);
        Parcel parcel4 = new Parcel(50, 250, 50, 25, true);

        //returns true
        System.out.println("Parcel 1: ");
        System.out.println(parcel1.validate());
        System.out.println();

        //returns false, isExpress but weight is 50
        System.out.println("Parcel 2: ");
        System.out.println(parcel2.validate());
        System.out.println();

        //returns false, yLength < 30, isExpress but weight is 25
        System.out.println("Parcel 3: ");
        System.out.println(parcel3.validate());
        System.out.println();

        //returns false, dimensions > 300
        System.out.println("Parcel 4: ");
        System.out.println(parcel4.validate());
        System.out.println();

    }
}
