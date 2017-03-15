package com.march;

/**
 * Created by SergeyKarpilovich on 3/15/2017.
 */
public class Notebook extends Property implements IPrintable {
	private double diagonal;
	private String country;

	public Notebook(int cost, String color, String model, double diagonal, String country) {
		super(cost, color, model);
		this.diagonal = diagonal;
		this.country = country;
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public void printInfo() {
		System.out.println("This is a notebook!");
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Notebook: " + model +
				" diagonal: " + diagonal +
				" country: " + country;
	}
}
