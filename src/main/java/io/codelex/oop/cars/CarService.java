package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class CarService  {
    private ArrayList<Car> carList;

    public CarService(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public void addCarToList(Car car) {
        this.carList.add(car);
    }

    public void removeCarFromList(Car car) {
        this.carList.remove(car);
    }

    public void returnCarList() {
        for (Car car : this.carList) {
            System.out.println(car);
        }
    }

    public void returnCarListWithV12() {
        for (Car car : this.carList) {
            if (car.getEngineType() == EngineType.V12) {
                System.out.println(car);
            }
        }
    }

    public void returnCarListBefore1999() {
        for (Car car : this.carList) {
            if (car.getYearOfManufacture() < 1999) {
                System.out.println(car);
            }
        }
    }

    public void returnMostExpensiveCar() {
        Car element = Collections.max(carList, Comparator.comparingDouble(Car::getPrice));
        System.out.println(element);
    }

    public void returnCheapestCar() {
        Car element = Collections.min(carList, Comparator.comparingDouble(Car::getPrice));
        System.out.println(element);
    }

    public void returnCarListAtLeast3Manufacturers() {
        for (Car car : this.carList) {
            if (car.getManufacturers().size() >= 3) {
                System.out.println(car);
            }
        }
    }

    public void returnCarListSorted(String parameter) {
        if (Objects.equals(parameter.toLowerCase(), "ascending")) {
            carList.sort(Comparator.comparing(Car::getName));
            for (Car car : this.carList) {
                System.out.println(car);
            }
        } else if (Objects.equals(parameter.toLowerCase(), "descending")) {
            carList.sort(Comparator.comparing(Car::getName).reversed());
            for (Car car : this.carList) {
                System.out.println(car);
            }
        } else {
            System.out.println("you passed an invalid parameter!");
        }
    }

    public void isCarOnList(String carName) {
        boolean onList = false;
        for (Car car : this.carList) {
            if (Objects.equals(car.getName(), carName)) {
                System.out.println("Yes, this car is on the list!");
                onList = true;
                break;
            }
        }
        if (!onList) {
            System.out.println("No, the car isn't on the list!");
        }
    }

    public void manufacturedBy(String manufactureName) {
        for (Car car : this.carList) {
            for (Manufacturer manufacturer : car.getManufacturers()) {
                if (Objects.equals(manufacturer.getName(), manufactureName)) {
                    System.out.println(car);
                }
            }
        }
    }

    public void manufacturedYearComparing(String manufactureName, int userYearInput) {
        for (Car car : this.carList) {
            for (Manufacturer manufacturer : car.getManufacturers()) {
                if (Objects.equals(manufacturer.getName(), manufactureName)) {
                    if (manufacturer.getYearOfEstablishment() < userYearInput) {
                        System.out.println("manufactured year < given year");
                        System.out.println(car);
                    }
                    if (manufacturer.getYearOfEstablishment() > userYearInput) {
                        System.out.println("manufactured year > given year");
                        System.out.println(car);
                    }
                    if (manufacturer.getYearOfEstablishment() <= userYearInput) {
                        System.out.println("manufactured year <= given year");
                        System.out.println(car);
                    }
                    if (manufacturer.getYearOfEstablishment() >= userYearInput) {
                        System.out.println("manufactured year >= given year");
                        System.out.println(car);
                    }
                    if (manufacturer.getYearOfEstablishment() == userYearInput) {
                        System.out.println("manufactured year = given year");
                        System.out.println(car);
                    }
                    if (manufacturer.getYearOfEstablishment() != userYearInput) {
                        System.out.println("manufactured year != given year");
                        System.out.println(car);
                    }
                }
            }
        }
    }
}
