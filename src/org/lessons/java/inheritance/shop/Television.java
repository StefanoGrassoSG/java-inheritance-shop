package org.lessons.java.inheritance.shop;

public class Television extends Product {
	
	private float inches;
	private boolean smart;
	
	public Television(String name, String description, double price, int vat, float inches, boolean smart) {
		super(name, description, price, vat);
		setInches(inches);
		setSmart(smart);
	}

	public float getInches() {
		return inches;
	}

	public void setInches(float inches) {
		this.inches = inches;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
					+ "Inches: " + getInches() + "\n"
					+ "smart TV: " + isSmart() + "\n";
	}
}
