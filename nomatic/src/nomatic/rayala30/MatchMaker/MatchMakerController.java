package nomatic.rayala30.MatchMaker;

import nomatic.rayala30.MatchMaker.model.Match;
import nomatic.rayala30.MatchMaker.model.athlete.Athlete;
import nomatic.rayala30.MatchMaker.model.athlete.Belt;
import nomatic.rayala30.MatchMaker.model.athlete.Weight;
import nomatic.rayala30.util.BasicConsole;
import nomatic.rayala30.util.BasicFileStorage;

public class MatchMakerController {

    // Instance variables

    private final MatchMakerView view;
    private Match currentMatch;


    // Constructor
    public MatchMakerController(BasicConsole console, BasicFileStorage storage) {
        view = new MatchMakerView(console);
    }

    // Methods

    public void run() {
        displayStartingMenu();
    }


    private void createNewMatch(Athlete athleteOne, Athlete athleteTwo, Belt belt, Weight weight, String age, String gender, int time) {
        currentMatch = new Match(athleteOne, athleteTwo, belt, weight, age, gender, time);

        // TODO
        // Add a match number
    }

    private void displayStartingMenu() {
        final String WELCOME_MESSAGE = "Welcome to the no-MAT-ic Mat(ch)Maker";

        final String NEW = "Create a new match";
        final String LOAD = "View previous match results";
        final String EXIT = "Exit the program";     // use System.exit(0) for EXIT option?
        final String[] MENU_OPTIONS = {NEW, LOAD, EXIT};

        boolean finished = false;

        while(!finished) {
            String selection = view.getMenuSelection(WELCOME_MESSAGE, MENU_OPTIONS);

            if (selection.equals(NEW)) {
                displayMatchSetupMenu();
            } else if (selection.equals(LOAD)) {
                loadMatchResults();
                if (currentMatch != null) {
                    displayMatchSetupMenu();
                }
            }
            else {
                finished = true;
            }
        }

    }

    private void displayMatchSetupMenu() {
        // Prompt for Belt division
        Belt matchBelt = beltSetupMenu();

        // Prompt for Gender division
        String matchGender = genderSetupMenu();

        // Prompt for Age division
        String matchAge = ageSetupMenu();

        // Prompt for Weight division



        // TODO
        // createNewMatch();

        // Prompt to ask if information needs editing
        // Else use runMatch()
        // Else exit application

//        boolean finished = false;
//        while (!finished) {
//
//
//        }

    }

    private void runMatch() {

    }

    private void stopMatch() {

    }

    private void saveMatch() {

    }

    private Athlete athleteOneSetup() {
        return null;
    }

    private Athlete athleteTwoSetup() {
        return null;
    }

    private void displayWeightMenu() {


    }

    private Belt beltSetupMenu() {
        Belt beltDivision = null;
        view.promptToUpdateBelt();

        final String WHITE_BELT = Belt.WHITE.toString();
        final String BLUE_BELT = Belt.BLUE.toString();
        final String PURPLE_BELT = Belt.PURPLE.toString();
        final String BROWN_BELT = Belt.BROWN.toString();
        final String BLACK_BELT = Belt.BLACK.toString();

        final String[] WEIGHT_OPTIONS = {WHITE_BELT, BLUE_BELT, PURPLE_BELT, BROWN_BELT, BLACK_BELT};

        String selection = view.getMenuSelection("BELT DIVISIONS", WEIGHT_OPTIONS);

        if (selection.equals(WHITE_BELT)) {
            beltDivision = Belt.WHITE;
            view.printMessage("Belt division set to White.");
        }
        else if (selection.equals(BLUE_BELT)) {
            beltDivision = Belt.BLUE;
            view.printMessage("Belt division set to Blue.");
        }
        else if (selection.equals(PURPLE_BELT)) {
            beltDivision = Belt.PURPLE;
            view.printMessage("Belt division set to Purple.");
        }
        else if (selection.equals(BROWN_BELT)) {
            beltDivision = Belt.BROWN;
            view.printMessage("Belt division set to Brown.");
        }
        else if (selection.equals(BLACK_BELT)) {
            beltDivision = Belt.BLACK;
            view.printMessage("Belt division set to Black.");
        }

        return beltDivision;
    }

    private String ageSetupMenu() {
        String ageDivision = "";
        view.promptToUpdateAge();

        final String JUVENILE_DIVISION = "Juvenile";
        final String ADULT_DIVISION = "Adult";
        final String MASTERS_DIVISION = "Masters";
        final String[] AGE_DIVISIONS = {JUVENILE_DIVISION, ADULT_DIVISION, MASTERS_DIVISION};

        String selection = view.getMenuSelection("AGE DIVISIONS", AGE_DIVISIONS);

        if (selection.equals(JUVENILE_DIVISION)) {
            ageDivision = JUVENILE_DIVISION;
            view.printMessage("Age division set to Juvenile.");
        } else if (selection.equals(ADULT_DIVISION)) {
            ageDivision = ADULT_DIVISION;
            view.printMessage("Age division set to Adult.");
        } else if (selection.equals(MASTERS_DIVISION)) {
            ageDivision = MASTERS_DIVISION;
            view.printMessage("Age division set to Masters");
        }

        return ageDivision;

    }

    private String genderSetupMenu() {
        String genderDivision;
        view.promptToUpdateGender();

        final String MALE_DIVISION = "Male";
        final String FEMALE_DIVISION = "Female";

        final String[] GENDER_OPTIONS = {MALE_DIVISION, FEMALE_DIVISION};

        String selection = view.getMenuSelection("GENDER DIVISIONS", GENDER_OPTIONS);

        if (selection.equals(MALE_DIVISION)) {
            genderDivision = MALE_DIVISION;
            view.printMessage("Gender division set to Male.");
        } else {
            genderDivision = FEMALE_DIVISION;
            view.printMessage("Gender division set to Female");
        }

        return genderDivision;

    }

    private void displayTimeMenu() {

    }

    private void loadMatchResults() {

    }

}
