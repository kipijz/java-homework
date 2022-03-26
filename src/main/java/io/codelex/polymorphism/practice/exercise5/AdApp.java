package io.codelex.polymorphism.practice.exercise5;

public class AdApp {
    public static void main(String[] arg) {
        Campaign c = new Campaign();
        c.addAdvert(new Advert(1000));
        c.addAdvert(new Hoarding(500, 7, 200));
        c.addAdvert(new NewspaperAd(0, 30, 20));
        c.addAdvert(new TVAd(50000, 1000, 30, true));
        c.addAdvert(new Poster(500, 100, 200, 5, 45, true));
        System.out.println(c);
    }
}
