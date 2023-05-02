import java.util.Map;
import java.util.Scanner;


public class nomatic_MatchTracker {

    public static void scoreTracker() {

    }
    public static void timeTracker(int matchLength) {
        // test timer function
        // test robot function
//        Timer timeInput = new Timer();
    }

    public static void matchSetUp(boolean matchStart) {

    }

    public Map<String, Integer> competitorDatabase(Map<String, Integer> competitorList) {
        return null;
    }

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create global error messages
        String errorMessage = "Invalid input. Please try again.";


        // FIRST COMPETITOR
        String competitorOne = "";
        boolean firstNameEntry = false;

        while (!firstNameEntry) {
            // enter first athlete name
            System.out.print("Please enter name of Athlete One (First Last): ");
            String athleteOneName = input.nextLine();

            if (!athleteOneName.isEmpty()) {
                competitorOne = athleteOneName;
                firstNameEntry = true;
            }
            else {
                System.out.println(errorMessage);
                firstNameEntry = false;
            }
        }

        // SECOND COMPETITOR
        String competitorTwo = "";
        boolean secondNameEntry = false;

        while (!secondNameEntry) {
            // enter second athlete name
            System.out.print("Please enter name of Athlete Two (First Last): ");
            String athleteTwoName = input.nextLine();

            if (!athleteTwoName.isEmpty()) {
                competitorTwo = athleteTwoName;
                secondNameEntry = true;
            }
            else {
                System.out.println(errorMessage);
                secondNameEntry = false;
            }
        }

        System.out.println("");

        // enter belt division
        System.out.println("Please select belt division");
        System.out.println("(1) White | (2) Blue | (3) Purple | (4) Brown | (5) Black");

        String beltDivision = "";
        boolean beltEntry = false;

        while (!beltEntry) {
            String beltInput = input.nextLine();

            if (beltInput.equals("1")) {
                beltDivision = "White Belt";
                beltEntry = true;
            } else if (beltInput.equals("2")) {
                beltDivision = "Blue Belt";
                beltEntry = true;
            } else if (beltInput.equals("3")) {
                beltDivision = "Purple Belt";
                beltEntry = true;
            } else if (beltInput.equals("4")) {
                beltDivision = "Brown Belt";
                beltEntry = true;
            } else if (beltInput.equals("5")) {
                beltDivision = "Black Belt";
                beltEntry = true;
            }
            else {
                System.out.println(errorMessage);
//                System.out.println("");
                beltEntry = false;
            }
        }

        System.out.println("");

        // enter gender division
        System.out.println("Please select gender division");
        System.out.print("(1) Male | (2) Female: ");

// while statement translates to "while userEntry is true", run this
        String genderDivision = "";
        boolean genderEntry = false;
        while (!genderEntry) {
            String genderInput = input.next();

            if (genderInput.equals("1")) {
                genderDivision = "Male";
                genderEntry = true;
            } else if (genderInput.equals("2")) {
                genderDivision = "Female";
                genderEntry = true;
            } else {
                System.out.println(errorMessage);
//                System.out.println("");
                genderEntry = false;
            }
        }

        System.out.println("");
        // enter age division
        System.out.println("Please select age division");
        System.out.print("(1) Juvenile | (2) Adult | (3) Masters: ");

        String ageDivision = "";
        boolean ageEntry = false;
        while (!ageEntry) {

            String ageInput = input.next();

            if (ageInput.equals("1")) {
                ageDivision = "Juvenile";
                ageEntry = true;
            } else if (ageInput.equals("2")) {
                ageDivision = "Adult";
                ageEntry = true;
            } else if (ageInput.equals("3")) {
                ageDivision = "Masters";
                ageEntry = true;
            } else {
                System.out.println(errorMessage);
                System.out.println("");
                ageEntry = false;
            }
        }

        System.out.println("");
        // enter weight division
        System.out.println("Please select weight division");
        System.out.println("(1) Roosterweight | (2) Light Featherweight | (3) Featherweight");
        System.out.println("(4) Lightweight | (5) Middleweight | (6) Medium Heavyweight");
        System.out.println("(7) Heavyweight | (8) Super Heavyweight | (9) Ultra Heavyweight");

        String weightDivision = "";
        boolean weightEntry = false;
        while (!weightEntry) {
            String weightInput = input.next();

            if (weightInput.equals("1")) {
                weightDivision = "Roosterweight";
                weightEntry = true;
            } else if (weightInput.equals("2")) {
                weightDivision = "Light-Featherweight";
                weightEntry = true;
            } else if (weightInput.equals("3")) {
                weightDivision = "Featherweight";
                weightEntry = true;
            } else if (weightInput.equals("4")) {
                weightDivision = "Lightweight";
                weightEntry = true;
            } else if (weightInput.equals("5")) {
                weightDivision = "Middleweight";
                weightEntry = true;
            } else if (weightInput.equals("6")) {
                weightDivision = "Medium Heavyweight";
                weightEntry = true;
            } else if (weightInput.equals("7")) {
                weightDivision = "Heavyweight";
                weightEntry = true;
            } else if (weightInput.equals("8")) {
                weightDivision = "Super Heavyweight";
                weightEntry = true;
            } else if (weightInput.equals("9")) {
                weightDivision = "Ultra Heavyweight";
                weightEntry = true;
            } else {
                System.out.println(errorMessage);
//                System.out.println("");
                weightEntry = false;
            }
        }

        System.out.println("");

        // match set with names, gender, age, and weight
        System.out.println("Thank you. Now setting up match.");
        System.out.println("");
        System.out.println("Match set for the " + genderDivision + " " + ageDivision + " " + beltDivision + " division at " + weightDivision + ".");
        System.out.println("");
        System.out.println(competitorOne + " VS " + competitorTwo);




        // create boolean and while state to run code if match still going
//        boolean matchFinished = false;
//        while (!matchFinished) {
//
//            }

        // create match report with score and winner.

        // enter match result into results database - <result, method> ex: Win via Points

        // enter competitor result into competitor database

        }


}
