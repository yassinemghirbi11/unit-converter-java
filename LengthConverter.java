package unitconverter;

public class LengthConverter {

    // Meter ↔ Kilometer
    public static double meterToKm(double m) {
        return m / 1000;
    }

    public static double kmToMeter(double km) {
        return km * 1000;
    }

    // Meter ↔ Centimeter
    public static double meterToCm(double m) {
        return m * 100;
    }

    public static double cmToMeter(double cm) {
        return cm / 100;
    }

    // Mile ↔ Kilometer
    public static double mileToKm(double mile) {
        return mile * 1.60934;
    }

    public static double kmToMile(double km) {
        return km / 1.60934;
    }

    // Feet ↔ Meter
    public static double feetToMeter(double feet) {
        return feet * 0.3048;
    }

    public static double meterToFeet(double meter) {
        return meter / 0.3048;
    }
}
