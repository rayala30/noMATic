package nomatic.rayala30.util;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class SystemInOutConsole implements BasicConsole {

    private final Scanner input = new Scanner(System.in);
    @Override
    public void pauseOutput() {

    }

    @Override
    public void printMessage(String message) {

    }

    @Override
    public void printErrorMessage(String message) {

    }

    @Override
    public void printDivider() {

    }

    @Override
    public void printBanner(String message) {

    }

    @Override
    public void printBulletedItems(String[] items) {

    }

    @Override
    public String getMenuSelection(String[] options) {
        return null;
    }

    @Override
    public String getMenuSelection(String[] options, boolean allowNullResponse) {
        return null;
    }

    @Override
    public Integer getMenuSelectionIndex(String[] options, boolean allowNullResponse) {
        return null;
    }

    @Override
    public String promptForString(String prompt) {
        return null;
    }

    @Override
    public boolean promptForYesNo(String prompt) {
        return false;
    }

    @Override
    public Integer promptForInteger(String prompt) {
        return null;
    }

    @Override
    public Double promptForDouble(String prompt) {
        return null;
    }

    @Override
    public BigDecimal promptForBigDecimal(String prompt) {
        return null;
    }

    @Override
    public LocalDate promptForLocalDate(String prompt) {
        return null;
    }
}
