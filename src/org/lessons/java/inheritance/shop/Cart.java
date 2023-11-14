package org.lessons.java.inheritance.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Cart {
	public static void main(String[] args) {
//		Smartphone s = new Smartphone("galaxy", "molto brutto", 199, 20, "3234423432", 128); 
//		Television t = new Television("samsung", "molto bella", 299, 20, 24, true);
//		Headphone h = new Headphone("arctic boom pro sound PD", "molto molto bella", 99, 20, "black", true, true);
//		
//		System.out.println(s);
//		System.out.println(t);
//		System.out.println(h);
		
		Scanner in = new Scanner(System.in);
		int prodCount = 0;
		Product[] products = new Product[50];
		while(true) {
			prodCount++;
			System.out.print("che prodotto vuoi aggiungere?");
			String product = in.nextLine();
			System.out.print("Inserisci il nome: ");
			String name = in.nextLine();
			System.out.print("Inserisci una descrizione: ");
			String description = in.nextLine();
			System.out.print("Inserisci il prezzo: ");
			double price = Double.parseDouble(in.nextLine());
			System.out.print("Inserisci la percentuale id VAT che vuoi applicare: ");
			int perc = Integer.parseInt(in.nextLine());
			
			if(product.equals("smartphone")) {
			System.out.print("Inserisci l'IMEI code: ");
			String imei = in.nextLine();
			System.out.print("Inserisci la quantità di MB di memoria: ");
			int memory = Integer.parseInt(in.nextLine());
			Product s = new Smartphone(name, description, price, perc, imei, memory);
			products[prodCount - 1] = s;
			}
			
			else if(product.equals("television")) {
				System.out.print("Inserisci i pollici: ");
				float inches = Float.parseFloat(in.nextLine());
				System.out.print("Inserisci se è smart: ");
				String smart = in.nextLine();
				boolean newSmart = false;
				if (smart.equals("si")) {
				    newSmart = true;
				} else if (smart.equals("no")) {
					 newSmart = false;
				}
				Product s = new Television(name, description, price, perc, inches, newSmart);
				products[prodCount - 1] = s;
			}
			
			else if(product.equals("headphone")) {
				System.out.print("Inserisci il colore: ");
				String color = in.nextLine();
				System.out.print("Inserisci se è wireless: ");
				String wireless = in.nextLine();
				System.out.print("Inserisci se è cablata: ");
				String wired = in.nextLine();
				boolean newWireless = false;
				boolean newWired = false;
				if (wireless.equals("si")) {
					newWireless = true;
				} else if (wireless.equals("no")) {
					newWireless = false;
				}
				if (wired.equals("si")) {
					newWired = true;
				} else if (wired.equals("no")) {
					newWired = false;
				}
				Product s = new Headphone(name, description, price, perc, color, newWireless, newWired);
				products[prodCount - 1] = s;
			}
			
			System.out.print("vuoi aggiungere un'altro prodotto?");
			String another = in.nextLine();
			if(another.equals("no")) {
				for(int x=0;x<products.length;x++) {
					if(products[x] == null) {
						break;
					}
					System.out.println(products[x]);
				}
				break;
			}
		}
	}
}
