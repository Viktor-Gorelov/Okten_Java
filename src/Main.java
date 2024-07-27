import task_3.Car;
import task_3.Owner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
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
        System.out.println(words);
        
        List<String> sortedWords = words.stream()
                                    .sorted()
                                    .collect(Collectors.toList());
        
        System.out.println("Список після сортування по алфавіту");
        System.out.println(sortedWords);
        System.out.println("Список відфільтрований по словам довжиною менше 4 символів");
        
        List<String> filteredWords = sortedWords.stream()
                                            .filter(word -> word.length() >= 4)
                                            .collect(Collectors.toList());

        System.out.println(filteredWords);
        System.out.println("Task 2");
        int[] numbers = {1,4,5,6,8,10,11,13,3,2,7,9,12,14,15,16,18,17,19,20};
        System.out.println("Масив чисел:");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Відсортований масив:");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Числа кратні 3:");
        int[] multiplesOf3 = Arrays.stream(numbers)
                .filter(num -> num % 3 == 0)
                .toArray();
        System.out.println(Arrays.toString(multiplesOf3));
        System.out.println("Числа кратні 10:");
        int[] multiplesOf10 = Arrays.stream(numbers)
                .filter(num -> num % 10 == 0)
                .toArray();
        System.out.println(Arrays.toString(multiplesOf10));
        System.out.println("Проітерований масив:");
        Arrays.stream(numbers)
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
        int[] tripledValues = Arrays.stream(numbers)
                .map(num -> num * 3)
                .toArray();
        System.out.println("Масив зі значеннями, збільшеними у 3 рази:");
        Arrays.stream(tripledValues)
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println("Task 3");
        List<Car> cars = new ArrayList<>();
        List<Owner> owners = new ArrayList<>();
        Owner owner1 = new Owner("John Doe", 30, 10);
        owners.add(owner1);
        Owner owner2 = new Owner("Jane Smith", 28, 6);
        owners.add(owner2);
        Owner owner3 = new Owner("Mike Johnson", 40, 15);
        owners.add(owner3);
        Owner owner4 = new Owner("Abra Corney",28,5);
        owners.add(owner4);
        Owner owner5 = new Owner("Linet Hearth",50,30);
        owners.add(owner5);
        Owner owner6 = new Owner("Mike Wooden",45,20);
        owners.add(owner6);
        Owner owner7 = new Owner("Kine Arrows",39,3);
        owners.add(owner7);

        cars.add(new Car("Toyota", 150, owner1, 20000, 2018));
        cars.add(new Car("BMW", 250, owner2, 40000, 2020));
        cars.add(new Car("Honda", 120, owner3, 15000, 2015));
        cars.add(new Car("Ferrari", 120, owner4, 45000, 2013));
        cars.add(new Car("Hearth", 150, owner5, 20000, 2016));
        cars.add(new Car("Acura", 180, owner6, 50000, 2019));
        cars.add(new Car("Alfa Romeo", 160, owner7, 35000, 2017));
        cars.add(new Car("Aston Martin", 120, owner1, 25000, 2016));
        cars.add(new Car("Audi", 140, owner2, 20000, 2015));
        cars.add(new Car("Bentley", 130, owner3, 31000, 2014));
        cars.add(new Car("Buick", 160, owner4, 32000, 2019));
        cars.add(new Car("Cadillac", 100, owner5, 37000, 2020));
        cars.add(new Car("Chevrolet", 110, owner6, 46000, 2021));
        cars.add(new Car("Citroen", 125, owner7, 47000, 2010));
        cars.add(new Car("Chrysler", 145, owner1, 40000, 2012));
        cars.add(new Car("Dacia", 130, owner2, 24000, 2011));
        cars.add(new Car("Fiat", 145, owner3, 28000, 2010));
        cars.add(new Car("Ford", 155, owner4, 25000, 2017));
        cars.add(new Car("GMC", 165, owner5, 32000, 2016));
        cars.add(new Car("Jaguar", 180, owner6, 35000, 2015));
        System.out.println("Автопарк:");
        owners.forEach(System.out::println);
        System.out.println();
        cars.forEach(System.out::println);
        System.out.println();
        cars.stream()
                .limit(cars.size() / 2)
                .forEach(Car::increaseEnginePower);
        System.out.println("Автопарк після ремонту:");
        cars.forEach(System.out::println);
        cars.stream()
                .filter(car -> car.getOwner().getDrivingExperience() < 5 && car.getOwner().getAge() > 25)
                .forEach(car -> car.getOwner().increaseDrivingExperience());
        System.out.println();
        System.out.println("Автопарк після перевірки водіїв:");
        owners.forEach(System.out::println);
        double totalCost = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();
        System.out.println();
        System.out.println("Загальна сума для покупки всіх автомобілів: " + totalCost);
    }
}
