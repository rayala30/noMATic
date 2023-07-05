package nomatic.rayala30.MatchMaker.model;

import nomatic.rayala30.MatchMaker.model.athlete.Athlete;
import nomatic.rayala30.MatchMaker.model.athlete.Belt;
import nomatic.rayala30.MatchMaker.model.athlete.Weight;

public class Match {

    // Instance variables
    private Athlete athleteOne;
    private Athlete athleteTwo;

    private Belt matchBelt;
    private int matchLength;
    private Weight matchWeight;
    private String matchAge;
    private String matchGender;


    // Constructors

    public Match() {

    }

    public Match(Athlete athleteOne, Athlete athleteTwo, Belt matchBelt, Weight matchWeight, String matchAge, String matchGender, int matchLength) {
        this.athleteOne = athleteOne;
        this.athleteTwo = athleteTwo;
        this.matchBelt = matchBelt;
        this.matchLength = matchLength;
        this.matchWeight = matchWeight;
        this.matchAge = matchAge;
        this.matchGender = matchGender;
    }

    // Getters

    public Athlete getAthleteOne() {
        return athleteOne;
    }

    public Athlete getAthleteTwo() {
        return athleteTwo;
    }

    public int getMatchLength() {
        return matchLength;
    }

    public Weight getMatchWeight() {
        return matchWeight;
    }

    public String getMatchAge() {
        return matchAge;
    }

    public String getMatchGender() {
        return matchGender;
    }

    public Belt getMatchBelt() {
        return matchBelt;
    }


    // Setters

    public void setMatchLength(int matchLength) {
        this.matchLength = matchLength;
    }

    public void setMatchWeight(Weight matchWeight) {
        this.matchWeight = matchWeight;
    }

    public void setMatchAge(String matchAge) {
        this.matchAge = matchAge;
    }

    public void setMatchGender(String matchGender) {
        this.matchGender = matchGender;
    }


    // Methods

}
