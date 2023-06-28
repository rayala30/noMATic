package nomatic.rayala30.MatchMaker.model;

import nomatic.rayala30.MatchMaker.model.athlete.Athlete;

public class Match {

    // Instance variables
    private Athlete athleteOne;
    private Athlete athleteTwo;
    private int matchLength;
    private String matchWeight;
    private String matchAge;
    private String matchGender;


    // Constructors

    public Match() {

    }

    public Match(Athlete athleteOne, Athlete athleteTwo, int matchLength, String matchWeight, String matchAge, String matchGender) {
        this.athleteOne = athleteOne;
        this.athleteTwo = athleteTwo;
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

    public String getMatchWeight() {
        return matchWeight;
    }

    public String getMatchAge() {
        return matchAge;
    }

    public String getMatchGender() {
        return matchGender;
    }


    // Setters

    public void setMatchLength(int matchLength) {
        this.matchLength = matchLength;
    }

    public void setMatchWeight(String matchWeight) {
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
