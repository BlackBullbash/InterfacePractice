package com.march.randomObj;

import com.march.IPrintable;
import com.march.Property;

/**
 * Created by SergeyKarpilovich on 3/15/2017.
 */
public class RandomObject extends Property implements IPrintable {

	private int firstField;
	private float secondField;

	public RandomObject(int cost, String color, String model, int firstField, float secondField) {
		super(cost, color, model);
		this.firstField = firstField;
		this.secondField = secondField;
	}

	public int getFirstField() {
		return firstField;
	}

	public void setFirstField(int firstField) {
		this.firstField = firstField;
	}

	public float getSecondField() {
		return secondField;
	}

	public void setSecondField(float secondField) {
		this.secondField = secondField;
	}

	@Override
	public void printInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "RandomObject: " + "Cost: " + cost +
				" firstField: " + firstField +
				" secondField: " + secondField;
	}
}
