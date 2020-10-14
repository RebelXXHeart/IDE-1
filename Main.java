/*
Stephen Morrow
CSC 201
IDE 1
*/

package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    static DecimalFormat dt = new DecimalFormat("0.00");
    // constant for multiplier to calculate cash prize
    private static final int awardMultiplier = 150;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // prompt a message to enter name
        System.out.println("Enter your name >>");
        // store given name in variable
        String name = sc.nextLine();
        
        // prompt a message to enter GPA
        System.out.println("Enter your GPA >>");
        // store given GPA in variable
        double gpa = sc.nextDouble(); 
        
        // passes name and gpa to computeAward
        computeAward(name, gpa);

        sc.close();
    }

    public static void computeAward(String name, double gpa)
    {
        double userAward;
        // calculate the award.
        userAward=awardMultiplier * gpa;
        // display the student's name, gpa and award
        System.out.println( name + ", since your gpa is " + gpa + ", NRCC will give you an award of:  $" + dt.format(userAward));

    }

}
