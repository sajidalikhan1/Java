package Excercise;

public class TemperatureConverter {
	public static double celsiusTOFahrenheit(double celsius) { 
		return (celsius * 9/5) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit -32) * 5/9;
	}
}
