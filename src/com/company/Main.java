package com.company;

public class Main {

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Patterns patterns = new Patterns();
        boolean FLAG_EXIT = false;
        while(!FLAG_EXIT) {
            Menu.displayMain();
            int selection = Menu.getSelection();
            switch (selection) {
                case 1:
                    patterns.easiestExerciseEver();
                    break;
                case 2:
                    patterns.drawHorizontalLine(8);
                    break;
                case 3:
                    patterns.drawVerticalLine(3);
                    break;
                case 4:
                    patterns.drawRightTriangle(3);
                    break;
                case 5:
                    patterns.drawIsoscelesTriangle(3);
                    break;
                case 6:
                    patterns.drawDiamond(3);
                    break;
                case 7:
                    patterns.drawDiamondWithName(3, "Ashray");
                    break;
                case 8:
                    FizzBuzz.fizzBuzz(100);
                    break;
                case 9:
                    PrimeFactors.printPrimeFactors(30);
                    break;
                case 10:
                    FLAG_EXIT = true;
                    break;
            }
            try {
                if(!FLAG_EXIT)
                    Thread.sleep(1000);
            } catch (InterruptedException e) {
                continue;
            }
        }
    }

}
