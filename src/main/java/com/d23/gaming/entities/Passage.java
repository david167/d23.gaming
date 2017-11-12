package com.d23.gaming.entities;

public class Passage extends AbstractObject{
	
	protected String method = null;
	protected String direction = null;
	protected Location location = null;
		
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

}
