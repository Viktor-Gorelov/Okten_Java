import task_1.User;
import task_3.Gender;
import task_3.People;
import task_3.Skill;
import task_4.Person;
import task_4.Pet;
import task_4.ZooClub;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Jane",20);
        User user2 = new User("John",16);
        User user3 = new User("Elisabet",14);
        User user4 = new User("Rockie",12);
        List<User> users = new ArrayList<User>(4);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        System.out.println("Task 1");
        System.out.println("Ліст до сортування");
        printUsers(users);

        System.out.println("Ліст відсортований по зростанню за роками");
        users.sort(Comparator.comparing(User::getAge));
        printUsers(users);

        System.out.println("Ліст відсортований по спаданню за роками");
        users.sort(Comparator.comparing(User::getAge).reversed());
        printUsers(users);

        System.out.println("Ліст відсортований по зростанню за довжиною імені");
        users.sort(Comparator.comparingInt(user -> user.getName().length()));
        printUsers(users);

        System.out.println("Ліст відсортований по спаданню за довжиною імені");
        users.sort(Comparator.comparingInt(user -> -user.getName().length()));
        printUsers(users);

        System.out.println("Task 2");
        System.out.println("Список до сортування по алфавіту");
        ArrayList<String> words = new ArrayList<String>(15);
        words.add("cow");
        words.add("black");
        words.add("iron");
        words.add("copper");
        words.add("hair");
        words.add("brown");
        words.add("short");
        words.add("original");
        words.add("classic");
        words.add("word");
        words.add("long");
        words.add("row");
        words.add("meat");
        words.add("lucky");
        words.add("re");
        Collections.sort(words);
        System.out.println("Список після сортування по алфавіту");
        System.out.println(words);

        System.out.println("Task 3");
        HashSet<People> peoples = new HashSet<>();
        peoples.add(new People("Jane", Gender.FEMALE));
        peoples.add(new People("John", Gender.MALE));
        peoples.add(new People("Rockie", Gender.MALE));
        peoples.add(new People("Elisabet", Gender.FEMALE));
        peoples.add(new People("Eve", Gender.FEMALE));
        peoples.add(new People("Frank", Gender.MALE));
        peoples.add(new People("Grace", Gender.FEMALE));
        peoples.add(new People("Henry", Gender.MALE));
        peoples.add(new People("Ivy", Gender.FEMALE));
        peoples.add(new People("Jack", Gender.MALE));

        System.out.println("HashSet до видалення");
        printPerson(peoples);

        peoples.removeIf(person -> person.getGender().equals(Gender.MALE));

        System.out.println("HashSet після видалення чоловіків:");
        printPerson(peoples);

        System.out.println("Task 4");
        TreeSet<People> personTreeSet = new TreeSet<>(Comparator.comparingInt(skills -> skills.getSkills().size()));

        personTreeSet.add(new People("John", Gender.MALE,
                new Skill[]{new Skill("java", 10), new Skill("c++", 7),
                        new Skill("ruby", 8)}));
        personTreeSet.add(new People("Jane", Gender.FEMALE,
                new Skill[]{new Skill("java", 8), new Skill("javascript", 6)}));
        personTreeSet.add(new People("Ivy", Gender.FEMALE,
                new Skill[]{new Skill("css", 6), new Skill("sql", 5),
                        new Skill("java", 7), new Skill("html", 6),
                        new Skill("react", 7), new Skill("c++", 7),
                        new Skill("ruby", 8), new Skill("python", 4),
                        new Skill("javascript", 8), new Skill("angular", 3)}));
        personTreeSet.add(new People("Elisabet", Gender.FEMALE,
                new Skill[]{new Skill("javascript", 8), new Skill("c++", 7),
                        new Skill("java", 8),new Skill("html", 6),
                        new Skill("react", 7)}));
        personTreeSet.add(new People("Eve", Gender.FEMALE,
                new Skill[]{new Skill("java", 7), new Skill("html", 6),
                        new Skill("react", 7), new Skill("c++", 7),
                        new Skill("ruby", 8), new Skill("python", 4)}));
        personTreeSet.add(new People("Jackson", Gender.MALE, new Skill[]{new Skill("java", 7)}));
        personTreeSet.add(new People("Grace", Gender.FEMALE,
                new Skill[]{new Skill("sql", 5),new Skill("java", 7),
                        new Skill("html", 6), new Skill("react", 7),
                        new Skill("c++", 7), new Skill("ruby", 8),
                        new Skill("python", 4), new Skill("javascript", 8) }));
        personTreeSet.add(new People("Rockie", Gender.MALE,
                new Skill[]{new Skill("java", 5), new Skill("python", 4),
                        new Skill("c++", 7), new Skill("ruby", 8)}));
        personTreeSet.add(new People("Henry", Gender.MALE,
                new Skill[]{new Skill("sql", 5),new Skill("java", 7),
                        new Skill("html", 6), new Skill("react", 7),
                        new Skill("c++", 7), new Skill("ruby", 8),
                        new Skill("python", 4), new Skill("javascript", 8),
                        new Skill("angular", 3)}));

        personTreeSet.add(new People("Frank", Gender.MALE,
                new Skill[]{new Skill("sql", 5),new Skill("java", 7),
                        new Skill("html", 6), new Skill("react", 7),
                        new Skill("c++", 7), new Skill("ruby", 8),
                        new Skill("python", 4) }));

        System.out.println("TreeSet посортований по зростанню за кількістю скілів:");
        for (People people : personTreeSet) {
            System.out.println(people.getName() + " - Кількість скілів: " + people.getSkills().size());
        }

        System.out.println("Task 5");
        ZooClub zooClub = new ZooClub();

        Person person1 = new Person("John", 30);
        Person person2 = new Person("Valeri", 25);
        Pet pet1 = new Pet("Rocket");
        Pet pet2 = new Pet("Shadow");

        zooClub.addMember(person1);
        zooClub.addPet(person1, pet1);
        zooClub.addPet(person1, pet2);

        zooClub.addMember(person2);
        zooClub.addPet(person2, pet2);

        System.out.println("Зооклуб до всіх видалень");
        zooClub.printClub();

        zooClub.removePet(person1, pet1);
        System.out.println("Після видалення тваринки від власника");
        zooClub.printClub();

        zooClub.removeMember(person2);
        System.out.println("Після видалення учасника клубу");
        zooClub.printClub();

        zooClub.removePetFromAllMembers(pet2);
        System.out.println("Після видалення тваринки з усіх власників:");
        zooClub.printClub();
    }

    private static void printUsers(List<User> users) {
        for(User user: users) {
            System.out.println(
                    "Name: " + user.getName() + " " +
                            "Age: " + user.getAge());
        }
    }
    private static void printPerson(HashSet<People> peoples){
        for (People people : peoples) {
            System.out.println(
                    "Ім'я: " + people.getName() + " " +
                    "Стать: " + people.getGender());
        }
    }
}