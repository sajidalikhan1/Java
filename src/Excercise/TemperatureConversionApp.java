package Excercise;

public class TemperatureConversionApp {
	public static void main(String[] args) {
		double celsiusTemperature = 25.0;
		double fahrenheitTemperature = 70.0;
		
		double convertedToFahrenheit = TemperatureConverter.celsiusTOFahrenheit(celsiusTemperature);
		double convertedToCelsius = TemperatureConverter.fahrenheitToCelsius(fahrenheitTemperature);
		
		System.out.println(celsiusTemperature + " °C is equal to " + convertedToFahrenheit + " °F");
		System.out.println(fahrenheitTemperature + " °F is equal to " + convertedToCelsius + " °C");
	}
    
}
