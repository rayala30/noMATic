import java.awt.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class nomatic_ScoreTracker {

    // maybe use an input of parameter for String point type?

    public void pointsCalculator() {
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

        Scanner input = new Scanner(System.in);
        // System.out.println(pointTypes);
        // allow for point deduction correction

        System.out.println("Choose action: ");
        System.out.println("(1) Points | (2) Penalty | (3) Advantage");
        System.out.println("(S)ubmission | (D)isqualification");
        String actionInput = input.nextLine();

        System.out.println("");

        int points = 0;
        int penalty = 0;
        int advantage = 0;

        if (actionInput.equals("1")) {
            System.out.println("Select point type: ");
            System.out.println("(S)weep | (T)akedown | (K)nee on Belly");
            System.out.println("(G)uard Pass | (M)ount | (B)ack Control");
            String pointInput = input.nextLine();

            if (pointInput.equals("s") || pointInput.equals("S")) {
                points += pointTypes.get("sweep");
                System.out.println("2 points for Sweep.");
            }
            else if (pointInput.equals("t") || pointInput.equals("T")) {
                points += pointTypes.get("takedown");
                System.out.println("2 points for Takedown.");
            }
            else if (pointInput.equals("k") || pointInput.equals("K")) {
                points += pointTypes.get("knee on belly");
                System.out.println("2 points for Knee on Belly.");
            }
            else if (pointInput.equals("g") || pointInput.equals("G")) {
                points += pointTypes.get("guard pass");
                System.out.println("3 points for Guard Pass.");
            }
            else if (pointInput.equals("m") || pointInput.equals("M")) {
                points += pointTypes.get("mount");
                System.out.println("4 points for Mount.");
            }
            else if (pointInput.equals("b") || pointInput.equals("B")) {
                points += pointTypes.get("back control");
                System.out.println("4 points for Back Control.");
            }
            else if (pointInput.isEmpty()) {
                System.out.println(errorMessage);
            }
            else {
                System.out.println(errorMessage);
            }
        }

        if (actionInput.equals("2")) {
            penalty += pointTypes.get("penalty");
            System.out.println("+1 Penalty.");
        }

        if (actionInput.equals("3")) {
            advantage += pointTypes.get("advantage");
            System.out.println("+1 Advantage.");
        }

        if (actionInput.equals("s") || actionInput.equals("S")) {
            System.out.println("Win by submission.");
        }

        if (actionInput.equals("d") || actionInput.equals("D")) {
            System.out.println("Loss by disqualification.");
        }

        System.out.println("Points: " + points);
        System.out.println("Advantages: " + advantage);
        System.out.println("Penalties: " + penalty);
        System.out.println("");
    }


    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);

        // call pointsCalculator method for each competitor

        // Submission = Win
        // DQ = Loss


        // test method call
        // System.out.println(pointsCalculator("Competitor 1"));
    }

}
