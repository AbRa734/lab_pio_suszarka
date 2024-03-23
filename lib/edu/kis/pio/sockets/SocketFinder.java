package edu.kis.pio.sockets;

public class SocketFinder {

	public IEuropeanSocket findEuropeanRegularSocket() {
		return new DefaultEuropeanSocket(230);
	}
	
	public IEuropeanSocket findEuropeanPowerSocket() {
		return new DefaultEuropeanSocket(400);
	}
	
	public IUKSocket findUKRegularSocket() {
		return new DefaultUKSocket(230);
	}
	
	public IUKSocket findUKPowerSocket() {
		return new DefaultUKSocket(400);
	}
	
}

class DefaultEuropeanSocket implements IEuropeanSocket {

	private int voltage;
	
	public DefaultEuropeanSocket(int voltage) {
		this.voltage = voltage;
	}

	@Override
	public int getVoltsSupplied() {
		return voltage;
	}

}


class DefaultUKSocket implements IUKSocket {

	private int voltage;
	
	public DefaultUKSocket(int voltage) {
		this.voltage = voltage;
	}

	@Override
	public int getVoltsSupplied() {
		return voltage;
	}

}
