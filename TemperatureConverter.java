package unitconverter;

public class TemperatureConverter {

    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double cToK(double c) {
        return c + 273.15;
    }

    public static double kToC(double k) {
        return k - 273.15;
    }
}

