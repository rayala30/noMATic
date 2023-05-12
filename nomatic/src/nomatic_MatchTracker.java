import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class nomatic_MatchTracker {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        // create global error messages
        String errorMessage = "Invalid input. Please try again.";

        // NOMATIC MATCHMAKER WELCOME MESSAGE
        System.out.println("Welcome to the no-MAT-ic Mat(ch)Maker!");
        System.out.println();

        // FIRST COMPETITOR
        String competitorOne = "";
        boolean missingFirstNameEntry = true;
        // while missingFirstNameEntry is TRUE, run below code
        while (missingFirstNameEntry) {
            // enter first athlete name
            System.out.print("Please enter name of Athlete One (First Last): ");
            String athleteOneName = input.nextLine();

            if (athleteOneName.isEmpty()) {
                System.out.println(errorMessage);
            }
            else {
                competitorOne = athleteOneName;
                missingFirstNameEntry = false;
            }
        }

        // SECOND COMPETITOR
        String competitorTwo = "";
        boolean missingSecondNameEntry = true;

        while (missingSecondNameEntry) {
            // enter second athlete name
            System.out.print("Please enter name of Athlete Two (First Last): ");
            String athleteTwoName = input.nextLine();

            if (athleteTwoName.isEmpty()) {
                System.out.println(errorMessage);
            }
            else {
                competitorTwo = athleteTwoName;
                missingSecondNameEntry = false;
            }
        }

        System.out.println();

        String beltDivision = "";
        boolean missingBeltEntry = true;

        while (missingBeltEntry) {
            // enter belt division
            System.out.println("Please select belt division");
            System.out.println("(1) White | (2) Blue | (3) Purple | (4) Brown | (5) Black");
            String beltInput = input.nextLine();

            if (beltInput.equals("1")) {
                beltDivision = "White Belt";
                missingBeltEntry = false;
            } else if (beltInput.equals("2")) {
                beltDivision = "Blue Belt";
                missingBeltEntry = false;
            } else if (beltInput.equals("3")) {
                beltDivision = "Purple Belt";
                missingBeltEntry = false;
            } else if (beltInput.equals("4")) {
                beltDivision = "Brown Belt";
                missingBeltEntry = false;
            } else if (beltInput.equals("5")) {
                beltDivision = "Black Belt";
                missingBeltEntry = false;
            } else if (beltInput.isEmpty()) {
                System.out.println(errorMessage);
            }
            else {
                System.out.println(errorMessage);
            }
        }

        System.out.println();

        String genderDivision = "";
        boolean missingGenderEntry = true;

        while (missingGenderEntry) {
            // enter gender division
            System.out.println("Please select gender division");
            System.out.print("(1) Male | (2) Female: ");
            String genderInput = input.nextLine();

            if (genderInput.equals("1")) {
                genderDivision = "Male";
                missingGenderEntry = false;
            } else if (genderInput.equals("2")) {
                genderDivision = "Female";
                missingGenderEntry = false;
            } else if (genderInput.isEmpty()) {
                System.out.println(errorMessage);
            }
            else {
                System.out.println(errorMessage);
            }
        }

        System.out.println();

        String ageDivision = "";
        boolean missingAgeEntry = true;
        while (missingAgeEntry) {
            // enter age division
            System.out.println("Please select age division");
            System.out.print("(1) Juvenile | (2) Adult | (3) Masters: ");
            String ageInput = input.nextLine();

            if (ageInput.equals("1")) {
                ageDivision = "Juvenile";
                missingAgeEntry = false;
            } else if (ageInput.equals("2")) {
                ageDivision = "Adult";
                missingAgeEntry = false;
            } else if (ageInput.equals("3")) {
                ageDivision = "Masters";
                missingAgeEntry = false;
            } else if (ageInput.isEmpty()) {
                System.out.println(errorMessage);
                System.out.println();
            }
            else {
                System.out.println(errorMessage);
                System.out.println();
            }
        }

        System.out.println();

        String weightDivision = "";

        boolean missingWeightEntry = true;
        while (missingWeightEntry) {
            // enter weight division
            System.out.println("Please select weight division");
            System.out.println("(1) Roosterweight | (2) Light Featherweight | (3) Featherweight");
            System.out.println("(4) Lightweight | (5) Middleweight | (6) Medium Heavyweight");
            System.out.println("(7) Heavyweight | (8) Super Heavyweight | (9) Ultra Heavyweight");
            String weightInput = input.nextLine();

            if (weightInput.equals("1")) {
                weightDivision = "Roosterweight";
                missingWeightEntry = false;
            } else if (weightInput.equals("2")) {
                weightDivision = "Light-Featherweight";
                missingWeightEntry = false;
            } else if (weightInput.equals("3")) {
                weightDivision = "Featherweight";
                missingWeightEntry = false;
            } else if (weightInput.equals("4")) {
                weightDivision = "Lightweight";
                missingWeightEntry = false;
            } else if (weightInput.equals("5")) {
                weightDivision = "Middleweight";
                missingWeightEntry = false;
            } else if (weightInput.equals("6")) {
                weightDivision = "Medium Heavyweight";
                missingWeightEntry = false;
            } else if (weightInput.equals("7")) {
                weightDivision = "Heavyweight";
                missingWeightEntry = false;
            } else if (weightInput.equals("8")) {
                weightDivision = "Super Heavyweight";
                missingWeightEntry = false;
            } else if (weightInput.equals("9")) {
                weightDivision = "Ultra Heavyweight";
                missingWeightEntry = false;
            } else if (weightInput.isEmpty()){
                System.out.println(errorMessage);
            }
            else {
                System.out.println(errorMessage);
            }
        }

        System.out.println();

        String timeEntry = "";
        int matchLength = 0; //milliseconds

        boolean missingTimeEntry = true;
        while(missingTimeEntry) {
            // select match time limit in minutes. enter time variable as milliseconds
            System.out.println("Select match length:");
            System.out.println("(A) 5:00 | (B) 6:00 | (C) 7:00 | (D) 8:00 | (E) 10:00");
            String timeInput = input.nextLine();

            if (timeInput.isEmpty()) {
                System.out.println(errorMessage);
            }
            else if (timeInput.equals("A") || timeInput.equals("a")) {
                timeEntry = "5:00";
                matchLength = 300000;
                missingTimeEntry = false;
            }
            else if (timeInput.equals("B") || timeInput.equals("b")) {
                timeEntry = "6:00";
                matchLength = 360000;
                missingTimeEntry = false;
            }
            else if (timeInput.equals("C") || timeInput.equals("c")) {
                timeEntry = "7:00";
                matchLength = 420000;
                missingTimeEntry = false;
            }
            else if (timeInput.equals("D") || timeInput.equals("d")) {
                timeEntry = "8:00";
                matchLength = 480000;
                missingTimeEntry = false;
            }
            else if (timeInput.equals("E") || timeInput.equals("e")) {
                timeEntry = "10:00";
                matchLength = 600000;
                missingTimeEntry = false;
            }
            else {
                System.out.println(errorMessage);
            }
        }

        System.out.println();

        // match set with names, gender, age, and weight
        System.out.println("Thank you. Now setting up match.");
        System.out.println();
        System.out.println("Match set for the " + genderDivision + " " + ageDivision + " " + beltDivision + " division at " + weightDivision
                + " for " + timeEntry + ".");
        System.out.println();
        System.out.println(competitorOne + " VS " + competitorTwo);
        System.out.println();

        System.out.println("Match START.");
        System.out.println();

        // create boolean and while state to run code if match still going
        boolean matchOngoing = true;
        // match will be ongoing until time runs out
        // create a timer class that is set to true when counting down starts


        // while match is ongoing, run the code below
        while (matchOngoing) {
            // call action menu that displays throughout the match duration
            promptForAction("");


            }

        }





    private static void promptForAction(String action) {
        System.out.println("Choose action: ");
        System.out.println("(1) Points | (2) Penalty | (3) Advantage");
        System.out.println("(S)ubmission | (D)isqualification");

        String actionInput = input.nextLine();
        action = actionInput;

    }

    // create points calculator method
    private static int pointsCalculator(String pointSelection) {
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

        System.out.println();

        System.out.println("Select point type: ");
        System.out.println("(S)weep | (T)akedown | (K)nee on Belly");
        System.out.println("(G)uard Pass | (M)ount | (B)ack Control");

        int points = 0;

        if (pointSelection.equals("s") || pointSelection.equals("S")) {
            points += pointTypes.get("sweep");
            System.out.println("2 points for Sweep.");
        }
        else if (pointSelection.equals("t") || pointSelection.equals("T")) {
            points += pointTypes.get("takedown");
            System.out.println("2 points for Takedown.");
        }
        else if (pointSelection.equals("k") || pointSelection.equals("K")) {
            points += pointTypes.get("knee on belly");
            System.out.println("2 points for Knee on Belly.");
        }
        else if (pointSelection.equals("g") || pointSelection.equals("G")) {
            points += pointTypes.get("guard pass");
            System.out.println("3 points for Guard Pass.");
        }
        else if (pointSelection.equals("m") || pointSelection.equals("M")) {
            points += pointTypes.get("mount");
            System.out.println("4 points for Mount.");
        }
        else if (pointSelection.equals("b") || pointSelection.equals("B")) {
            points += pointTypes.get("back control");
            System.out.println("4 points for Back Control.");
        }
        else if (pointSelection.isEmpty()) {
            System.out.println(errorMessage);
        }
        else {
            System.out.println(errorMessage);
        }
       return points;
    }

    public static int penaltyCalculator() {
        // create global error messages
        String errorMessage = "Invalid input. Please try again.";

        Scanner input = new Scanner(System.in);
        // System.out.println(pointTypes);
        // allow for point deduction correction
        String actionInput = input.nextLine();

        System.out.println();
        int penalty = 0;

        if (actionInput.equals("2")) {
            penalty ++;
            System.out.println("+1 Penalty.");
        }
        return penalty;
    }


    public static int advantageCalculator() {
        // create global error messages
        String errorMessage = "Invalid input. Please try again.";

        Scanner input = new Scanner(System.in);
        // System.out.println(pointTypes);
        // allow for point deduction correction
        String actionInput = input.nextLine();

        System.out.println();
        int advantage = 0;

        if (actionInput.equals("3")) {
            advantage ++;
            System.out.println("+1 Advantage.");
        }
        return advantage;
    }



    public static void promptForSubmission() {
        System.out.println("Win by submission.");
    }

    public static void promptForDisqualification() {
        System.out.println("Loss by disqualification.");
    }


    private static void Timer() {

    }


    private static void matchResults() {
        // create match report with score and winner.

        // enter match result into results database - <result, method> ex: Win via Points

        // enter competitor result into competitor database
    }






}




