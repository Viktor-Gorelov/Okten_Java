package task_1;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    private String getTitle(){
        return title;
    }
    private void setTitle(String title){
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }
}
