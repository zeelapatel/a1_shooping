package edu.neu.csye6200;

public class Cart {
	private int myCash;
	private int myTotal;
	private int myChange;

	public Cart(int cash) {
		myCash = cash;
		return;
	}

	@Override
	public String toString() {
		return "Cart [myCash=" + myCash + ", myTotal=" + myTotal + ", myChange=" + myChange + "]";
	}

	public int myCashInt() {
		return myCash;
	}

	double tempTotal;

	public void sillyCheckout(double cash, double price, double total, double change) {

		Cart tempCart = new Cart(myCash);
		tempTotal = tempTotal + price;
		tempCart.myTotal = (int) tempTotal;
		tempCart.myChange = tempCart.myCash - tempCart.myTotal;

		System.out.println("Item Price: $" + price);
		System.out.println(tempCart.toString());

	}

	public double Checkout(Cart cart, Item item) {

		cart.myTotal += item.getTotalCost();

		cart.myChange = cart.myCashInt() - cart.myTotal;

		System.out.println(cart.toString());
		return myChange;
	}

}
