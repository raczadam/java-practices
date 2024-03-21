package com.raczadam.design_patterns.principles.solid.liskov_substitution;

import java.util.List;

public class CarDealerShip {

    public static void main(String[] args) {
        FuelCar dieselCar = new DieselCar();
        dieselCar.fuel();

        FuelCar petrolCar = new PetrolCar();
        petrolCar.fuel();

        ElectricCar electricCar = new ElectricCarImpl();
        electricCar.charge();

        List<Car> storage = List.of(dieselCar, petrolCar, electricCar);
        storage.forEach(Car::speedUp);
        storage.forEach(Car::speedDown);
    }

}
