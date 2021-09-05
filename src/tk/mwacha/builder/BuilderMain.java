package tk.mwacha.builder;

import tk.mwacha.builder.builders.CarBuilder;
import tk.mwacha.builder.builders.TruckBuilder;
import tk.mwacha.builder.cars.Car;
import tk.mwacha.builder.cars.Truck;
import tk.mwacha.builder.director.Director;

public class BuilderMain {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.contructSedanCar(builder);

        Car car = builder.getResult();

        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.contructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();

        System.out.println("Caminhão: " + truck.result());
    }
}
