package task_2;

public class Workstation extends Laptop{
    private String gpuModel;
    private int cpuCores;

    public Workstation(String brand, int memorySizeGB, double screenSizeInches, int batteryCapacityWh, String gpuModel, int cpuCores) {
        super(brand, memorySizeGB, screenSizeInches, batteryCapacityWh);
        this.gpuModel = gpuModel;
        this.cpuCores = cpuCores;
    }

    public String getGpuModel() {
        return gpuModel;
    }
    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public int getCpuCores() {
        return cpuCores;
    }
    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }
}
