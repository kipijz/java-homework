package io.codelex.classesandobjects.exercises.exercise7;

public class Test {
    public static void main(String[] args) {
        Dog max = new Dog("Max", DogSex.MALE);
        Dog rocky = new Dog("Rocky", DogSex.MALE);
        Dog sparky = new Dog("Sparky", DogSex.MALE);
        Dog buster = new Dog("Buster", DogSex.MALE);
        Dog sam = new Dog("Sam", DogSex.MALE);
        Dog lady = new Dog("Lady", DogSex.FEMALE);
        Dog molly = new Dog("Molly", DogSex.FEMALE);
        Dog coco = new Dog("Coco", DogSex.FEMALE);

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
