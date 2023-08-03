package Excercise;


public class PrimeNumber {
	public static void main(String[] args) {
		
		        int start = 2; // Start of the range
		        int end = 100; // End of the range

		        System.out.println("Prime numbers between " + start + " and " + end + ":");
		        for (int num = start; num <= end; num++) {
		            if (isPrime(num)) {
		                System.out.print(num + " ");
		            }
		        }
		    }

		    // Function to check if a number is prime
		    public static boolean isPrime(int number) {
		        if (number <= 1) {
		            return false;
		        }

		        // Loop from 2 to the square root of the number
		        // If the number is divisible by any of these, it's not prime
		        for (int i = 2; i <= Math.sqrt(number); i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }
		}

	}