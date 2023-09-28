package com.example.lab6_4_metricconverter;
import java.util.Scanner;

public class Lab6_4_MetricConverter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double meters;

            do {
                System.out.print("Enter a measurement in meters: ");
                if (scanner.hasNextDouble()) {
                    meters = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            } while (true);

            double miles = metersToMiles(meters);
            double feet = metersToFeet(meters);
            double inches = metersToInches(meters);

            System.out.println(meters + " meters is approximately:");
            System.out.println(miles + " miles");
            System.out.println(feet + " feet");
            System.out.println(inches + " inches");

            scanner.close();
        }

        public static double metersToMiles(double meters) {
            return meters * 0.000621371;
        }

        public static double metersToFeet(double meters) {
            return meters * 3.28084;
        }

        public static double metersToInches(double meters) {
            return meters * 39.3701;
        }

}
