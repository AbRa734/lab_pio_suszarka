package edu.kis.pio.triptouk;

import edu.kis.pio.devices.IUKDevice;
import edu.kis.pio.plugs.IUKPlug;
import edu.kis.pio.plugs.PlainUKPlug;
import edu.kis.pio.sockets.IEuropeanSocket;

public class Adapter implements IUKDevice, IEuropeanSocket {

    private IUKPlug myPlug = new PlainUKPlug();
    private int voltage;

    public Adapter(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public boolean isWorking() {
        return false;
    }

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public IUKPlug getPlug() {
        return myPlug;
    }

    @Override
    public int getVoltsSupplied() {
        return voltage;
    }
}
