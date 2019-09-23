package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ToDo Declare Variables
            double feet, inches, meters, kilograms, bmi, weight;

            double IN_TO_METERS = 0.0254;
            double FT_TO_INCHES = 12;

            Scanner keyboard;


        //ToDo INITIALIZE THE VARIABLES WITH USER INPUT
        keyboard = new Scanner(System.in);

        System.out.println("What is your height in feet? (ex: x'6)");
        feet = keyboard.nextDouble();

        System.out.println("What is your height in inches? (ex: 5'x) ");
        inches = keyboard.nextDouble();

        System.out.println("What is your weight in pounds?");
        weight = keyboard.nextDouble();

        //TODO CONVERT VARIABLES TO THE EQUATION
            inches = inches  + (feet * 12);

            meters = inches * IN_TO_METERS;

            kilograms = (weight * 0.453592);

        //TODO PERFORM BMI CALCULATION
            bmi = kilograms / (meters * meters);





        //TODO PRINT RESULTS
            System.out.println("Your BMI (Body Mass Index) is ");
            System.out.print(bmi);


    }
}
