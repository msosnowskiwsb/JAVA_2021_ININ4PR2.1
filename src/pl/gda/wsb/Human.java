package pl.gda.wsb;

public class Human {
    String firstName;
    String lastName;
    String position;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Human: " +
                firstName +
                ' ' + lastName +
                ", position: " + position;
    }
}
