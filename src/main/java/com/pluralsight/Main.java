package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(10);

        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setFuelCapacity(15);
        familyCar.setNumberOfPassengers(5);
        familyCar.setCargoCapacity(50);

        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("White");
        bigRig.setFuelCapacity(150);
        bigRig.setNumberOfPassengers(2);
        bigRig.setCargoCapacity(40000);

        Hovercraft swampGlider = new Hovercraft();
        swampGlider.setColor("Yellow");
        swampGlider.setFuelCapacity(30);
        swampGlider.setNumberOfPassengers(4);
        swampGlider.setCargoCapacity(500);

        System.out.println("Moped: Color = " + slowRide.getColor() + ", Fuel = " + slowRide.getFuelCapacity() + " gal, Passengers = " + slowRide.getNumberOfPassengers() + ", Cargo = " + slowRide.getCargoCapacity() + " lbs");
        System.out.println("Car: Color = " + familyCar.getColor() + ", Fuel = " + familyCar.getFuelCapacity() + " gal, Passengers = " + familyCar.getNumberOfPassengers() + ", Cargo = " + familyCar.getCargoCapacity() + " lbs");
        System.out.println("SemiTruck: Color = " + bigRig.getColor() + ", Fuel = " + bigRig.getFuelCapacity() + " gal, Passengers = " + bigRig.getNumberOfPassengers() + ", Cargo = " + bigRig.getCargoCapacity() + " lbs");
        System.out.println("Hovercraft: Color = " + swampGlider.getColor() + ", Fuel = " + swampGlider.getFuelCapacity() + " gal, Passengers = " + swampGlider.getNumberOfPassengers() + ", Cargo = " + swampGlider.getCargoCapacity() + " lbs");
    }
}
