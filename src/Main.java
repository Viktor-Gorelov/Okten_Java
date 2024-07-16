import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 1");

        // Car
        var audi = new Car("Audi",1,3,100);
        var bentley = new Car("Bentley",3,4,130);
        var chevrolet = new Car("Chevrolet", 2,2,140);
        var bmw = new Car("BMW",3,5,120);
        var ferrari = new Car("Ferrari",4,6,160);

        var arrayCars = new ArrayList<Car>(5);
        arrayCars.add(audi);
        arrayCars.add(bentley);
        arrayCars.add(chevrolet);
        arrayCars.add(bmw);
        arrayCars.add(ferrari);

        System.out.println("Cars");
        for (Car car : arrayCars) {
            System.out.println(
                    "Model: " + car.getModel() + " " +
                            "Power: " + car.getPower() + " " +
                            "Volume Engine: " + car.getVolumeEngine() + " " +
                            "Turbo: " + car.getTurbo());
        }

        // Dog
        var max = new Dog("Max",3,"American Bulldog");
        var jane = new Dog("Jane", 8,"Basenji");
        var rookie = new Dog("Rookie",5,"Belgian Sheepdog");
        var tarl = new Dog("Tarl",2,"Boerboel");
        var elice = new Dog("Elise",5,"Bichon Frise");

        var arrayDogs = new ArrayList<Dog>(5);
        arrayDogs.add(max);
        arrayDogs.add(jane);
        arrayDogs.add(rookie);
        arrayDogs.add(tarl);
        arrayDogs.add(elice);

        System.out.println("Dogs");
        for (Dog dog : arrayDogs) {
            System.out.println(
                    "Name: " + dog.getName() + " " +
                    "Age: " + dog.getAge() + " " +
                    "Breed: " + dog.getBreed());
        }

        // Book
        var goodOmens = new Book(
                "Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch", 491,
                new String[]{"Terry Pratchett", "Neil Gaiman"},"Fantasy");
        var theGuernseyLiterary = new Book(
                "The Guernsey Literary and Potato Peel Pie Society", 277,
                new String[]{"Mary Ann Shaffer", "Annie Barrows"},"Historical Fiction");
        var theDocumentsInTheCase = new Book(
                "The Documents in the Case", 272,
                new String[]{"Dorothy L. Sayers", "Robert Eustace"},"Mystery");
        var allThePresidentsMen = new Book(
                "All the President’s Men", 480,
                new String[]{"Carl Bernstein", "Bob Woodward"},"History");
        var killingMeSoftly = new Book(
                "Killing Me Softly", 385,
                new String[]{"Nicci Gerrard", "Sean French"}, "Thriller");

        var arrayBooks = new ArrayList<Book>(5);
        arrayBooks.add(goodOmens);
        arrayBooks.add(theGuernseyLiterary);
        arrayBooks.add(theDocumentsInTheCase);
        arrayBooks.add(allThePresidentsMen);
        arrayBooks.add(killingMeSoftly);

        System.out.println("Books");
        for (Book book : arrayBooks) {
            System.out.println("Title: " + book.getTitle() + " " +
                            "Pages: " + book.getPages() + " " + "Authors: ");
            for (int i = 0; i < book.getAuthors().length; i++) {
                System.out.println(book.getAuthors()[i]);
            }
            System.out.println("Genre: " + book.getGenre());
        }

        // Post

        var post1 = new Post(1,1,"title_1","body_1");
        var post2 = new Post(1,2,"title_2","body_2");
        var post3 = new Post(1,3,"title_3","body_3");
        var post4 = new Post(1,4,"title_4","body_4");
        var post5 = new Post(1,5,"title_5","body_5");

        var arrayPosts = new ArrayList<Post>(5);
        arrayPosts.add(post1);
        arrayPosts.add(post2);
        arrayPosts.add(post3);
        arrayPosts.add(post4);
        arrayPosts.add(post5);

        System.out.println("Posts");
        for (Post post: arrayPosts){
            System.out.println(
                    "UserId: " + post.userId + " " +
                    "Id: " + post.id + " " +
                    "Title: " + post.title + " " +
                    "Body: " + post.body);
        }

        // Comments
        var comments1 = new Comment(1,1,"comment_1","@mail_1","body_1");
        var comments2 = new Comment(1,2,"comment_2","@mail_2","body_2");
        var comments3 = new Comment(1,3,"comment_3","@mail_3","body_3");
        var comments4 = new Comment(1,4,"comment_4","@mail_4","body_4");
        var comments5 = new Comment(1,5,"comment_5","@mail_5","body_5");

        var arrayComments = new ArrayList<Comment>(5);
        arrayComments.add(comments1);
        arrayComments.add(comments2);
        arrayComments.add(comments3);
        arrayComments.add(comments4);
        arrayComments.add(comments5);

        System.out.println("Comments");
        for(Comment comment: arrayComments){
            System.out.println(
                    "PostId: " + comment.getPostId() + " " +
                            "Id: " + comment.getId() + " " +
                            "Name: " + comment.getName() + " " +
                            "Email: " + comment.getEmail() + " " +
                            "Body: " + comment.getBody());
        }
    }
}
