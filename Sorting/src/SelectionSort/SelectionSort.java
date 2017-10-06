package SelectionSort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert amount of numbers, which you'd like to sort ");
        int n = in.nextInt();
        int tab[] = new int[n];
        System.out.println("Insert your numbers");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = in.nextInt();
        }
        selectionSort(tab);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void selectionSort(int tablica[]) {
        int min, temp;
        for (int i = 0; i < tablica.length; i++) {
            min = tablica[i];
            for (int j = i + 1; j < tablica.length; j++) {
                if (tablica[j] < min) {
                    temp = tablica[j];
                    tablica[j] = tablica[i];
                    tablica[i] = temp;
                }
            }
        }
    }
}
