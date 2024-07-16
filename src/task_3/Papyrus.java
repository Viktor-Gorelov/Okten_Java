package task_3;

public class Papyrus {
    private String material;
    private int age;

    public Papyrus(String material, int age) {
        this.material = material;
        this.age = age;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Book extends Papyrus {
    private String author;

    public Book(String material, int age, String author) {
        super(material, age);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}

class Magazine extends Book {
    private String genre;

    public Magazine(String material, int age, String author, String genre) {
        super(material, age, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}

class Comic extends Book {
    private String illustrator;

    public Comic(String material, int age, String author, String illustrator) {
        super(material, age, author);
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }
    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }
}
