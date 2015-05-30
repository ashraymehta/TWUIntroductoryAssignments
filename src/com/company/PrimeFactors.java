package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashrayme on 30/05/15.
 */
public class PrimeFactors {

    public static List<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for(int j=2; j<n/2; j++) {
            if(n%j == 0 && isPrime(j))
                factors.add(j);
        }
        return factors;
    }

    private static boolean isPrime(int number) {
        for(int i=2; i<number; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
