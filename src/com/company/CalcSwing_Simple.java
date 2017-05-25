package com.company;

import javax.swing.*;

/**
 * Created by Piotr Czubkowski on 2017-05-25.
 */
public class CalcSwing_Simple {

    static double dzielenie (int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        int z;
        do {
            String a = JOptionPane.showInputDialog("Zdefiniuj działanie \npodaj liczbe 'spacja' wybierz dzialanie np + 'spacja' podaj druga liczbe" +
                    "\nnp: 5 + 2\n + dodawanie\n - odejmowanie \n * mnożenie \n / dzielenie \n % modulo \n" );
            String[] liczby = a.split(" ");

            int pierwsza = Integer.valueOf(liczby[0]);
            String x = liczby[1];
            int druga = Integer.valueOf(liczby[2]);


            if (x.equals("+")) {
                JOptionPane.showMessageDialog(null, pierwsza + " + " + druga + " = " + (pierwsza + druga));
            } else if (x.equals("-")) {
                JOptionPane.showMessageDialog(null, pierwsza + " - " + druga + " = " + (pierwsza - druga));
            } else if (x.equals("*")) {
                JOptionPane.showMessageDialog(null, pierwsza + " * " + druga + " = " + (pierwsza * druga));
            } else if (x.equals("/") && druga == 0) {
                JOptionPane.showMessageDialog(null, "Nie można dzielić przez zero");
            } else if (x.equals("/")) {
                JOptionPane.showMessageDialog(null, pierwsza + " / " + druga + " = " + (dzielenie(pierwsza, druga)));
            } else if(x.equals("%")){
                JOptionPane.showMessageDialog(null, pierwsza + " % " + druga + " = " + (pierwsza % druga));
            } else JOptionPane.showMessageDialog(null, "Wprowadzono złe działanie");

            z = JOptionPane.showConfirmDialog(null, "Czy chcesz wykonać kolejne zadanie?", "", JOptionPane.YES_NO_OPTION);
        } while (z == 0);
    }

}
