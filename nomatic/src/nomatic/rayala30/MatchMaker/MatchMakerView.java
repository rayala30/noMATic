package nomatic.rayala30.MatchMaker;

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
        return console.promptForString("Please enter the file name: ");
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




}
