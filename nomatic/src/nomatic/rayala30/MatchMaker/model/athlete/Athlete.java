package nomatic.rayala30.MatchMaker.model.athlete;

public class Athlete extends Biographic {


    // instance variables
    // every BJJ Athlete "has a" belt and "has a" weight
    private Belt belt;
    private Weight weight;


    // constructors
    public Athlete(String name, int age, String gender, Belt belt, Weight weight) {
        super(name, age, gender);
        this.belt = belt;
        this.weight = weight;
    }

    public Athlete(String name) {
        super(name);
    }

    // getters


    public Belt getBelt() {
        return belt;
    }

    public Weight getWeight() {
        return weight;
    }

    // method

    public String displayAthleteInformation() {
        return "Athlete Information -  " + System.lineSeparator() +
                "Name: " + getName() + System.lineSeparator() +
                "Age: " + getAge() + System.lineSeparator() +
                "Gender: " + getGender() + System.lineSeparator() +
                "Belt: " + belt + System.lineSeparator();
                }

    }




