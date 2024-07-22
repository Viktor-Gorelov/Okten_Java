package task_3;

public class Car {
    private String model;
    private double enginePower;
    private Owner owner;
    private int price;
    private int yearOfProduction;

    public Car(String model, double enginePower, Owner owner, int price, int yearOfProduction){
        this.model = model;
        this.enginePower = enginePower;
        this.owner = owner;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getEnginePower() {
        return enginePower;
    }
    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void increaseEnginePower() {
        enginePower *= 1.1;
    }

    @Override
    public String toString() {
        return "Car model: " + model + " " +
                "Engine Power: " + enginePower + " " +
                "Owner: " + owner.getName() + " " +
                "Price: " + price + " " +
                "Year Of Production: " + yearOfProduction ;
    }
}
