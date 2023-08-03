package Excercise;

public class ElectronicDevice {
	private String brand;
	private double price;
	
	public ElectronicDevice(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void displayDetails() {
		
		System.out.println(" Brand :" +brand);
		System.out.println(" Price :" +price);
		
	}

}

class Television extends ElectronicDevice {
	private int screenSize;
	
	public Television(String brand, double price , int screenSize) {
		super(brand, price);
		this.screenSize = screenSize;
		
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("ScreenSize :" +screenSize+ "inches");
	}	
}

class Laptop extends ElectronicDevice {
	private String os;
	private int screenSize;
	
	public Laptop(String brand, double price, int screenSize, String os) {
		super(brand, price);
		this.screenSize = screenSize;
		this.os = os;
	}
	
	public String getOS() {
		return os;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("OS :" +os);
		System.out.println("ScreenSize :" +screenSize+ "inches");
		
	}
}

class SmartPhone extends ElectronicDevice {
	private String os;
	private int screenSize;
	
	public SmartPhone(String brand, int price, String os, int screenSize) {
		super(brand,price);
		this.os = os;
		this.screenSize = screenSize;
	}
	
	public String getOS() {
		return os;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("OS :" +os);
		System.out.println("ScreenSize :" +screenSize);
	}
	
}


