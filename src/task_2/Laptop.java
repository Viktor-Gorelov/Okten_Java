package task_2;

public class Laptop extends PC {
    private double screenSizeInches;
    private int batteryCapacityWh;

    public Laptop(String brand, int memorySizeGB, double screenSizeInches, int batteryCapacityWh) {
        super(brand, memorySizeGB);
        this.screenSizeInches = screenSizeInches;
        this.batteryCapacityWh = batteryCapacityWh;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }
    public void setScreenSizeInches(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public int getBatteryCapacityWh() {
        return batteryCapacityWh;
    }
    public void setBatteryCapacityWh(int batteryCapacityWh) {
        this.batteryCapacityWh = batteryCapacityWh;
    }
}
