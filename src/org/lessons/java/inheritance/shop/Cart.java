package org.lessons.java.inheritance.shop;

import java.util.Scanner;

public class Cart {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int prodCount = 0;
		Product[] products = new Product[50];
		boolean loyal = false;
		double total = 0;
		while(true) {
			prodCount++;
			System.out.print("che prodotto vuoi aggiungere?");
			String product = in.nextLine();
			if(!product.equalsIgnoreCase("cuffie") && !product.equalsIgnoreCase("smartphone") && !product.equalsIgnoreCase("tv")) {
				System.out.print("puoi inserire solo: smartphone,tv o cuffie\n");
				continue;
			};
			System.out.print("Inserisci il nome: ");
			String name = in.nextLine();
			System.out.print("Inserisci una descrizione: ");
			String description = in.nextLine();
			System.out.print("Inserisci il prezzo: ");
			double price = Double.parseDouble(in.nextLine());
			System.out.print("Inserisci la percentuale di VAT che vuoi applicare: ");
			int perc = Integer.parseInt(in.nextLine());
			
			if(product.equalsIgnoreCase("smartphone")) {
			System.out.print("Inserisci l'IMEI code: ");
			String imei = in.nextLine();
			System.out.print("Inserisci la quantità di MB di memoria: ");
			int memory = Integer.parseInt(in.nextLine());
			Product s = new Smartphone(name, description, price, perc, imei, memory);
			products[prodCount - 1] = s;
			}
			
			else if(product.equalsIgnoreCase("tv")) {
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
			
			else if(product.equalsIgnoreCase("cuffie")) {
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
				System.out.print("hai la carta fedelta?\n");
				String loyalS = in.nextLine();
				loyal = loyalS.equals("si")? true : false;
				for (int x = 0; x < products.length; x++) {
				    if(products[x] == null) {
				    	break;
				    }
				    System.out.println(products[x]);
				    if (loyal) {
				        total += products[x].getDiscountPrice();
				    } else {
				        total += products[x].getVatPrice();
				    }
				}
				System.out.println("il prezzo finale è: " + String.format("%.2f", total));
				in.close();
				break;
				}	
			}
		}
	}
