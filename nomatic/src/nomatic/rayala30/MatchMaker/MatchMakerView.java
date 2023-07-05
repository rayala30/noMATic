package nomatic.rayala30.MatchMaker;

import nomatic.rayala30.MatchMaker.model.athlete.Belt;
import nomatic.rayala30.MatchMaker.model.athlete.Weight;
import nomatic.rayala30.util.BasicConsole;

/*
LiveMatchView is a class that the LiveMatchController uses for gathering athlete information from the user
and presenting match information to the user. It requires an object that implements the BasicConsole interface
to handle the mechanics of reading from and writing to the console.
 */

public class MatchMakerView {

    // initialize BasicConsole
    private final BasicConsole console;

    // create constructor
    public MatchMakerView(BasicConsole console) {
        this.console = console;
    }

    public String promptForFileName() {
        return console.promptForString("Enter the file name: ");
    }

    public String promptForValue(String messagePrompt) {
        return console.promptForString(messagePrompt);
    }

    public void printMessage(String message) {
        console.printMessage(message);
    }

    public void printErrorMessage(String message) {
        console.printErrorMessage(message);
    }

    public void printDivider() {
        console.printDivider();
    }

    public String getMenuSelection(String menuTitle, String[] options) {
        console.printBanner(menuTitle);
        return console.getMenuSelection(options);
    }

    public boolean promptForYesNo(String prompt) {
        return console.promptForYesNo(prompt);
    }

    public void promptToUpdateWeight() {
        console.printMessage(""); // Empty line
        console.printMessage("Select weight division.");
    }

    public void promptToUpdateGender() {
        console.printMessage(""); // Empty line
        console.printMessage("Select gender division.");
    }

    public void promptToUpdateAge() {
        console.printMessage(""); // Empty line
        console.printMessage("Select age division.");
    }

    public void promptToUpdateBelt() {
        console.printMessage(""); // Empty line
        console.printMessage("Select belt division.");
    }

    public String promptToUpdateAthleteOne() {
        String athleteOnePrompt = console.promptForString("Enter Athlete One name (First Last): ");
        return athleteOnePrompt;
    }

    public String promptToUpdateAthleteTwo() {
        String athleteTwoPrompt = console.promptForString("Enter Athlete Two name (First Last): ");
        return athleteTwoPrompt;
    }


    public void promptToUpdateMatchLength() {
        console.printMessage(""); // Empty line
        console.printMessage("Select match length.");
    }

}
