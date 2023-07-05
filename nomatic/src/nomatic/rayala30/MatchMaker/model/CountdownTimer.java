package nomatic.rayala30.MatchMaker.model;

import javax.swing.Timer;


public class CountdownTimer {
    // instance variables
    private int minutes;
    private int seconds;

    // declare Timer t
    Timer timer;

    // Constructor
    public CountdownTimer(int length) {

    }

    // getters
    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    // setters

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // constructors
    public void setTimer(int minutes) {


    }


    // methods

    // create a run, start, stop method for timer
}
