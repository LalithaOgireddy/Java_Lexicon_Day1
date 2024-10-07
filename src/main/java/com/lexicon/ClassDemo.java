package com.lexicon;

public class ClassDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.registrationNumber = "M123456";
        myCar.maxSpeed = 115;
        myCar.ownerName = "Lalitha";
        myCar.model = "Fortuner";
        myCar.printInfo();
    }
}
class Car {
    String brand;
    String registrationNumber;
    int maxSpeed;
    String ownerName;
    String model;

    public void printInfo(){
        System.out.println(brand+" "+registrationNumber+" "+maxSpeed+" "+ownerName+" "+model);
    }
}
