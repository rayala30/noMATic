package nomatic.rayala30.MatchMaker;

import nomatic.rayala30.MatchMaker.model.Match;
import nomatic.rayala30.MatchMaker.model.Timer;
import nomatic.rayala30.MatchMaker.model.athlete.Athlete;
import nomatic.rayala30.MatchMaker.model.athlete.Belt;
import nomatic.rayala30.MatchMaker.model.athlete.Weight;
import nomatic.rayala30.util.*;

public class MatchMakerController {

    // Instance variables

    private final MatchMakerView view;
    private Match currentMatch; // Null Value until setup complete

    private final MatchMakerStorage storage;



    // Constructor
    public MatchMakerController(BasicConsole console, BasicFileStorage fileStorage) {
        view = new MatchMakerView(console);
        storage = new MatchMakerStorage(fileStorage);
    }

    // Methods

    public void run() {
        displayStartingMenu();
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
        Weight matchWeight = weightSetUpMenu();
        // Prompt for Time
        int matchLength = timeSetupMenu();
        // Prompt for Athlete One
        Athlete athleteOne = athleteOneSetup();
        // Prompt for Athlete Two
        Athlete athleteTwo = athleteTwoSetup();
        // Set current match
        currentMatch = new Match(athleteOne, athleteTwo, matchBelt, matchWeight, matchAge, matchGender, matchLength);
        // Display currentMatch Information
        view.printMessage("");
        view.printMessage("Setting up match.");
        view.printMessage("");
        view.printMessage("MATCH SET FOR " + matchAge.toUpperCase() + " " + matchGender.toUpperCase() + " " + matchBelt.toString().toUpperCase() + " BELT DIVISION AT " + matchWeight.toString().toUpperCase() + "." );
        view.printMessage(athleteOne.getName().toUpperCase() + " VS. " + athleteTwo.getName().toUpperCase());
        view.printMessage("");

        // Start match
        runMatch(currentMatch, athleteOne, athleteTwo);
    }

    private void runMatch(Match currentMatch, Athlete athleteOne, Athlete athleteTwo) {
        // Set default points
        currentMatch.setAthleteOnePoints(0);
        currentMatch.setAthleteOnePoints(0);
        // Set default advantages
        currentMatch.setAthleteOneAdv(0);
        currentMatch.setAthleteTwoAdv(0);
        // Set default penalties
        currentMatch.setAthleteOnePenalty(0);
        currentMatch.setAthleteTwoPenalty(0);

        // Get current points
        int athleteOnePoints = currentMatch.getAthleteOnePoints();
        int athleteTwoPoints = currentMatch.getAthleteTwoPoints();
        // Get current advantages
        int athleteOneAdv = currentMatch.getAthleteOneAdv();
        int athleteTwoAdv = currentMatch.getAthleteTwoAdv();
        // Get current penalties
        int athleteOnePenalty = currentMatch.getAthleteOnePenalty();
        int athleteTwoPenalty = currentMatch.getAthleteTwoPenalty();

        // Point Options
        final String POINTS = "Points";
        final String ADVANTAGE = "Advantage";
        final String PENALTY = "Penalty";
        final String SUBMISSION = "Submission";
        final String DISQUALIFICATION = "Disqualification";
        final String REVIEW = "Review";

        // TODO
        // PROBLEM: Countdown Timer inline with Match Action prompt line



        final String[] MATCH_OPTIONS = {POINTS, ADVANTAGE, PENALTY, SUBMISSION, DISQUALIFICATION, REVIEW};
        boolean matchOngoing = true;

        while(matchOngoing) {
            Timer matchTimer = new Timer();
            int timer = currentMatch.getMatchLength();
            matchTimer.startTimer(timer);

            // Display Score
            String athleteOneOverallScore = currentMatch.displayScore(athleteOne, athleteOnePoints, athleteOneAdv, athleteOnePenalty);
            String athleteTwoOverallScore = currentMatch.displayScore(athleteTwo, athleteTwoPoints, athleteTwoAdv, athleteTwoPenalty);
            view.printDivider();
            view.printMessage(athleteOneOverallScore);
            view.printDivider();
            view.printMessage(athleteTwoOverallScore);
            view.printDivider();

            final String[] ATHLETE_OPTIONS = {athleteOne.getName(), athleteTwo.getName()};

            view.promptForMatchAction();
            String action = view.getMenuSelection("MATCH ACTIONS", MATCH_OPTIONS);

            if (action.equals(POINTS)) {
                view.promptForPointAction();
                final String SWEEP = "Sweep";
                final String TAKEDOWN = "Takedown";
                final String KNEE_ON_BELLY = "Knee On Belly";
                final String GUARD_PASS = "Guard Pass";
                final String MOUNT = "Mount";
                final String BACK_CONTROL = "Back Control";
                final String RETURN = "Return";

                final String[] POINTS_OPTIONS = {SWEEP, TAKEDOWN, KNEE_ON_BELLY, GUARD_PASS, MOUNT, BACK_CONTROL, RETURN};

                // Athlete selection option
                String athleteSelection = view.getMenuSelection("ATHLETE SELECTION", ATHLETE_OPTIONS);

                String pointAction = view.getMenuSelection("POINT ACTIONS", POINTS_OPTIONS);
                int awardPoint = currentMatch.pointsCalculator(pointAction);

                // Prompt for Athlete Selection
                view.printMessage("Award points to: ");
                if (athleteSelection.equals(athleteOne.getName())) {
                    athleteOnePoints += awardPoint;
                } else {
                    athleteTwoPoints += awardPoint;
                }

            } else if (action.equals(ADVANTAGE)) {
                // Athlete selection option
                String athleteSelection = view.getMenuSelection("ATHLETE SELECTION", ATHLETE_OPTIONS);

                view.printMessage("Award advantage to: ");
                if (athleteSelection.equals(athleteOne.getName())) {
                    athleteOneAdv++;
                } else {
                    athleteTwoAdv++;
                }

            } else if (action.equals(PENALTY)) {
                // Athlete selection option
                String athleteSelection = view.getMenuSelection("ATHLETE SELECTION", ATHLETE_OPTIONS);

                view.printMessage("Give penalty to: ");
                if (athleteSelection.equals(athleteOne.getName())) {
                    athleteOnePenalty++;
                } else {
                    athleteTwoPenalty++;
                }

            } else if (action.equals(SUBMISSION)) {
                // Athlete selection option
                String athleteSelection = view.getMenuSelection("ATHLETE SELECTION", ATHLETE_OPTIONS);

                view.printMessage("Submission win: ");
                if (athleteSelection.equals(athleteOne.getName())) {
                    view.printMessage(athleteOne.getName().toUpperCase() + " WINS!");
                    view.printMessage("Match over.");
                    currentMatch.setMatchWinner(athleteOne.getName());
                    matchOngoing = false;
                } else {
                    view.printMessage(athleteTwo.getName().toUpperCase() + " WINS!");
                    view.printMessage("Match over.");
                    currentMatch.setMatchWinner(athleteTwo.getName());
                    matchOngoing = false;
                }

            } else if (action.equals(DISQUALIFICATION)) {
                // Athlete selection option
                String athleteSelection = view.getMenuSelection("ATHLETE SELECTION", ATHLETE_OPTIONS);

                view.printMessage("Disqualification for: " + athleteOne.getName());
                if (athleteSelection.equals(athleteOne.getName())) {
                    view.printMessage(athleteTwo.getName().toUpperCase() + " WINS!");
                    view.printMessage("Match over.");
                    currentMatch.setMatchWinner(athleteTwo.getName());
                    matchOngoing = false;
                } else {
                    view.printMessage(athleteOne.getName().toUpperCase() + " WINS!");
                    view.printMessage("Match over.");
                    currentMatch.setMatchWinner(athleteOne.getName());
                    matchOngoing = false;
                }

            } else if (action.equals(REVIEW)) {

                // TODO
                // Create a pause and resume timer method

                // Athlete selection option
                String athleteSelection = view.getMenuSelection("ATHLETE SELECTION", ATHLETE_OPTIONS);
                final String EDIT_POINTS = "Edit points";
                final String EDIT_ADV = "Edit advantage";
                final String EDIT_PEN = "Edit penalty";
                String[] options = {EDIT_POINTS, EDIT_ADV, EDIT_PEN};
                String optionSelection = view.getMenuSelection("REVIEW OPTIONS", options);

                view.promptForPointReview();

                if (optionSelection.equals(EDIT_POINTS)) {
                    view.printMessage("Enter point deduction: ");
                    String prompt = "";
                    int deductionValue = view.promptForInteger(prompt);

                    if (athleteSelection.equals(athleteOne.getName())) {
                        athleteOnePoints -= deductionValue;
                    } else {
                        athleteTwoPoints -= deductionValue;
                    }
                } else if (optionSelection.equals(EDIT_ADV)) {
                    view.printMessage("Enter advantage deduction: ");
                    String prompt = "";
                    int deductionValue = view.promptForInteger(prompt);

                    if (athleteSelection.equals(athleteOne.getName())) {
                        athleteOneAdv -= deductionValue;
                    } else {
                        athleteTwoAdv -= deductionValue;
                    }
                } else if (optionSelection.equals(EDIT_PEN)) {
                    view.printMessage("Enter penalty deduction: ");
                    String prompt = "";
                    int deductionValue = view.promptForInteger(prompt);

                    if (athleteSelection.equals(athleteOne.getName())) {
                        athleteOnePenalty -= deductionValue;
                    } else {
                        athleteTwoPenalty -= deductionValue;
                    }
                }

            }
        }
        // TODO
        // Determine match winner if time runs out via points and advantages. Dependent on Timer class resolution


        // After match completes, run postMatchMenu
        postMatchMenu();
    }

    private void postMatchMenu() {
        final String SAVE = "Save this match";
        final String NEXT = "Create next match";
        final String EXIT = "Exit MatchMaker";
        final String[] POST_OPTIONS = {SAVE, NEXT, EXIT};

        String selection = view.getMenuSelection("POST-MATCH ACTIONS", POST_OPTIONS);

        if (selection.equals(SAVE)) {
            saveMatch();
        } else if (selection.equals(NEXT)) {
            displayMatchSetupMenu();
        } else {
            view.printMessage("Program closing.");
            System.exit(0);
        }
    }

    private void saveMatch() {
        String filename = view.promptForFileName();
        if (!filename.isBlank()) {
            try {
                storage.writeMatchToFile(currentMatch, filename);
            } catch (BasicXmlException e) {
                view.printErrorMessage("Please make sure your match information does not contain < or > characters");
            } catch (FileStorageException e) {
                view.printErrorMessage(e.getMessage());
            }
        }
    }

    private void loadMatchResults() {
        String filename = view.promptForFileName();
        if (!filename.isBlank()) {
            try {
                currentMatch = storage.readMatchFromFile(filename);
            } catch (FileStorageException e) {
                view.printErrorMessage(e.getMessage());
            }
        }
    }

    private Athlete athleteOneSetup() {
        String name = view.promptToUpdateAthleteOne();
        return new Athlete(name);
    }

    private Athlete athleteTwoSetup() {
        String name = view.promptToUpdateAthleteTwo();
        return new Athlete(name);
    }

    private Weight weightSetUpMenu() {
        Weight weightDivision = null;
        view.promptToUpdateWeight();

        final String ROOSTERWEIGHT = Weight.Roosterweight.toString();
        final String LIGHT_FEATHERWEIGHT = Weight.Light_Featherweight.toString().replaceAll("_", "-");
        final String FEATHERWEIGHT = Weight.Featherweight.toString();
        final String LIGHTWEIGHT = Weight.Lightweight.toString();
        final String MIDDLEWEIGHT = Weight.Middleweight.toString();
        final String MEDIUM_HEAVYWEIGHT = Weight.Medium_Heavyweight.toString().replaceAll("_", "-");
        final String HEAVYWEIGHT = Weight.Heavyweight.toString();
        final String SUPER_HEAVYWEIGHT = Weight.Super_Heavyweight.toString().replaceAll("_", "-");
        final String ULTRA_HEAVYWEIGHT = Weight.Ultra_Heavyweight.toString().replaceAll("_", "-");
        final String OPEN_WEIGHT = Weight.Open_Weight.toString().replaceAll("_", "-");

        final String[] WEIGHT_OPTIONS = {ROOSTERWEIGHT, LIGHT_FEATHERWEIGHT, FEATHERWEIGHT, LIGHTWEIGHT, MIDDLEWEIGHT,
                MEDIUM_HEAVYWEIGHT, HEAVYWEIGHT, SUPER_HEAVYWEIGHT, ULTRA_HEAVYWEIGHT, OPEN_WEIGHT
        };

        String selection = view.getMenuSelection("WEIGHT DIVISIONS", WEIGHT_OPTIONS);

        if (selection.equals(ROOSTERWEIGHT)) {
            weightDivision = Weight.Roosterweight;
            view.printMessage("Weight division set to Roosterweight.");
        } else if (selection.equals(LIGHT_FEATHERWEIGHT)) {
            weightDivision = Weight.Light_Featherweight;
            view.printMessage("Weight division set to Light-Featherweight.");
        } else if (selection.equals(FEATHERWEIGHT)) {
            weightDivision = Weight.Featherweight;
            view.printMessage("Weight division set to Featherweight.");
        } else if (selection.equals(LIGHTWEIGHT)) {
            weightDivision = Weight.Lightweight;
            view.printMessage("Weight division set to Lightweight.");
        } else if (selection.equals(MIDDLEWEIGHT)) {
            weightDivision = Weight.Middleweight;
            view.printMessage("Weight division set to Middleweight.");
        } else if (selection.equals(MEDIUM_HEAVYWEIGHT)) {
            weightDivision = Weight.Medium_Heavyweight;
            view.printMessage("Weight division set to Medium-Heavyweight.");
        } else if (selection.equals(HEAVYWEIGHT)) {
            weightDivision = Weight.Heavyweight;
            view.printMessage("Weight division set to Heavyweight.");
        } else if (selection.equals(SUPER_HEAVYWEIGHT)) {
            weightDivision = Weight.Super_Heavyweight;
            view.printMessage("Weight division set to Super-Heavyweight.");
        } else if (selection.equals(ULTRA_HEAVYWEIGHT)) {
            weightDivision = Weight.Ultra_Heavyweight;
            view.printMessage("Weight division set to Ultra-Heavyweight.");
        } else if (selection.equals(OPEN_WEIGHT)) {
            weightDivision = Weight.Open_Weight;
            view.printMessage("Weight division set to Open-Weight.");
        }

        return weightDivision;
    }

    private Belt beltSetupMenu() {
        Belt beltDivision = null;
        view.promptToUpdateBelt();

        final String WHITE_BELT = Belt.White.toString();
        final String BLUE_BELT = Belt.Blue.toString();
        final String PURPLE_BELT = Belt.Purple.toString();
        final String BROWN_BELT = Belt.Brown.toString();
        final String BLACK_BELT = Belt.Black.toString();

        final String[] BELT_OPTIONS = {WHITE_BELT, BLUE_BELT, PURPLE_BELT, BROWN_BELT, BLACK_BELT};

        String selection = view.getMenuSelection("BELT DIVISIONS", BELT_OPTIONS);

        if (selection.equals(WHITE_BELT)) {
            beltDivision = Belt.White;
            view.printMessage("Belt division set to White.");
        }
        else if (selection.equals(BLUE_BELT)) {
            beltDivision = Belt.Blue;
            view.printMessage("Belt division set to Blue.");
        }
        else if (selection.equals(PURPLE_BELT)) {
            beltDivision = Belt.Purple;
            view.printMessage("Belt division set to Purple.");
        }
        else if (selection.equals(BROWN_BELT)) {
            beltDivision = Belt.Brown;
            view.printMessage("Belt division set to Brown.");
        }
        else if (selection.equals(BLACK_BELT)) {
            beltDivision = Belt.Black;
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
            view.printMessage("Gender division set to Female.");
        }

        return genderDivision;
    }

    private int timeSetupMenu() {
        int timerLength = 0;
        view.promptToUpdateMatchLength();

        final String FIVE = "5:00";
        final String SIX = "6:00";
        final String SEVEN = "7:00";
        final String EIGHT = "8:00";
        final String TEN = "10:00";
        final String[] TIME_OPTIONS = {FIVE, SIX, SEVEN, EIGHT, TEN};

        String selection = view.getMenuSelection("MATCH LENGTH", TIME_OPTIONS);

        if (selection.equals(FIVE)) {
            timerLength = 300;
            view.printMessage("Match set for 5:00.");
        } else if (selection.equals(SIX)) {
            timerLength = 360;
            view.printMessage("Match set for 6:00.");
        } else if (selection.equals(SEVEN)) {
            timerLength = 420;
            view.printMessage("Match set for 7:00.");
        } else if (selection.equals(EIGHT)) {
            timerLength = 480;
            view.printMessage("Match set for 8:00.");
        } else if (selection.equals(TEN)) {
            timerLength = 600;
            view.printMessage("Match set for 10:00.");
        }

        return timerLength;
    }

}
