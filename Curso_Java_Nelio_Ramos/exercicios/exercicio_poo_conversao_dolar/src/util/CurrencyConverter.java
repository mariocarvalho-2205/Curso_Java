package util;

public class CurrencyConverter {
    
    public double dollar;

    public static double calc(double dollar, double quantity) {
        return (dollar + dollar * 6 / 100) * quantity;
    }
}
