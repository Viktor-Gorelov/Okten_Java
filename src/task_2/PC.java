package task_2;

public class PC {
    private String brand;
    private int memorySizeGB;

    public PC(String brand, int memorySizeGB) {
        this.brand = brand;
        this.memorySizeGB = memorySizeGB;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemorySizeGB() {
        return memorySizeGB;
    }
    public void setMemorySizeGB(int memorySizeGB) {
        this.memorySizeGB = memorySizeGB;
    }
}
