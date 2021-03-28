package pl.gda.wsb;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human human1 = new Human("Jan", "Nowak", "Java Developer");
        Human human2 = new Human("Jan", "Kowalski", "Automation Tester");
        Human human3 = new Human("Piotr", "Nowy", "Support man");

        Animal animal1 = new Animal("mouse", "Jerry", 0.9);
        Animal animal2 = new Animal("lion", "Mufasa", 123.6);

        Phone phone1 = new Phone("SAMSUNG", "S10", 9.1);
        Phone phone2 = new Phone("NOKIA", "5.1", 8.2);

        System.out.println(human1);
        System.out.println("Human: " + human1.firstName + " " + human1.lastName + " position: " + human1.position);

        if (animal1.weight > animal2.weight)
            System.out.println("Cięższy jest " + animal1.name + ". Jego waga: " + animal1.weight);
        else System.out.println("Cięższy jest " + animal2.name + ". Jego waga: " + animal2.weight);

        System.out.println("\n---------------------\n");

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(human1);
        humansList.add(human2);
        humansList.add(human3);

        for (Human human : humansList){
            System.out.println(human.lastName);
        }


    }
}
