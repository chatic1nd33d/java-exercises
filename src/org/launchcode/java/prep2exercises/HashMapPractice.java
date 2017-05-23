package org.launchcode.java.prep2exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by summe
 */
public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Double, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Double newStudent;

        System.out.println("Enter your students' ID numbers (or enter '0.0' to finish):");

        // Get student names and grades
        do {

            System.out.print("Student's ID number: (enter '0.0' to finish)");
            newStudent = in.nextDouble();

            if (!newStudent.equals(0.0)) {
                System.out.print("Name: ");
                String newName = in.next();
                students.put(newStudent, newName);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(0.0));

        // Print class roster
        System.out.println("\nClass roster:");
        //double sum = 0.0;

        for (Map.Entry<Double, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            //sum += student.getValue();
        }

        //double avg = sum / students.size();
        //System.out.println("Average grade: " + avg);
    }

}