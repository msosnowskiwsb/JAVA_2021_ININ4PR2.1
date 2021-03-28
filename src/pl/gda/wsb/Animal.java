package pl.gda.wsb;

public class Animal {
    final String species;
    String name;
    private Double weight;

    final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    final Double DEFAULT_LION_WEIGHT = 123.0;
    final Double DEFAULT_ANIMAL_WEIGHT = 15.0;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
        if (this.species.equals("mouse"))
            this.weight = DEFAULT_MOUSE_WEIGHT;
        else if (this.species.equals("lion"))
            this.weight = DEFAULT_LION_WEIGHT;
        else this.weight = DEFAULT_ANIMAL_WEIGHT;
    }

    public Double getWeight() {
        return weight;
    }

    void feed() {
        if (weight <= 0) {
            System.out.println(this.species + " -->To late :(");
        } else {
            weight++;
            System.out.println(this.species + " --> thx :) my weight is now " + this.weight);
        }
    }

    void takeForAWalk(){
        weight--;
        if (weight <= 0){
            System.out.println(this.species + " --> No! You can't go for a walk with a dead animal");
        } else if (weight <= 3){
            System.out.println(this.species + " --> Yeaaah :) but I am hungry...");
        } else {
            System.out.println(this.species + " --> Thx for a walk bro, my weight is now: " + this.weight);
        }
    }
}
