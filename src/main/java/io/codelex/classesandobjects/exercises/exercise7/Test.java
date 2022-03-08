package io.codelex.classesandobjects.exercises.exercise7;

public class Test {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male");
        Dog rocky = new Dog("Rocky", "male");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female");

        max.setDogMother(lady);
        max.setDogFather(rocky);

        coco.setDogMother(molly);
        coco.setDogFather(buster);

        rocky.setDogMother(molly);
        rocky.setDogFather(sam);

        buster.setDogMother(lady);
        buster.setDogFather(sparky);

        System.out.println(coco.fathersName());
        System.out.println(sparky.fathersName());

        System.out.println(coco.hasSameMotherAs(rocky));

    }
}
