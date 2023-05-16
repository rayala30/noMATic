package nomatic.rayala30.MatchMaker;

import javax.swing.Timer;
import java.util.EventListener;
import java.awt.event.ActionListener;


public class MatchTimer {
    // instance variables
    private int minutes;
    private int seconds;

    // declare Timer t
    Timer timer;

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
//        timer = new Timer();

    }


    // methods

    // create a run, start, stop method for timer
}
