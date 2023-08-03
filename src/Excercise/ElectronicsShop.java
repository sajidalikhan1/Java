package Excercise;

public class ElectronicsShop {
	public static void main(String[] args) {
		
		Television tv = new Television("Sony" , 124000, 55);
		
		Laptop laptop = new Laptop("Apple" , 181000 , 14, "Mac OS");
		
		SmartPhone phone = new SmartPhone("Samsung" , 124000, "Andriod", 7);
		
		System.out.println("\nTelevision Details :");
		tv.displayDetails();
		
		System.out.println("\nLaptop Details :");
		laptop.displayDetails();
		
		System.out.println("\nSmart Phone Details :");
		phone.displayDetails();
	}
}
