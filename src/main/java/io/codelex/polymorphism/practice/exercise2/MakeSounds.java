package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;

public class MakeSounds {
    public static void main(String[] arg) {
        Firework firework = new Firework();
        Parrot parrot = new Parrot();
        Radio radio = new Radio();

        Firework firework2 = new Firework();
        Parrot parrot2 = new Parrot();
        Radio radio2 = new Radio();

        ArrayList<Sound> objectSounds = new ArrayList<Sound>();
        objectSounds.add(firework);
        objectSounds.add(parrot);
        objectSounds.add(radio);
        objectSounds.add(firework2);
        objectSounds.add(parrot2);
        objectSounds.add(radio2);

        for (Sound object : objectSounds) {
            object.playSound();
        }
    }
}
