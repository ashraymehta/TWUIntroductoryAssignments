package com.company;

import org.omg.CORBA.Environment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Patterns patterns = new Patterns();

        patterns.easiestExerciseEver();

        patterns.drawHorizontalLine(8);

        patterns.drawVerticalLine(3);

        patterns.drawRightTriangle(3);

        patterns.drawIsoscelesTriangle(3);

        patterns.drawDiamond(3);

        patterns.drawDiamondWithName(3, "Ashray");

        FizzBuzz.fizzBuzz(100);

        primeFactorsExercise();
    }

    private static void primeFactorsExercise() {
        List<Integer> factors = PrimeFactors.generate(30);
        for(Integer fact : factors) {
            System.out.println(fact);
        }
    }

}
