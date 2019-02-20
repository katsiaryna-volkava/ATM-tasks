package com.epam.atm.calculator;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner Calculator = new Scanner(System.in);
        double firstNumber, secondNumber, result;
        String inputAction;


        System.out.println("Input the first number: ");
        firstNumber = Calculator.nextDouble();

        System.out.println("Input the ariphmetical sign: ");
        inputAction = Calculator.next();

        System.out.println("Input the second number: ");
        secondNumber = Calculator.nextDouble();


        if (inputAction.equals("+")) {
            result = (firstNumber + secondNumber);
            System.out.println("The result is the following: " + result);
        }
        if (inputAction.equals("-")) {
            result = (firstNumber - secondNumber);
            System.out.println("The result is the following: " + result);
        }
        if (inputAction.equals("*")) {
            result = (firstNumber * secondNumber);
            System.out.println("The result is the following: " + result);
        }
        if (inputAction.equals("/")) {
            result = (firstNumber / secondNumber);
            System.out.println("The result is the following: " + result);
        }
    }
}