package org.launchcode.java.prep2exercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by summe on 5/13/2017.
 */
public class ArrayListStringPractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Edgar", "Sven", "Summer", "Brian"));

        for (String name : names){
            Integer accumulator = 0;
            for (char c : name.toCharArray()){
                accumulator += 1;

                }
                if (accumulator == 5){
                    System.out.println(name);
            }
        }
    }
}
