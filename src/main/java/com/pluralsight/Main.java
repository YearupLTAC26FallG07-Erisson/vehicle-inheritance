package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 1, 0, 5);
        Car familyCar = new Car("Blue", 5, 50, 15);
        SemiTruck bigRig = new SemiTruck("White", 2, 40000, 150);
        Hovercraft swampGlider = new Hovercraft("Yellow", 4, 500, 30);

        System.out.println("Moped: Color = " + slowRide.getColor() + ", Passengers = " + slowRide.getNumberOfPassengers() + ", Cargo = " + slowRide.getCargoCapacity() + " lbs, Fuel = " + slowRide.getFuelCapacity() + " gal");
        System.out.println("Car: Color = " + familyCar.getColor() + ", Passengers = " + familyCar.getNumberOfPassengers() + ", Cargo = " + familyCar.getCargoCapacity() + " lbs, Fuel = " + familyCar.getFuelCapacity() + " gal");
        System.out.println("SemiTruck: Color = " + bigRig.getColor() + ", Passengers = " + bigRig.getNumberOfPassengers() + ", Cargo = " + bigRig.getCargoCapacity() + " lbs, Fuel = " + bigRig.getFuelCapacity() + " gal");
        System.out.println("Hovercraft: Color = " + swampGlider.getColor() + ", Passengers = " + swampGlider.getNumberOfPassengers() + ", Cargo = " + swampGlider.getCargoCapacity() + " lbs, Fuel = " + swampGlider.getFuelCapacity() + " gal");
    }
}
