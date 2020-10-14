package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    static DecimalFormat dt = new DecimalFormat("0.00");
    private static final int awardMultiplier = 150; // constant for multiplier to calculate cash prize

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name >>"); // prompt a message to enter name
        String name = sc.nextLine(); // store given name in variable

        System.out.println("Enter your GPA >>"); // prompt a message to enter GPA
        double gpa = sc.nextDouble(); // store given GPA in variable

        computeAward(name, gpa); // passes name and gpa to computeAward

        sc.close();
    }

    public static void computeAward(String name, double gpa)
    {
        double userAward;
        userAward=awardMultiplier * gpa; // calculate the award.
        System.out.println( name + ", since your gpa is " + gpa + ", NRCC will give you an award of:  $" + dt.format(userAward)); // display the student's name, gpa and award

    }

}