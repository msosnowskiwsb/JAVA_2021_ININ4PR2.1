package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Phone extends Device{
    Double screenSize;

    public Phone(Producer producer, String model, Integer yearOfProduction, Double screenSize) {
        super(producer,model,yearOfProduction);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Witaj Mateusz, twój telefon " + this.producer + " " + this.model + " jest gotowy do pracy :)");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
