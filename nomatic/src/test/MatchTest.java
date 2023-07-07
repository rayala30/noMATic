package test;

import nomatic.rayala30.MatchMaker.model.Match;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchTest {

    @Test
    public void pointsCalculatorReturnsCorrectTotal() {
        // Arrange
        Match testMatch = new Match();
        String guardPass = "GUARD pass";
        String takedown = "TAKEDOWN";
        String mount = "MoUnT";
        String sweep = "sweep";

        // Act
        int totalOne = testMatch.pointsCalculator(guardPass) + testMatch.pointsCalculator(takedown);
        int totalTwo = testMatch.pointsCalculator(mount) + testMatch.pointsCalculator(sweep) + testMatch.pointsCalculator(guardPass);
        int totalThree = (testMatch.pointsCalculator(sweep) * 3) + (testMatch.pointsCalculator(takedown) * 5);

        // Assert
        Assert.assertEquals(5, totalOne);
        Assert.assertEquals(9, totalTwo);
        Assert.assertEquals(16, totalThree);
    }

}