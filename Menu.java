package unitconverter;

import java.util.Scanner;

public class Menu {

	    public static void start() {
	        Scanner sc = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            System.out.println("\n=== UNIT CONVERTER ===");
	            System.out.println("1. Length");
	            System.out.println("2. Weight");
	            System.out.println("3. Temperature");
	            System.out.println("0. Exit");
	            System.out.print("Choose a category: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1 -> lengthMenu(sc);
	                case 2 -> weightMenu(sc);
	                case 3 -> temperatureMenu(sc);
	                case 0 -> {
	                    running = false;
	                    System.out.println("Goodbye!");
	                }
	                default -> System.out.println("Invalid choice!");
	            }
	        }
	        sc.close();
	    }

	    // ---------- LENGTH ----------
	    private static void lengthMenu(Scanner sc) {
	        System.out.println("\n--- Length Converter ---");
	        System.out.println("1. Meter → Kilometer");
	        System.out.println("2. Kilometer → Meter");
	        System.out.println("3. Meter → Centimeter");
	        System.out.println("4. Centimeter → Meter");
	        System.out.println("5. Mile → Kilometer");
	        System.out.println("6. Kilometer → Mile");
	        System.out.println("7. Feet → Meter");
	        System.out.println("8. Meter → Feet");
	        System.out.print("Choose conversion: ");

	        int choice = sc.nextInt();
	        System.out.print("Enter value: ");
	        double value = sc.nextDouble();

	        switch (choice) {
	            case 1 -> System.out.println("Result: " + LengthConverter.meterToKm(value));
	            case 2 -> System.out.println("Result: " + LengthConverter.kmToMeter(value));
	            case 3 -> System.out.println("Result: " + LengthConverter.meterToCm(value));
	            case 4 -> System.out.println("Result: " + LengthConverter.cmToMeter(value));
	            case 5 -> System.out.println("Result: " + LengthConverter.mileToKm(value));
	            case 6 -> System.out.println("Result: " + LengthConverter.kmToMile(value));
	            case 7 -> System.out.println("Result: " + LengthConverter.feetToMeter(value));
	            case 8 -> System.out.println("Result: " + LengthConverter.meterToFeet(value));
	            default -> System.out.println("Invalid choice!");
	        }
	    }


	    // ---------- WEIGHT ----------
	    private static void weightMenu(Scanner sc) {
	        System.out.println("\n--- Weight Converter ---");
	        System.out.println("1. Kilogram → Gram");
	        System.out.println("2. Gram → Kilogram");
	        System.out.println("3. Kilogram → Pound");
	        System.out.println("4. Pound → Kilogram");
	        System.out.print("Choose conversion: ");

	        int choice = sc.nextInt();
	        System.out.print("Enter value: ");
	        double value = sc.nextDouble();

	        switch (choice) {
	            case 1 -> System.out.println("Result: " + WeightConverter.kgToGram(value));
	            case 2 -> System.out.println("Result: " + WeightConverter.gramToKg(value));
	            case 3 -> System.out.println("Result: " + WeightConverter.kgToPound(value));
	            case 4 -> System.out.println("Result: " + WeightConverter.poundToKg(value));
	            default -> System.out.println("Invalid choice!");
	        }
	    }


	    // ---------- TEMPERATURE ----------
	    private static void temperatureMenu(Scanner sc) {
	        System.out.println("\n--- Temperature Converter ---");
	        System.out.println("1. Celsius → Fahrenheit");
	        System.out.println("2. Fahrenheit → Celsius");
	        System.out.println("3. Celsius → Kelvin");
	        System.out.println("4. Kelvin → Celsius");
	        System.out.print("Choose conversion: ");

	        int choice = sc.nextInt();
	        System.out.print("Enter value: ");
	        double value = sc.nextDouble();

	        switch (choice) {
	            case 1 -> System.out.println("Result: " + TemperatureConverter.cToF(value));
	            case 2 -> System.out.println("Result: " + TemperatureConverter.fToC(value));
	            case 3 -> System.out.println("Result: " + TemperatureConverter.cToK(value));
	            case 4 -> System.out.println("Result: " + TemperatureConverter.kToC(value));
	            default -> System.out.println("Invalid choice!");
	        }
	    }

	}



