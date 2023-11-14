package org.lessons.java.inheritance.shop;

public class Cart {
	public static void main(String[] args) {
		
		Smartphone s = new Smartphone("galaxy", "molto brutto", 199, 20, "3234423432", 128); 
		
		Television t = new Television("samsung", "molto bella", 299, 20, 24, true);
				
		Headphone h = new Headphone("arctic boom pro sound PD", "molto molto bella", 99, 20, "black", true, true);
		
		System.out.println(s);
		System.out.println(t);
		System.out.println(h);
	}
}
