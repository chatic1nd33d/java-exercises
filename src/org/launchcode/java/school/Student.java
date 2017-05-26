package org.launchcode.java.school;

import java.util.Scanner;

public class Student {
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public String getName() {

        return name;
    }
    public void setName(String aName) {

        name = aName;
    }
    public int getStudentId() {

        return studentId;
    }
    private void setStudentId(int aStudentId) {

        studentId = aStudentId;
    }
    public int getNumberOfCredits() {

        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {

        numberOfCredits = aNumberOfCredits;
    }
    public double getGpa() {

        return gpa;
    }
    public void setGpa(double aGpa) {

        gpa = aGpa;
    }

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String toString() {
        return name + "(Credits: " + numberOfCredits + ", GPA: " + gpa + ", Student ID: " + studentId + ")";
    }

    public boolean equals(Object o) {
        return ((Student) o).getStudentId() == getStudentId();
    }

    public Student(String name, int studentId) {

        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        int newCreditsTotal = this.numberOfCredits + courseCredits;
        this.gpa = (this.gpa*this.numberOfCredits)+(grade * courseCredits)/ newCreditsTotal;
        this.numberOfCredits = this.numberOfCredits + courseCredits;
    }

    public String getGradeLevel() {
        if(this.numberOfCredits>=0) and (this.numberOfCredits<30){
            return "freshman";
        }
        else if(this.numberOfCredits>29 and this.numberOfCredits<60){
            return "sophomore";
        }
        else if(this.numberOfCredits>59 and this.numberOfCredits<90){
            return "junior";
        }
        else{
            return "senior";
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        Scanner in = new Scanner(System.in);
        String newStudent;
    }
}