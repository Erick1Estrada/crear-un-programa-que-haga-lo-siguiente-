package com.example.xd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {

    public static void print(String data){
        System.out.println(data);
    }

    public static int sumTwoNumbers(int whole1, int whole2){
        return whole1 + whole2;
    }

    public static void printString(String data) {
        System.out.println(data);
    }

    public static double calculateCosine(int value) {
        return Math.cos(Math.toRadians(value));
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int whole1 = 0, whole2 = 0;
        String option = "";

        System.out.println("Enter an option: A, B, C");
        option = keyboard.nextLine();

        switch (option.toLowerCase()) {
            case "a":
                System.out.println("Enter integer1:");
                whole1 = keyboard.nextInt();
                System.out.println("Enter integer2:");
                whole2 = keyboard.nextInt();
                int sumResult = sumTwoNumbers(whole1, whole2);
                print("The result of the sum is " + sumResult);
                break;

            case "b":
                System.out.println("Enter a word:");
                String word = keyboard.nextLine();
                printString("The word: " + word);
                break;

            case "c":
                System.out.println("Enter an integer:");
                int value = keyboard.nextInt();
                double cosineResult = calculateCosine(value);
                print("The cosine of " + value + " is " + cosineResult);
                break;

            default:
                System.out.println("Invalid option");
                break;
        }

        keyboard.close();
    }
}
