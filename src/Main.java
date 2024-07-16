import task_1.Book;
import task_1.Magazine;
import task_1.Printable;
import task_2.Drum;
import task_2.Guitar;
import task_2.Instrument;
import task_2.Trumpet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Printable[] printableItems = new Printable[2];

        printableItems[0] = new Book("Java Programming");
        printableItems[1] = new Magazine("Java Magazine");

        for (Printable item : printableItems) {
            item.print();
        }

        System.out.println("Task 2");
        Instrument[] instruments = new Instrument[6];

        instruments[0] = new Guitar(4);
        instruments[1] = new Drum(5);
        instruments[2] = new Trumpet(3.5);
        instruments[3] = new Guitar(8);
        instruments[4] = new Drum(10);
        instruments[5] = new Trumpet(7);

        for (Instrument instrument: instruments){
            instrument.play();
        }
    }
}