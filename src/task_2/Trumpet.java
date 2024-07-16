package task_2;

public class Trumpet implements Instrument{
    private double diameter;

    public Trumpet(double diameter){
        this.diameter = diameter;
    }

    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Грає труба з діаметром " + diameter + " мм");
    }
}
