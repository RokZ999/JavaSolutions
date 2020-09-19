package Repl;

import java.util.ArrayList;

public class Solution064 {
	public static void main(String[] args) {

		ArrayList<StoreProduct> lista = new ArrayList<>();
		StoreProduct milk,tea,ham,bread;

		lista.add(milk = new StoreProduct("Milk", 2, "Milk", true, 100));
		lista.add(tea = new StoreProduct("Tea", 3, 3));
		lista.add(ham = new StoreProduct("Ham", 4));
		lista.add(bread = new StoreProduct("Bread", 1, "Bread", false));
		lista.get(0).expired(true);
		lista.get(1).sale(2);
		System.out.println(lista.get(2).getDiscountedPrice(0.5));
		lista.forEach(x -> {System.out.println(x);});
	}
}

class StoreProduct{

	String label;
	int price;
	String category;
	boolean hasExpiration;
	int stock;

	public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
		this.label = label;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
		this.stock = stock;
	}

	public StoreProduct(String label, int price,int stock) {
		this.label = label;
		this.price = price;
		this.category = "misc";
		this.hasExpiration = false;
		this.stock = stock;
	}
	public StoreProduct(String label, int price) {
		this.label = label;
		this.price = price;
		this.category = "misc";
		this.hasExpiration = false;
		this.stock = 0;
	}
	public StoreProduct(String label, int price, String category, boolean hasExpiration) {
		this.label = label;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
	}
	public void expired(boolean hasExpired){
		if(this.hasExpiration && hasExpired) stock = 0;
	}
	public boolean sale(int quantity){
		if(this.stock<quantity) {
			this.stock-=quantity;
			return true;
		}
		else return false;
	}
	public double getDiscountedPrice(double discount){
		return this.price-this.price*discount;
	}
	@Override
	public String toString() {
		return String.format("Label: %s%nPrice: %d%nCategory: %s%nExpiration: %b%nStock: %d%n", this.label,this.price,this.category,this.hasExpiration,this.stock);
	}
}