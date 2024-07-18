package task_4;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Pet>> club;

    public ZooClub() {
        this.club = new HashMap<>();
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public void addMember(Person person) {
        if (!club.containsKey(person)) {
            club.put(person, new ArrayList<>());
        } else {
            System.out.println("This person already in zoo-club");
        }
    }

    public void addPet(Person person, Pet pet) {
        if (club.containsKey(person)) {
            List<Pet> pets = club.get(person);
            pets.add(pet);
        } else {
            System.out.println("This person not a member of zoo-club");
        }
    }

    public void removePet(Person person, Pet pet) {
        if (club.containsKey(person)) {
            List<Pet> pets = club.get(person);
            pets.remove(pet);
        } else {
            System.out.println("This person not a member of zoo-club");
        }
    }

    public void removeMember(Person person) {
        club.remove(person);
    }

    public void removePetFromAllMembers(Pet pet) {
        for (List<Pet> pets : club.values()) {
            pets.remove(pet);
        }
    }

    public void printClub() {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            System.out.println("Member: " + entry.getKey());
            List<Pet> pets = entry.getValue();
            if (pets.isEmpty()) {
                System.out.println("No pets");
            } else {
                System.out.print("Pets: " + pets.size() + " - ");
                for (int i = 0; i < pets.size(); i++) {
                    if (i > 0) {
                        System.out.print(", ");
                    }
                    System.out.print(pets.get(i));
                }
                System.out.println();
            }
        }
    }
}
