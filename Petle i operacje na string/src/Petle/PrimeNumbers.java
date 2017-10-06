package Petle;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tab[] = new int[101];
        for (int i = 1; i <= 100; i++) {
            tab[i] = i;
        }
        System.out.println("Prime numbers");
        primeNumbers(tab);
    }

    public static void primeNumbers(int tab[]) {
        for (int i = 2; i < tab.length; i++) {
            int temp = 1;
            for (int j = 2; j < i; j++) {
                if (tab[i] % j == 0) {
                    temp = temp * 0;
                } else temp = temp * 1;
            }
            if (temp == 1) {
                System.out.println(i + " is prime number");
            }
        }

    }
}

