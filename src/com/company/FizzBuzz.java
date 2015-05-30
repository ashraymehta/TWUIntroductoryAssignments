package com.company;

/**
 * Created by ashrayme on 30/05/15.
 */
public class FizzBuzz {
    public static void fizzBuzz(int n) {
        for(int i=1; i<=n; i++) {
            String toPrint = "";
            if(i%3 == 0  &&  i%5 == 0)
                toPrint = "FizzBuzz";
            else if(i%3 == 0)
                toPrint = "Fizz";
            else if(i%5 == 0)
                toPrint = "Buzz";
            else
                toPrint = Integer.toString(i);
            System.out.println(toPrint);
        }
    }
}
