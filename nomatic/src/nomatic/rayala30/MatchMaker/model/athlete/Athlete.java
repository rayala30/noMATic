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
    @Override
    public String toString() {
        return "Athlete {" +
                "belt=" + belt +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                '}';
    }
}
