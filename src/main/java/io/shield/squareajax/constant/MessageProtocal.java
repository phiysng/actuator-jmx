package io.shield.squareajax.constant;

public enum MessageProtocal {
	
	LOGIN(10001,"login"),
	LOGOUT(10002,"logout"),
	BUY(10010,"buy");
	
	private MessageProtocal(long number , String name) {
	
		
		this.number = number;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public long getNumber() {
		return number;
	}

	
	
	private final long number;
	private final String name;
}
