package tk.mwacha.abstractfactory.factories;

import tk.mwacha.abstractfactory.aircraft.Helicopter;
import tk.mwacha.abstractfactory.aircraft.IAircraft;
import tk.mwacha.abstractfactory.boats.Boat;
import tk.mwacha.abstractfactory.boats.IBoat;
import tk.mwacha.abstractfactory.landvehicles.ILandVehicle;
import tk.mwacha.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }


    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
