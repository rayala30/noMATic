package nomatic.rayala30.MatchMaker.model;

public class CountDownTimer implements Runnable {

    // Instance variables
    private int seconds;

    // Constructor

    public CountDownTimer(int seconds) {
        this.seconds = seconds;
    }


    // Getters

    public int getSeconds() {
        return seconds;
    }


    // Setters

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        // Create a for loop which decrements
        for (int i = seconds; i >= 0; i--) {

            System.out.println(i);

            try {
                Thread.sleep(1000); // 1000 milliseconds in one second
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
