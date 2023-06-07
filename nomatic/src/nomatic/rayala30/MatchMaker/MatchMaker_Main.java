package nomatic.rayala30.MatchMaker;

import nomatic.rayala30.util.SystemInOutConsole;
import nomatic.rayala30.util.TextFileStorage;


/*
MatchMaker_main is the class that launches the LiveMatch by creating the objects needed to interact with the user and
file system and passing them to the application's controller object
 */
public class MatchMaker_Main {

    public static void main(String[] args) {
        SystemInOutConsole systemInOutConsole = new SystemInOutConsole();
        TextFileStorage textFileStorage = new TextFileStorage();

        MatchMakerController controller = new MatchMakerController(systemInOutConsole, textFileStorage);


        controller.run();

    }
}
