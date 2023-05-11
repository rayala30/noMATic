import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class nomatic_MatchTracker {

    public Map<String, Integer> competitorDatabase(Map<String, Integer> competitorList) {
        return null;
    }
    // have own OBJECT for competitor database? what information am i looking to gather? each individual column can be
    // represented

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create global error messages
        String errorMessage = "Invalid input. Please try again.";

        // NOMATIC MATCHMAKER WELCOME MESSAGE
        System.out.println("Welcome to the no-MAT-ic Mat(ch)Maker!");
        System.out.println("");

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
                missingFirstNameEntry = true;
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
                missingSecondNameEntry = true;
            }
            else {
                competitorTwo = athleteTwoName;
                missingSecondNameEntry = false;
            }
        }

        System.out.println("");


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
                missingBeltEntry = true;
            }
            else {
                System.out.println(errorMessage);
                missingBeltEntry = true;
            }
        }

        System.out.println("");

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
                missingGenderEntry = true;
            }
            else {
                System.out.println(errorMessage);
                missingGenderEntry = true;
            }
        }

        System.out.println("");

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
                System.out.println("");
                missingAgeEntry = true;
            }
            else {
                System.out.println(errorMessage);
                System.out.println("");
                missingAgeEntry = true;
            }
        }

        System.out.println("");

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
//                System.out.println("");
                missingWeightEntry = true;
            }
            else {
                System.out.println(errorMessage);
//                System.out.println("");
                missingWeightEntry = true;
            }
        }

        System.out.println("");

        String timeEntry = "";
        int matchLength = 0; //milliseconds

        boolean missingTimeEntry = true;

        while(missingTimeEntry) {
            // select match time limit in minutes. enter time variable as milliseconds
            System.out.println("Select match length:");
            System.out.println("(A) 5:00 | (B) 6:00 | (C) 7:00 | (D) 8:00 | (E) 10:00");
            String timeInput = input.nextLine();

            if (timeInput.isEmpty()) {
                missingTimeEntry = true;
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
                missingTimeEntry = true;
            }
        }

        System.out.println("");

        // match set with names, gender, age, and weight
        System.out.println("Thank you. Now setting up match.");
        System.out.println("");
        System.out.println("Match set for the " + genderDivision + " " + ageDivision + " " + beltDivision + " division at " + weightDivision
                + " for " + timeEntry + ".");
        System.out.println("");
        System.out.println(competitorOne + " VS " + competitorTwo);
        System.out.println("");

        System.out.println("Match START.");
        System.out.println("");

        // import scoreTracker object into Match Tracker
        nomatic_ScoreTracker scoreTracker = new nomatic_ScoreTracker();

        // create boolean and while state to run code if match still going
        boolean matchOngoing = true;
        // match will be ongoing until time runs out
        // create a timer class that is set to true when counting down starts
        // while match is ongoing, run the code below
        while (matchOngoing) {
            // create input line where points can be awarded based on user input



            // calls method within nomatic_ScoreTracker class
            scoreTracker.pointsCalculator();
//
//            int competitorTwoScore = scoreTracker.pointsCalculator(competitorTwo);

//            System.out.println(competitorOneScore);
//            System.out.println(competitorTwoScore);
        }




        // create match report with score and winner.

        // enter match result into results database - <result, method> ex: Win via Points

        // enter competitor result into competitor database

        }


}
