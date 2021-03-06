package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ashrayme on 30/05/15.
 */
public class Patterns {
    public static void drawDiamondWithName(int n, String name) {
        System.out.println("Diamond with name:");
        System.out.println(centerString(getIsoscelesTriangle(n-1), 5));

        System.out.println(name);
        System.out.println(centerString(reverseTriangle(getIsoscelesTriangle(n-1)), n*2 - 1));
        System.out.println();
    }

    public static void drawDiamond(int n) {
        System.out.println("Diamond:");
        System.out.println(getIsoscelesTriangle(n));

        System.out.println(centerString(reverseTriangle(getIsoscelesTriangle(n-1)), n*2 - 1));
        System.out.println();
    }

    public static void drawIsoscelesTriangle(int n) {
        System.out.println("Isosceles Triangle:");
        System.out.println(getIsoscelesTriangle(n));
        System.out.println();
    }

    private static String getIsoscelesTriangle(int n) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<n; i++) {
            builder.append(System.lineSeparator());
            builder.append(centerString(getHorizontalLine('*', i * 2 + 1), n * 2 - 1));
        }
        return builder.toString();
    }

    private static String centerString(String str, int totalWidth) {
        if(str.contains(System.lineSeparator())) {
            String[] lines = str.split(System.lineSeparator());
            StringBuilder builder = new StringBuilder();
            boolean first_flag = true;
            for(String line : lines) {
                if(first_flag)
                    first_flag = false;
                else
                    builder.append(System.lineSeparator());
                builder.append(centerString(line, totalWidth));
            }
            return builder.toString();
        }
        else {
            int leftPadLength = str.length() + ((totalWidth - str.length()) / 2);
            String leftPad = String.format("%" + leftPadLength + "s", str);
            String rightPad = String.format("%-" + totalWidth + "s", leftPad);
            return rightPad;
        }
    }

    private static String reverseTriangle(String str) {
        if(!str.contains(System.lineSeparator()))
            return str;
        else {
            List<String> list = Arrays.asList(str.split(System.lineSeparator()));
            Collections.reverse(list);
            StringBuilder builder = new StringBuilder();
            for(String item : list) {
                builder.append(item);
                builder.append(System.lineSeparator());
            }
            return builder.toString();
        }
    }

    public static void drawRightTriangle(int n) {
        System.out.println("Draw a right triangle: ");
        for(int i=1; i<n+1; i++) {
            System.out.println(getHorizontalLine('*', i));
        }
        System.out.println();
    }

    public static void drawVerticalLine(int n) {
        System.out.println("Draw a vertical line:");
        for(int i=0; i<n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }


    public static void drawHorizontalLine(int n) {
        System.out.println("Draw horizontal line:");
        System.out.println(getHorizontalLine('*', n));
        System.out.println();
    }

    private static String getHorizontalLine(char c,int n) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<n; i++)
            builder.append(c);
        return builder.toString();

    }

    public static void easiestExerciseEver() {
        System.out.println("Easiest exercise ever:");
        System.out.println("*");
        System.out.println();
    }
}
