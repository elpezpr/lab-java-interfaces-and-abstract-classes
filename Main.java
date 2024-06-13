import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        // Create BigDecimalRounded
        BigDecimal input = new BigDecimal("4.2545");
        BigDecimal input2 = new BigDecimal(-33.4455);

        // Call BigDecimalRounded
        double roundedValue = BigDecimalOperations.BigDecimalRounded(input);
        System.out.println(roundedValue);

        // Call BigDecimalReversed
        BigDecimal reversedValue = BigDecimalOperations.BigDecimalReversed(input2);
        System.out.println("Reversed and rounded number: " + reversedValue);
    }
}
