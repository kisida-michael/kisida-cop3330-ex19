package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Michael Kisida
 */


import java.util.Scanner;


public class BMI
{
    public static double math(int H, int W){

        return  ((double) W) / (H * H) * 703;
    }
    public static boolean isNum(String str){

        try {
            int val= Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            // System.out.println("Input String must be numeric.");
        }
        return false;
    }
    public static void main( String[] args ) {

        int weight = 0;
        int height = 0;

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        boolean valid = false;
        System.out.print("Enter your weight: ");
        while (!valid) {

            String W = input.nextLine();  // Read user input
            if (isNum(W)) {

                weight = Integer.parseInt(W);
                valid = true;
            } else {
                System.out.println("Input is not numeric!");

            }

        }
        valid = false;
        System.out.print("Enter height: ");
        while (!valid) {
            String H = input.nextLine();  // Read user input
            if (isNum(H)) {
                height = Integer.parseInt(H);
                valid = true;
            } else {
                System.out.println("Input is not numeric!");

            }
        }
        double bmi = math(height,weight);
        String message = " ";
        if (bmi >= 18.5 &&  bmi <= 25) {
            message  = "You are within the ideal weight range.";
        }
        else if (bmi > 25) {
            message = "You are overweight. You should see your doctor.";
        }
        else if (bmi < 18.5){
            message = "You are underweight. You should see your doctor.";
        }
        String output1 = String.format("Your BMI is %.1f\n%s", bmi, message);
        System.out.println(output1);
        input.close();
    }

}
