public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;
    public UtilityVehicle(String vin, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vin, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Four Wheel Drive: " + fourWheelDrive;
    }
}
