package Excercise;

import java.util.Scanner;
public class ShoppingDiscount {
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		
		System.out.println("Enter a amount for discount :");
		double amount= a.nextDouble();
		
		double discount=0.0;
		
		if(amount >=1000) {
			//20% discount if more than 1000
			discount = 0.2 * amount;
		}
		
		else if(amount >= 100 & amount<=1000) {
			// 10% discount
			discount = 0.1 * amount;
		}else if(amount <= 100 ) {
			//5% discount
			discount = 0.05 * amount;
		}
		 double finalAmount = amount - discount;
		 
		 System.out.println("Purchase amount :" +amount);
		 System.out.println("Discount :" +discount);
		 System.out.println("Final amount :" +finalAmount);
		 
		 a.close();
	}

}
