package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human human1 = new Human("Jan","Nowak","Java Developer");
        Human human2 = new Human("Jan","Kowalski","Automation Tester");

        Animal animal1 = new Animal("mouse","Jerry",0.9);
        Animal animal2 = new Animal("lion","Mufasa",123.6);

        Phone phone1 = new Phone("SAMSUNG","S10",9.1);
        Phone phone2 = new Phone("NOKIA","5.1",8.2);

        System.out.println(human1);
        System.out.println(human1.firstName);
    }
}
