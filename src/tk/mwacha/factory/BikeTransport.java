package tk.mwacha.factory;

import tk.mwacha.factory.vehicle.Bike;
import tk.mwacha.factory.vehicle.Car;
import tk.mwacha.factory.vehicle.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
