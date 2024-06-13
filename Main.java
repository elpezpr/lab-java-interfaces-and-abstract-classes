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

        // Create vehicle objects
        Car sedan = new Sedan("223344556", "Lexus", "SC400", 50000);
        Car utilityVehicle = new UtilityVehicle("12345", "Ford", "F-150", 50000, true);
        Car truck = new Truck("22322333", "GMC", "Sierra", 123000,  2500);

        // Call getInfo
        String carDetails = sedan.getInfo();
        System.out.println(carDetails);
        String utilityVehicleDetails = utilityVehicle.getInfo();
        System.out.println(utilityVehicleDetails);
        String truckDetails = truck.getInfo();
        System.out.println(truckDetails);
    }
}
