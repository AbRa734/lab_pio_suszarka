package edu.kis.pio.devices;

import edu.kis.pio.plugs.IEuropeanPlug;
import edu.kis.pio.plugs.PlainEuropeanPlug;

public class FavouriteHairDryer implements IEuropeanDevice {

	private IEuropeanPlug myPlug = new PlainEuropeanPlug();
	
	private boolean isOn = false;
	private boolean isValid = true;
	
	@Override
	public IEuropeanPlug getPlug() {
		return myPlug;
	}

	public void turnOn() {
		isOn = true;
		if (myPlug.getCurrentVolts() > 250)
			isValid = false;
	}

	public void turnOff() {
		isOn = false;

	}

	@Override
	public boolean isWorking() {
		return isOn && isValid && myPlug.getCurrentVolts() == 230;
	}
	
	@Override
	public boolean isBroken() {
		return !isValid;
	}

}
