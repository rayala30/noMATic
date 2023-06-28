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
                displayMatchMenu();
            } else if (selection.equals(LOAD)) {
                loadMatchResults();
                if (currentMatch != null) {
                    displayMatchMenu();
                }
            }
            else {
                finished = true;
            }
        }

    }

    private void displayMatchMenu() {

    }

    private void saveMatch() {

    }

    private void displayWeightMenu() {
        // use view.getMenuSelection

    }

    private void displayBeltMenu() {

    }

    private void displayAgeMenu() {

    }

    private void displayGenderMenu() {

    }

    private void displayTimeMenu() {

    }

    private void loadMatchResults() {

    }

}
