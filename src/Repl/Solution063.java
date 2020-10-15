package Repl;

public class Solution063 {
	public static void main(String[] args) {
		Car Audi = new Car("Audi","A4",2,220,10000);
		Car BMW = new Car("BMW","i3",250,20000);
		Car Citroen = new Car(6, 170, 5500.20);
		Car Škoda = new Car("Škoda", "Octavia", 6);

		System.out.printf("%s%n %s%n %s%n %s%n", Audi,BMW,Citroen,Škoda);

	
	}
}
class Car{

	private String make;
	private String model;
	private int numberOfDoors;
	private double topSpeed;
	private double price;

	public Car(String make, String model, int numberOfDoors, double topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	public Car(String make, String model, double topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = 4;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	public Car(int numberOfDoors, double topSpeed, double price) {
		this.make = "Unknown";
		this.model = "Unknown";
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	public Car(String make, String model, int numberOfDoors) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = 90;
		this.price = 0;
	}
	@Override
	public String toString() {
		return String.format("make: %s%nmodel: %s%ndoors: %d%ntopSpeed: %.2f%nprice: %.2f%n", this.make,this.model,this.numberOfDoors,this.topSpeed,this.price);
	}
}