package org.launchcode.java.prep2exercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by summe on 5/13/2017.
 */

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3 ,4, 5, 6, 7, 8, 9, 10));

        double sum = 0.0;

        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i)%2==0){
                sum += numbers.get(i);
            }
        }
        System.out.println(sum);
    }
}

