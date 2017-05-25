package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Piotr on 2017-05-01.
 */
public class CalcMethod {
    public static void main(String... args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int menu;
        String givenNumbersInString;
        double result;

        do {
            printMenu();
            menu = makeChoice(reader);
            switch (menu) {
                case 1:
                    givenNumbersInString = getTwoNumbersWithSpace(reader);
                    System.out.print("result: ");
                    System.out.println(result = plus(givenNumbersInString));
                    break;
                case 2:
                    givenNumbersInString = getTwoNumbersWithSpace(reader);
                    System.out.print("result: ");
                    System.out.println(result = minus(givenNumbersInString));
                    break;
                case 3:
                    givenNumbersInString = getTwoNumbersWithSpace(reader);
                    System.out.print("result: ");
                    System.out.println(result = multiply(givenNumbersInString));
                    break;
                case 4:
                    givenNumbersInString = getTwoNumbersWithSpace(reader);
                    System.out.print("result: ");
                    System.out.println(result = divide(givenNumbersInString));
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    private static double plus(String source) {
        double[] numbers = extractNumbers(source);
        return numbers[0] + numbers[1];
    }

    private static double minus(String source) {
        double[] numbers = extractNumbers(source);
        return numbers[0] - numbers[1];
    }

    private static double multiply(String source) {
        double[] numbers = extractNumbers(source);
        return numbers[0] * numbers[1];
    }

    private static double divide(String source) {
        double[] numbers = extractNumbers(source);
        return numbers[0] / numbers[1];
    }

    private static double[] extractNumbers(String source) {
        String[] stringNumber;
        stringNumber = source.split(" ", 0);
        double[] numbers = new double[2];
        numbers[0] = Double.valueOf(stringNumber[0]);
        numbers[1] = Double.valueOf(stringNumber[1]);
        return numbers;
    }

    private static void printMenu() {
        System.out.println("┌-------------------------------┐");
        System.out.println("|   Calculator v 3.0 -Method    |");
        System.out.println("|-------------------------------|");
        System.out.println("|Select one of the options below|");
        System.out.println("| Provide two numbers           |");
        System.out.println("|-------------------------------|");
        System.out.println("| (1) Addition                  |");
        System.out.println("| (2) Substraction              |");
        System.out.println("| (3) Multiplication            |");
        System.out.println("| (4) Division                  |");
        System.out.println("|-------------------------------|");
        System.out.println("| (5) exit program              |");
        System.out.println("└-------------------------------┘");
    }

    private static int makeChoice(BufferedReader reader) {
        System.out.println("Chose action ");
        int menu = 5;
        try {
            menu = Integer.parseInt(reader.readLine());
        } catch (IOException exc) {
            ;
        } finally {
            return menu;
        }
    }

    private static String getTwoNumbersWithSpace(BufferedReader reader) {
        System.out.println("give 2 numbers separate space ");
        String numberString = "null";
        try {
            numberString = reader.readLine();
        } catch (IOException exc) {
            ;
        } finally {
            return numberString;
        }
    }
}