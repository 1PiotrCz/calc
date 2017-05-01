package com.company;

import java.util.Scanner;

/**
 * Created by Piotr on 2017-05-01.
 */
public class CalcCase {
    public static void main(String[] args) {

        int choice;
        int numberOne = 0;
        int numberTwo = 0;
        int result;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("┌-------------------------------┐");
            System.out.println("|    Calculator v 2.0 -CASE     |");
            System.out.println("|-------------------------------|");
            System.out.println("|Select one of the options below|");
            System.out.println("| Provide two numbers           |");
            System.out.println("|-------------------------------|");
            System.out.println("| (1) Addition                  |");
            System.out.println("| (2) Substraction              |");
            System.out.println("| (3) Multiplication            |");
            System.out.println("| (4) Division                  |");
            System.out.println("| (5) Modulo                    |");
            System.out.println("|-------------------------------|");
            System.out.println("| (7) exit program              |");
            System.out.println("└-------------------------------┘");

            input = new Scanner(System.in);
            choice = input.nextInt();

            while ((choice < 1 || choice > 5) && choice != 7) {

                System.out.println("Please enter 1, 2, 3, 4, 5: ");
                choice = input.nextInt();

            }

            if (choice != 7) {

                System.out.println("Please enter 2 numbers only, separate by 'Enter' : ");
                numberOne = input.nextInt();
                numberTwo = input.nextInt();

                switch (choice) {
                    case 1:
                        result = numberOne + numberTwo;
                        System.out.println("\n Result adding : " + result + '\n');
                        break;
                    case 2:
                        result = numberOne - numberTwo;
                        System.out.println("Result substraction: " + result + '\n');
                        break;
                    case 3:
                        result = numberOne * numberTwo;
                        System.out.println("Result multiplication: " + result + '\n');
                        break;
                    case 4:
                        if (numberTwo == 0) {
                            System.out.println("Can not be split by zero");
                        } else {
                            result = numberOne / numberTwo;
                            System.out.println("Result division: " + result + '\n');
                        }
                        break;
                    case 5:
                        result = numberOne % numberTwo;
                        System.out.print("Result modulo: " + result + '\n');
                        break;
                }
            }
        }
        while (choice != 7);
        input.close();
        System.out.println("Finish program");
    }
}