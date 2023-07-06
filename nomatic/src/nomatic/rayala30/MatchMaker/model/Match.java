package nomatic.rayala30.MatchMaker.model;

import nomatic.rayala30.MatchMaker.model.athlete.Athlete;
import nomatic.rayala30.MatchMaker.model.athlete.Belt;
import nomatic.rayala30.MatchMaker.model.athlete.Weight;
import nomatic.rayala30.util.BasicXml;
import nomatic.rayala30.util.BasicXmlParser;
import nomatic.rayala30.util.BasicXmlBuilder;

import java.util.HashMap;
import java.util.Map;

public class Match implements BasicXml {

    // Instance variables
    private Athlete athleteOne;
    private Athlete athleteTwo;
    private String matchNumber;
    private String matchWinner;
    private String matchWinMethod;

    private Belt matchBelt;
    private int matchLength;
    private Weight matchWeight;
    private String matchAge;
    private String matchGender;
    private int athleteOnePoints;
    private int athleteTwoPoints;
    private int athleteOneAdv;
    private int athleteTwoAdv;
    private int athleteOnePenalty;
    private int athleteTwoPenalty;


    // Constructors

    public Match() {

    }

    // This constructor set is for initial Match setup
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

    public int getAthleteOnePoints() {
        return athleteOnePoints;
    }

    public int getAthleteTwoPoints() {
        return athleteTwoPoints;
    }

    public int getAthleteOneAdv() {
        return athleteOneAdv;
    }

    public int getAthleteTwoAdv() {
        return athleteTwoAdv;
    }

    public int getAthleteOnePenalty() {
        return athleteOnePenalty;
    }

    public int getAthleteTwoPenalty() {
        return athleteTwoPenalty;
    }

    public String getMatchNumber() {
        return matchNumber;
    }

    public String getMatchWinner() {
        return matchWinner;
    }

    public String getMatchWinMethod() {
        return matchWinMethod;
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

    public void setAthleteOnePoints(int athleteOnePoints) {
        this.athleteOnePoints = athleteOnePoints;
    }

    public void setAthleteTwoPoints(int athleteTwoPoints) {
        this.athleteTwoPoints = athleteTwoPoints;
    }

    public void setAthleteOneAdv(int athleteOneAdv) {
        this.athleteOneAdv = athleteOneAdv;
    }

    public void setAthleteTwoAdv(int athleteTwoAdv) {
        this.athleteTwoAdv = athleteTwoAdv;
    }

    public void setAthleteOnePenalty(int athleteOnePenalty) {
        this.athleteOnePenalty = athleteOnePenalty;
    }

    public void setAthleteTwoPenalty(int athleteTwoPenalty) {
        this.athleteTwoPenalty = athleteTwoPenalty;
    }

    public void setMatchNumber(String matchNumber) {
        this.matchNumber = matchNumber;
    }

    public void setMatchWinner(String matchWinner) {
        this.matchWinner = matchWinner;
    }

    public void setMatchWinMethod(String matchWinMethod) {
        this.matchWinMethod = matchWinMethod;
    }

    // Methods

    public static int pointsCalculator(String pointSelection) {
        int points = 0;
        // Create pointType map
        Map<String, Integer> pointTypes = new HashMap<>();
        // Add point values
        pointTypes.put("sweep", 2);
        pointTypes.put("takedown", 2);
        pointTypes.put("knee on belly", 2);
        pointTypes.put("guard pass", 3);
        pointTypes.put("mount", 4);
        pointTypes.put("back control", 4);

        if (pointSelection.equalsIgnoreCase("sweep")) {
            points = pointTypes.get("sweep");
        } else if (pointSelection.equalsIgnoreCase("takedown")) {
            points = pointTypes.get("takedown");
        } else if (pointSelection.equalsIgnoreCase("knee on belly")) {
            points = pointTypes.get("knee on belly");
        } else if (pointSelection.equalsIgnoreCase("guard pass")) {
            points = pointTypes.get("guard pass");
        } else if (pointSelection.equalsIgnoreCase("mount")) {
            points = pointTypes.get("mount");
        } else if (pointSelection.equalsIgnoreCase("back control")) {
            points = pointTypes.get("back control");
        }
        return points;
    }

    public String displayScore(Athlete athlete, int athletePoints, int athleteAdvantages, int athletePenalties) {
        return athlete.getName().toUpperCase() + System.lineSeparator()
                + "Points: " + athletePoints + System.lineSeparator()
                + "Advantages: " + athleteAdvantages + System.lineSeparator()
                + "Penalties: " + athletePenalties + System.lineSeparator();
    }

    // BasicXml Methods

    @Override
    public void initializeFromXml(String xml) {
        String athleteOneName = athleteOne.getName();
        String athleteTwoName = athleteTwo.getName();

        BasicXmlParser parser = new BasicXmlParser(xml);
        matchNumber = parser.getStringContent("matchNumber");
        matchWeight = Weight.valueOf(parser.getStringContent("matchWeight"));
        matchAge = parser.getStringContent("matchAge");
        matchBelt = Belt.valueOf(parser.getStringContent("matchBelt"));
        athleteOneName = parser.getStringContent("athleteOne");
        athleteTwoName = parser.getStringContent("athleteTwo");
        matchWinner = parser.getStringContent("matchWinner");
        matchWinMethod = parser.getStringContent("matchWinMethod");

    }


    @Override
    public String getInnerXml() {
        BasicXmlBuilder builder = new BasicXmlBuilder();
        builder.addElement("matchNumber", matchNumber);
        builder.addElement("matchWeight", matchWeight);
        builder.addElement("matchAge", matchAge);
        builder.addElement("matchBelt", matchBelt);
        builder.addElement("athleteOne", athleteOne);
        builder.addElement("athleteTwo", athleteTwo);
        builder.addElement("matchWinner", matchWinner);
        builder.addElement("matchWinMethod", matchWinMethod);

        return builder.build();
    }




}
