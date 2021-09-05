package tk.mwacha.abstractfactory.app;

import tk.mwacha.abstractfactory.aircraft.IAircraft;
import tk.mwacha.abstractfactory.boats.IBoat;
import tk.mwacha.abstractfactory.factories.ITransportFactory;
import tk.mwacha.abstractfactory.landvehicles.ILandVehicle;

public class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportBoat();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }
}
