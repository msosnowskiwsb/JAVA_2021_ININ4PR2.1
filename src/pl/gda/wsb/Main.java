package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human human1 = new Human("Jan", "Nowak", "Java Developer");
        Human human2 = new Human("Jan", "Kowalski", "Automation Tester");
        Human human3 = new Human("Piotr", "Nowy", "Support man");
        Human human4 = new Human("Piotr", "Nowy", "Support man");

        Animal animal1 = new Animal("mouse", "Jerry");
        Animal animal2 = new Animal("lion", "Mufasa");

        Phone phone1 = new Phone("SAMSUNG", "S10", 9.1);
        Phone phone2 = new Phone("NOKIA", "5.1", 8.2);

        Car car1 = new Car(Producer.SKODA, "OCTAVIA",2012,2.0,"black");

        System.out.println(human1);
        System.out.println("Human: " + human1.firstName + " " + human1.lastName + " position: " + human1.position);

        if (animal1.getWeight() > animal2.getWeight())
            System.out.println("Cięższy jest " + animal1.name + ". Jego waga: " + animal1.getWeight());
        else System.out.println("Cięższy jest " + animal2.name + ". Jego waga: " + animal2.getWeight());

        System.out.println("\n---------------------\n");

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(human1);
        humansList.add(human2);
        humansList.add(human3);

        for (Human human : humansList){
            System.out.println(human.lastName);
        }

        System.out.println("\n---------------------\n");

        animal2.feed();
        animal2.takeForAWalk();

        animal1.feed();
        animal1.feed();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.feed();

        System.out.println("\n---------------------\n");

        human1.pet = animal1;
        human1.car = car1;
        System.out.println(human1.firstName + " " + human1.lastName + " have:\ncar: " + human1.car.getProducer() + " " + human1.car.getModel() + "\npet: " + human1.pet.name + " (" + human1.pet.species + ")");

        System.out.println("\n---------------------\n");

        System.out.println("Wynik porównania: " + human3.equals(human4));

        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(phone1);
        System.out.println(car1);

        System.out.println("\n---------------------\n");

        human1.setSalary(12500.0);

        System.out.println("Wypłata: " + human1.getSalary());

        human1.setSalary(-200.0);

        System.out.println("Wypłata: " + human1.getSalary());


    }
}
