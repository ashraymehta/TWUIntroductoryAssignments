package com.company;

/**
 * Created by ashrayme on 30/05/15.
 */
public class Menu {
    static Console console = new Console();

    private static final String[] mainMenuArray = {"Easiest Exercise Ever", "Draw Horizontal Line", "Vertical Line",
            "Right Triangle", "Isosceles Triangle", "Diamond",
            "Diamond with name", "FizzBuzz", "Prime Factor",
            "Exit"};

    public static void displayMain() {
        int i=1;
        for(String item : mainMenuArray) {
            console.writeLine(i++ + ". " + item);
        }
    }

    public static int getSelection() {
        return Integer.parseInt(console.readLine());
    }
}
