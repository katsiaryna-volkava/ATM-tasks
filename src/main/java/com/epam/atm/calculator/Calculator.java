package com.epam.atm.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double firstNumber, secondNumber, result = 0;
        String operator;


        System.out.println("Input the first number: ");
        firstNumber = Double.parseDouble(reader.readLine());

        System.out.println("Input the operator: ");
        operator = reader.readLine();

        System.out.println("Input the second number: ");
        secondNumber = Double.parseDouble(reader.readLine());


        if (operator.equals("+")) {
            result = (firstNumber + secondNumber);
        }
        if (operator.equals("-")) {
            result = (firstNumber - secondNumber);
        }
        if (operator.equals("*")) {
            result = (firstNumber * secondNumber);
        }
        if (operator.equals("/")) {
            result = (firstNumber / secondNumber);
        }

        System.out.println("The result is the following: " + result);
    }
}