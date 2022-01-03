package oops;

import java.lang.invoke.SwitchPoint;

import basic.Switchcase;

public class Automobile {
	private  String colour;
	private int speed;
	private String make;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void changeGear() {
	
		switch (speed) {
		case 20:
			System.out.println("1st Gear");
			break;
		case 40:
			System.out.println("2st Gear ");
			break; 
		case 60:
			System.out.println("3st Gear ");
			break; 
		case 80:
			System.out.println("4st Gear ");
			break; 
		case 100:
			System.out.println("1st Gear ");
			break; 
			default:
				System.out.println("break");
		}
		
		
		
		
		
	}
	
	
	
	

}
