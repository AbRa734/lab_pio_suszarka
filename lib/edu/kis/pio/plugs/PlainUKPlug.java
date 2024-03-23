package edu.kis.pio.plugs;

import edu.kis.pio.sockets.IUKSocket;

public class PlainUKPlug implements IUKPlug {

	private IUKSocket connectedSocket = null;
	
	@Override
	public int getCurrentVolts() {
		return connectedSocket==null?0:connectedSocket.getVoltsSupplied();
	}

	@Override
	public void plugIntoUKSocket(IUKSocket socket) {
		connectedSocket = socket;
	}

	@Override
	public void unplug() {
		connectedSocket = null;
	}

}