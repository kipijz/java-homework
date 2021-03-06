package io.codelex.classesandobjects.exercises.exercise7;

public class Dog {
    private String name;
    private DogSex sex;
    private Dog dogFather;
    private Dog dogMother;

    public Dog(String name, DogSex sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog getDogFather() {
        return dogFather;
    }

    public void setDogFather(Dog dogFather) {
        this.dogFather = dogFather;
    }

    public Dog getDogMother() {
        return dogMother;
    }

    public void setDogMother(Dog dogMother) {
        this.dogMother = dogMother;
    }

    public String fathersName() {
        if (dogFather != null) {
            return dogFather.name;
        } else {
            return "Unknown";
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (otherDog != null) {
            return this.dogMother == otherDog.dogMother;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
