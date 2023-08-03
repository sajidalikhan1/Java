package Excercise;

import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter number of year :");
		int age = s.nextInt();
		
		if(age<5) {
			System.out.println("Baby");
		}else if( age<=12 & age>=5) {
			System.out.println("Child");
		}else if(age<=18 & age>=13) {
			System.out.println("Teenage");
		}
		else {
			System.out.println("adult");
		}
		
		
	}

}
