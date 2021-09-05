package tk.mwacha.builder.builders;

import tk.mwacha.builder.components.CarType;
import tk.mwacha.builder.components.Engine;
import tk.mwacha.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
