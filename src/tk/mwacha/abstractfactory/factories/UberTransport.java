package tk.mwacha.abstractfactory.factories;

import tk.mwacha.abstractfactory.aircraft.Airplane;
import tk.mwacha.abstractfactory.aircraft.IAircraft;
import tk.mwacha.abstractfactory.boats.Boat;
import tk.mwacha.abstractfactory.boats.IBoat;
import tk.mwacha.abstractfactory.landvehicles.Car;
import tk.mwacha.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
