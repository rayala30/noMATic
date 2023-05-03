import java.awt.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class nomatic_ScoreTracker {


    public static int pointsCalculator(String competitor) {
        // 2 points = sweep, takedown, knee on belly
        // 3 points = guard pass
        // 4 points = mount, back take

        // create pointType map. pointTypes can be in an unordered data structure
        Map<String, Integer> pointTypes = new HashMap<>();
        // add values
        pointTypes.put("sweep", 2);
        pointTypes.put("takedown", 2);
        pointTypes.put("knee on belly", 2);
        pointTypes.put("guard pass", 3);
        pointTypes.put("mount", 4);
        pointTypes.put("back control", 4);
        pointTypes.put("advantage", 1);
        pointTypes.put("penalty", 1);

        // System.out.println(pointTypes);

        // allow for point deduction correction

        Scanner input = new Scanner(System.in);


        return 0;
    }


    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
        // create global error messages
        String errorMessage = "Invalid input. Please try again.";


        // use pointsCalculator method for each competitor

        // submission = win
        // dq = loss


        // test method call
//        System.out.println(pointsCalculator("Competitor 1"));


    }

}
