package unitconverter;


public class WeightConverter {

    // Kilogram ↔ Gram
    public static double kgToGram(double kg) {
        return kg * 1000;
    }

    public static double gramToKg(double gram) {
        return gram / 1000;
    }

    // Kilogram ↔ Pound
    public static double kgToPound(double kg) {
        return kg * 2.20462;
    }

    public static double poundToKg(double pound) {
        return pound / 2.20462;
    }
}
