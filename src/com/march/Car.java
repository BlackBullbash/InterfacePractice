package com.march;

/**
 * Created by SergeyKarpilovich on 3/15/2017.
 */
public class Car extends Property implements IPrintable {
	private int speed;
	private String bodyType;

	public Car(int cost, String color, String model, int speed, String bodyType) {
		super(cost, color, model);
		this.speed = speed;
		this.bodyType = bodyType;
	}

	public String getBodyType() {
		return bodyType;
	}

	public int getSpeed() {
		return speed;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void printInfo() {
		System.out.println("This is a Car!");
		//System.out.println(super.toString());
		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Car: " + model + " Cost: " + cost + " Color " + color +
				" speed: " + speed +
				" bodyType: " + bodyType + '\'';
	}
}
