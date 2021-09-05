package tk.mwacha.factory.vehicle;

public class MotoroCycle implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda");
    }
}
