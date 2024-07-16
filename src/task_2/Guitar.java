package task_2;

public class Guitar implements Instrument{
    private int numberOfStrings;

    public Guitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }
    public void setNumberOfStrings(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play(){
        System.out.println("Грає Гітара з кількістю струн " + numberOfStrings + " шт");
    }
}
