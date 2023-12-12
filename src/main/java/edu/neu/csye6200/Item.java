package edu.neu.csye6200;

import java.text.SimpleDateFormat;
import java.util.*;

public class Item {
	private String name;
	private double price;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;

	}

	@Override
	public String toString() {
		return "[ Item : name = " + name + ", price=$" + price + " ]";
	}

	public double getTotalCost() {
		return price;
	}

	public static void demo() {

		Item item1 = new Item("Mouse", 5.00);
		Item item2 = new Item("Keyboard", 6.00);

		double totalCost = item1.getTotalCost() + item2.getTotalCost();

		double cash = 20.0;

		double change = cash - totalCost;
		int intCash = (int) cash;
		Cart cart = new Cart(intCash);
		System.out.println("-------------------------------------- Recipt");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String dateTime = dateFormat.format(date);

		System.out.println("Itemized Receipt - Date&Time: " + dateTime);
		System.out.println(item1.toString());
		System.out.println(item2.toString());
		System.out.println("Total Cost: $" + totalCost);
		System.out.println("Cash Payment: $" + cash);
		System.out.println("Change: $" + change);
		System.out.println("-------------------------------------- End\n");
		System.out.println("************************************** Silly Checkout\n");

		cart.sillyCheckout(cash, item1.getTotalCost(), totalCost, change);
		cart.sillyCheckout(cash, item2.getTotalCost(), totalCost, change);
		System.out.println();
		System.out.println("************************************** Checkout\n");

		change = cart.Checkout(cart, item1);
		change = cart.Checkout(cart, item2);
		System.out.println();
		System.out.println("change due to customer after payment: " + change);

	}

}