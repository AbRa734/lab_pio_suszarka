package edu.kis.pio.plugs;

import edu.kis.pio.sockets.IEuropeanSocket;

public class PlainEuropeanPlug implements IEuropeanPlug {

	private IEuropeanSocket connectedSocket = null;
	
	@Override
	public int getCurrentVolts() {
		return connectedSocket==null?0:connectedSocket.getVoltsSupplied();
	}

	@Override
	public void plugIntoEuropeanSocket(IEuropeanSocket socket) {
		connectedSocket = socket;
	}

	@Override
	public void unplug() {
		connectedSocket = null;
	}

}