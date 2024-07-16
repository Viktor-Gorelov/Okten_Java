package task_2;

public class Ultrabook extends Laptop{
    private boolean touchScreen;
    private int weightGrams;

    public Ultrabook(String brand, int memorySizeGB, double screenSizeInches, int batteryCapacityWh, boolean touchScreen, int weightGrams) {
        super(brand, memorySizeGB, screenSizeInches, batteryCapacityWh);
        this.touchScreen = touchScreen;
        this.weightGrams = weightGrams;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }
    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public int getWeightGrams() {
        return weightGrams;
    }
    public void setWeightGrams(int weightGrams) {
        this.weightGrams = weightGrams;
    }
}
