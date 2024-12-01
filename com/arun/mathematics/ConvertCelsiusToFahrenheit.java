package com.arun.mathematics;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(32));
    }

    public static double convertCelsiusToFahrenheit(double celsius){
        double fahrenheit = celsius * 1.8 + 32;;
        return fahrenheit;
    }
}
