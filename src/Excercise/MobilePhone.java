package Excercise;

public class MobilePhone {
	private String brand;
	private String modal;
	private double price;
	
	public MobilePhone(String brand, String modal, double price) {
		this.brand = brand;
		this.modal = modal;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModal() {
		return modal;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void displayDetails() {
		System.out.println(" Brand : " +this.brand);
		System.out.println(" Modal : " +this.modal);
		System.out.println(" Price : " +this.price);
	}
}
