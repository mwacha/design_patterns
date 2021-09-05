package tk.mwacha.abstractfactory.factories;

import tk.mwacha.abstractfactory.aircraft.IAircraft;
import tk.mwacha.abstractfactory.boats.IBoat;
import tk.mwacha.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}
