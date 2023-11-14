package org.lessons.java.inheritance.shop;

public class Headphone extends Product{
	
	private String color;
	private boolean wireless;
	private boolean wired;
	
	public Headphone(String name, String description, double price, int vat, String color, boolean wireless, boolean wired) {
		super(name, description, price, vat);
		setColor(color);
		setWireless(wireless);
		setWired(wired);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	public boolean isWired() {
		return wired;
	}

	public void setWired(boolean wired) {
		this.wired = wired;
	}
	@Override
	public double getDiscountPrice() {
		if(wired) {
			return getVatPrice() * 0.93;
		}
		return getVatPrice() * 0.98;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
					+ "Wireless: " + isWireless() + "\n"
					+ "Wired: " + isWired() + "\n";
	}
}
