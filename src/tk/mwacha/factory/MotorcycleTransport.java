package tk.mwacha.factory;

import tk.mwacha.factory.vehicle.IVehicle;
import tk.mwacha.factory.vehicle.MotoroCycle;

public class MotorcycleTransport  extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new MotoroCycle();
    }
}
