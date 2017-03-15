package com.march;

/**
 * Created by SergeyKarpilovich on 3/15/2017.
 */
public abstract class Property implements IPrintable {
	protected int cost;
	protected String color;
	protected String model;

	public Property(int cost, String color, String model) {
		this.cost = cost;
		this.color = color;
		this.model = model;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCost() {
		return cost;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Property{" +
				"cost=" + cost +
				", color='" + color + '\'' +
				", model='" + model + '\'' +
				'}';
	}
}
