package nomatic.rayala30.MatchMaker.model.athlete;

public class Athlete {
    // instance variables
    private String name;
    private int age;
    private String gender;


    // constructor
    public Athlete(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    // getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    // setters



}
