package test;

import nomatic.rayala30.MatchMaker.model.athlete.Athlete;
import nomatic.rayala30.MatchMaker.model.athlete.Belt;
import nomatic.rayala30.MatchMaker.model.athlete.Weight;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class AthleteTest {

    @org.junit.jupiter.api.Test
    void getNameReturnsAthleteName() {
        // Arrange
        Athlete testAthleteOne = new Athlete("Test Athlete", 18, "Male", Belt.Blue, Weight.Middleweight);
        Athlete testAthleteTwo = new Athlete("Athlete Two");
        Athlete testAthleteThree = new Athlete("");

        // Act
        String athleteOneName = testAthleteOne.getName();
        String athleteTwoName = testAthleteTwo.getName();
        String athleteThreeName = testAthleteThree.getName();

        // Assert
        Assert.assertEquals("String name not returned", "Test Athlete", athleteOneName);
        Assert.assertEquals("String name not returned", "Athlete Two", athleteTwoName);
        Assert.assertEquals("String name not returned", "", athleteThreeName);
    }

    @org.junit.jupiter.api.Test
    void getBeltReturnsBeltObject() {
        // Arrange
        Athlete testAthleteOne = new Athlete("Test Athlete 1", 18, "Male", Belt.Blue, Weight.Middleweight);
        Athlete testAthleteTwo = new Athlete("Test Athlete 2", 18, "Male", Belt.Black, Weight.Heavyweight);

        // Act
        Belt athleteOneBelt = testAthleteOne.getBelt();
        Belt athleteTwoBelt = testAthleteTwo.getBelt();

        // Assert
        Assert.assertEquals("Belt.Blue object not returned", Belt.Blue, athleteOneBelt);
        Assert.assertEquals("Belt.Black object not returned", Belt.Black, athleteTwoBelt);

    }

    @org.junit.jupiter.api.Test
    void nullBeltReturnsNullBeltObject() throws NullPointerException {
        // Arrange
        Athlete testAthleteOne = new Athlete("Test Athlete 1", 18, "Male", null, Weight.Middleweight);

        // Act
        Belt athleteOneBelt = testAthleteOne.getBelt();

        // Assert
        // There is nothing to assert since it will throw NullPointerException if Belt is null
    }

    @org.junit.jupiter.api.Test
    void getWeightReturnsWeightObject() {
        // Arrange
        Athlete testAthleteOne = new Athlete("Test Athlete 1", 18, "Male", Belt.Blue, Weight.Middleweight);
        Athlete testAthleteTwo = new Athlete("Test Athlete 2", 25, "Male", Belt.White, Weight.Featherweight);

        // Act
        Weight athleteOneWeight = testAthleteOne.getWeight();
        Weight athleteTwoWeight = testAthleteTwo.getWeight();

        // Assert
        Assert.assertEquals("Weight.Middleweight not returned", Weight.Middleweight, athleteOneWeight);
        Assert.assertEquals("Weight.Featherweight not returned", Weight.Featherweight, athleteTwoWeight);
    }

    @org.junit.jupiter.api.Test
    void nullWeightReturnsNullWeightObject() throws NullPointerException {
        // Arrange
        Athlete testAthleteOne = new Athlete("Test Athlete 1", 18, "Male", Belt.Blue, null);

        // Act
        Weight athleteOneWeight = testAthleteOne.getWeight();

        // Assert
        // There is nothing to assert since it will throw NullPointerException if Weight is null
    }

    @org.junit.jupiter.api.Test
    void whenToStringIsUsedForGetBeltReturnsBeltString() {
        // Arrange
        Athlete testAthleteOne = new Athlete("Test Athlete 1", 18, "Male", Belt.Blue, Weight.Middleweight);
        Athlete testAthleteTwo = new Athlete("Test Athlete 1", 18, "Male", Belt.Brown, Weight.Middleweight);

        // Act
        String athleteOneBelt = testAthleteOne.getBelt().toString();
        String athleteTwoBelt = testAthleteTwo.getBelt().toString();

        // Assert
        Assert.assertEquals("String object not returned", "Blue", athleteOneBelt);
        Assert.assertEquals("String object not returned", "Brown", athleteTwoBelt);

    }

    @org.junit.jupiter.api.Test
    void whenToStringIsUsedForGetWeightReturnsBeltString() {
        // Arrange
        Athlete testAthleteOne = new Athlete("Test Athlete 1", 18, "Male", Belt.Blue, Weight.Middleweight);
        Athlete testAthleteTwo = new Athlete("Test Athlete 1", 18, "Male", Belt.Brown, Weight.Roosterweight);

        // Act
        String athleteOneWeight = testAthleteOne.getWeight().toString();
        String athleteTwoWeight = testAthleteTwo.getWeight().toString();

        // Assert
        Assert.assertEquals("String object not returned", "Middleweight", athleteOneWeight);
        Assert.assertEquals("String object not returned", "Roosterweight", athleteTwoWeight);

    }

}