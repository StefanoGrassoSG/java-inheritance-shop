package org.lessons.java.inheritance.shop;

import java.util.Random;

public class Product {
	private int code;
	private String name;
	private String description;
	private double price;
	private int vat;
	
	public Product(String name, String description, double price, int vat) {
		Random rnd = new Random();
		setCode(rnd.nextInt(100, 1001));
		setName(name);
		setDescription(description);
		setPrice(price);
		setVat(vat);
	}
	
	public int getCode() {
		
		return code;
	}
	private void setCode(int code) {
		this.code = code;
	}
	public String getCodePad() {
		
	    return String.format("%08d", getCode());
	}

	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		if(name.length() < 128 && name.length() > 0) {
			this.name = name;
		}
	}
	public String getDescription() {
		
		return description;
	}
	public void setDescription(String description) {
		if(description.length() < 500 && description.length() > 0) {
			this.description = description;
		}
	}
	public double getPrice() {
		
		return price;
	}
	public void setPrice(double price) {
		if(price > 0.01) {
			this.price = price;
		}
	}
	public int getVat() {
		
		return vat;
	}
	public void  setVat(int vat) {
		
		this.vat = vat;
	}
	public double getVatPrice() {
		
		return getPrice() + (getPrice() * getVat() / 100);
	}
	public String getFullName() {
		
		return getCode() + "-" + getName();
	}
	public double getDiscountPrice() {
		
		return getVatPrice() * 0.98;
	}
	
	@Override
	public String toString() {
		
		return "Product:\n"
				+ "code: " + getCode() + "\n"
				+ "name: " + getName() + "\n"
				+ "description: " + getDescription() + "\n"
				+ "price: " + String.format("%.02f", getPrice()) + "$\n"
				+ "discounted price: " + String.format("%.02f", getDiscountPrice()) + "$\n"
				+ "VAT: " + getVat() + "%\n"
				+ "price with VAT: " + String.format("%.02f", getVatPrice()) + "$\n"
				+ "Full Name: " + getFullName() + "\n"
				+ "pad code: " + getCodePad() + "\n";
	}
}
