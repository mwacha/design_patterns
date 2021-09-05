package tk.mwacha.bridge.transmissions;

import tk.mwacha.bridge.platforms.IPlatform;

public class Live implements ITransmission{

    protected IPlatform platform;

    public Live(){

    }

    public Live(IPlatform platform){
        this.platform = platform;
    }
    @Override
    public void broadcasting() {
        System.out.println("Inicando a trasmissão");
    }

    @Override
    public void result() {
        System.out.println("*** ON AIR ***");
    }
}
