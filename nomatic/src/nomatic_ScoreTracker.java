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

        // create global error messages
        String errorMessage = "Invalid input. Please try again.";
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
        System.out.println("Select point type: ");
        System.out.println("(s)weep | (t)akedown | (k)nee on belly");
        System.out.println("(g)uard pass | (m)ount | (b)ack control");
        String pointInput = input.nextLine();

        int points = 0;

        int penalty = 0;

        if (pointInput.equals("s")) {
            points += pointTypes.get("sweep");
            System.out.println("2 points for sweep.");
        }
        else if (pointInput.equals("t")) {
            points += pointTypes.get("takedown");
            System.out.println("2 points for takedown.");
        }
        else if (pointInput.equals("k")) {
            points += pointTypes.get("knee on belly");
            System.out.println("2 points for knee on belly.");
        }
        else if (pointInput.equals("g")) {
            points += pointTypes.get("guard pass");
            System.out.println("3 points for guard pass.");
        }
        else if (pointInput.equals("m")) {
            points += pointTypes.get("mount");
            System.out.println("4 points for mount.");
        }
        else if (pointInput.equals("b")) {
            points += pointTypes.get("back control");
            System.out.println("4 points for back control.");
        }
        else {
            System.out.println(errorMessage);
        }
        return points;
    }

    public static int advantageCalculator (String competitor) {
        // create global error messages
        String errorMessage = "Invalid input. Please try again.";
        // create pointType map. pointTypes can be in an unordered data structure
        Map<String, Integer> pointTypes = new HashMap<>();
        // add values
        pointTypes.put("advantage", 1);

        // System.out.println(pointTypes);

        // allow for point deduction correction
        Scanner input = new Scanner(System.in);
        System.out.println("Select for (a)dvantage.");
        String advInput = input.nextLine();

        int advantage = 0;
        if (advInput.equals("a")) {
            advantage += pointTypes.get("advantage");
            System.out.println("+1 advantage.");
        }

        return advantage;
    }

    public static int penaltyCalculator (String competitor) {
        // create global error messages
        String errorMessage = "Invalid input. Please try again.";
        // create pointType map. pointTypes can be in an unordered data structure
        Map<String, Integer> pointTypes = new HashMap<>();
        // add values

        pointTypes.put("penalty", 1);

        // System.out.println(pointTypes);

        // allow for point deduction correction
        Scanner input = new Scanner(System.in);
        System.out.println("Select for (p)enalty.");
        String penInput = input.nextLine();

        int penalty = 0;

        if (penInput.equals("p")) {
            penalty += pointTypes.get("penalty");
            System.out.println("+1 penalty");
        }
        return penalty;
    }



    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);

        // use pointsCalculator method for each competitor
        // use penaltyCalculator method for each competitor
        // use advantageCalculator method for each competitor

        // Submission = Win
        // DQ = Loss


        // test method call
        // System.out.println(pointsCalculator("Competitor 1"));
    }

}
