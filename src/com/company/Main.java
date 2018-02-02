package com.company;
import com.sun.org.apache.xpath.internal.operations.And;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print( "Enter your name: " );
        String name = reader.nextLine();
        System.out.println( "Hello " + name);
        System.out.print( "What source unit do you want? C for Celsius, F for Fahrenheit, or K for Kelvin: " );
        String unit = reader.nextLine();
        System.out.print("What result unit you want? C for Celsius, F for Fahrenheit, or K for Kelvin: ");
        String result_unit = reader.nextLine();
        System.out.print("What temperature would you like to convert? ");
        double temp = reader.nextDouble();
        TemperatureConverter Temp = new TemperatureConverter(unit, result_unit);
        double convertedTemp = Temp.convert(temp);
        System.out.println("The conversion from" + unit + "to" + result_unit + "would make it: " + convertedTemp + " " + result_unit);
    }
}

