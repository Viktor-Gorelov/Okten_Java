package task_3;

public class Owner {
    private String name;
    private int age;
    private int drivingExperience;

    public Owner(String name, int age, int drivingExperience){
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }
    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
    public void increaseDrivingExperience() {
        drivingExperience++;
    }

    @Override
    public String toString() {
        return "Owner Name: " + name + " " +
                "Age: " + age + " " +
                "Driver Experience: " + drivingExperience;
    }
}
