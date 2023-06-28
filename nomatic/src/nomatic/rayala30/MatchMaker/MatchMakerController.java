package nomatic.rayala30.MatchMaker;

import nomatic.rayala30.MatchMaker.model.Match;
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


    private void createNewMatch() {
        currentMatch = new Match();
    }

    private void displayStartingMenu() {

    }

    private void displayMatchMenu() {

    }

    private void saveMatch() {

    }

    private void displayWeightMenu() {

    }

    private void displayBeltMenu() {

    }

    private void displayAgeMenu() {

    }

    private void displayGenderMenu() {

    }

    private void displayTimeMenu() {

    }

}
