package tk.mwacha.abstractfactory;

import tk.mwacha.abstractfactory.app.Application;
import tk.mwacha.abstractfactory.factories.BoatTransport;
import tk.mwacha.abstractfactory.factories.ITransportFactory;
import tk.mwacha.abstractfactory.factories.NineNineTransport;
import tk.mwacha.abstractfactory.factories.UberTransport;

public class MainAbstractFactory {

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        String company = "99";

        if(company == "uber"){
            factory = new UberTransport();
        }else if(company == "99"){
            factory = new NineNineTransport();
        }else {
            factory = new BoatTransport();
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}
