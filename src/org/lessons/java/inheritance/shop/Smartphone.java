package org.lessons.java.inheritance.shop;

public class Smartphone extends Product {
	
	private String imeiCode;
	private int memory;
	
	public Smartphone(String name, String description, double price, int vat, String imeiCode, int memory) {
		super(name, description, price, vat);
		setImeiCode(imeiCode);
		setMemory(memory);
	}
	
	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}
	public String getImeiCode() {
		return imeiCode;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
					+ "IMEI code: " + getImeiCode() + "\n"
					+ "memory: " + getMemory() + "MB\n";
	}
}
