package tk.mwacha.builder.director;

import tk.mwacha.builder.builders.IBuilder;
import tk.mwacha.builder.components.CarType;
import tk.mwacha.builder.components.Engine;
import tk.mwacha.builder.components.Transmission;

public class Director {

    public void contructSedanCar(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void contructTruck(IBuilder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }
}
