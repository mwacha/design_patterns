package tk.mwacha.factory;

import tk.mwacha.factory.vehicle.Car;
import tk.mwacha.factory.vehicle.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
