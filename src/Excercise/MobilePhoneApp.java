package Excercise;

public class MobilePhoneApp {
	public static void main(String[] args) {
		
		MobilePhone phone1 = new MobilePhone("Apple" , "iphone14 pro" , 120000);
		
		MobilePhone phone2 = new MobilePhone("Samsung" , "S23 ultra" , 124000);
		
		System.out.println("Phone details :");
		phone1.displayDetails();
		
		System.out.println("Phone details");
		phone2.displayDetails();
		
	}

}
