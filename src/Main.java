import task_1.Address;
import task_1.Company;
import task_1.Geo;
import task_1.User;
import task_4.Car;
import task_4.Gender;
import task_4.Person;
import task_4.Skill;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Geo geo = new Geo("-37.3159", "81.1496");
        Address address = new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", geo);
        Company company = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");

        User user = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", address, "1-770-736-8031 x56442", "hildegard.org", company);

        System.out.println("User Id: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress().getStreet() + ", " + user.getAddress().getSuite() + ", " + user.getAddress().getCity() + ", " + user.getAddress().getZipcode());
        System.out.println("Geo Location: Lat " + user.getAddress().getGeo().getLat() + ", Lng " + user.getAddress().getGeo().getLng());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("Website: " + user.getWebsite());
        System.out.println("Company: " + user.getCompany().getName());
        System.out.println("Catch Phrase: " + user.getCompany().getCatchPhrase());
        System.out.println("Business: " + user.getCompany().getBs());


        System.out.println("Task 4");
        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java", 10));
        skills.add(new Skill("js", 10));
        skills.add(new Skill("c++", 10));

        Car car = new Car("toyota", 2021, 250);

        Person person = new Person(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills, car);

        System.out.println("Person details:");
        System.out.println("ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Skills:");
        for (Skill skill : person.getSkills()) {
            System.out.println("- Title: " + skill.getTitle() + ", Experience: " + skill.getExp() + " years");
        }
        System.out.println("Car:");
        System.out.println("- Model: " + person.getCar().getModel());
        System.out.println("- Year: " + person.getCar().getYear());
        System.out.println("- Power: " + person.getCar().getPower());
    }
}