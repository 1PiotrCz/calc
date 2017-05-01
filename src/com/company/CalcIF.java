package com.company;

import java.util.Scanner;

public class CalcIF {

    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("|        Kalkulator v 1.0 -if   |");
        System.out.println("---------------------------------");
        System.out.println("| podaj dwie liczby             |");
        System.out.println("| oddzielone od siebie spacją   |");
        System.out.println("---------------------------------");
        System.out.println("wybierz jedną z poniższych opcji");
        System.out.println("| jedną z poniższych opcji:     |");
        System.out.println("---------------------------------");
        System.out.println("| (1) dodawanie                 |");
        System.out.println("| (2) odejmowanie               |");
        System.out.println("| (3) mnożenie                  |");
        System.out.println("| (4) dzielenie bez reszty      |");
        System.out.println("| (5) dzielenie z resztą        |");
        System.out.println("---------------------------------");
        System.out.println("| (6) podaj nowe liczby         |");
        System.out.println("| (7) wyjście z programu        |");
        System.out.println("---------------------------------");

        Scanner scanner = new Scanner(System.in);
        String numbers;
        double numberOne = 1;
        double numberTwo = 1;
        int operation = 6;
        do {
            if (operation == 1) {
                System.out.println("Wynik dodawania " + numberOne +" + " + numberTwo + " to " + (numberOne + numberTwo));
            } else if (operation == 2) {
                System.out.println("Wynik odejmowania " + numberOne +" - " + numberTwo + " to " + (numberOne - numberTwo));
            } else if (operation == 3) {
                System.out.println("Wynik mnożenia " + numberOne +" * " + numberTwo + " to " + (numberOne * numberTwo));
            } else if (operation == 4) {
                System.out.println("Wynik dzielenia " + numberOne +" / " + numberTwo + " to " + (numberOne / numberTwo));
            } else if (operation == 5) {
                System.out.println("Wynik dzielenia modulo " + numberOne +" % " + numberTwo + " to " +  (numberOne % numberTwo));
            } else if (operation == 6) {
                System.out.print("Podaj dwie liczby, na których wykonasz działanie: ");
                numbers = scanner.nextLine();
                String[] anArray = numbers.split(" ");
                numberOne = Integer.parseInt(anArray[0]);
                numberTwo = Integer.parseInt(anArray[1]);
            } else if (operation == 7) {
                break;
            } else {
                System.out.println("Wprowadz poprawny parametr by wykonać operację");
            }
            System.out.print("Którą operację chcesz wykonać? ");
            operation = Integer.parseInt(scanner.nextLine());
        } while (true);

    }
}
