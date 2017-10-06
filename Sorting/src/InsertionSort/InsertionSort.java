package InsertionSort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert amount of numbers, which you'd like to sort ");
        int n = in.nextInt(); //n-lenght of array to sort
        int tab[] = new int[n];
        System.out.println("Insert your numbers");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = in.nextInt();
        }
        insertionsort(tab, n);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

  /*  public static void insertionSort(int tab[],int size) {
        int j;
        int temp;
        for (int i = 0; i < size; i++) {
            j = i;
            temp = tab[i];
            while ((j > 0) && (tab[j - 1] > tab[j])) {
                tab[j] = tab[j - 1];
                j--;
            }
            tab[j] = temp;
        }

    }*/

    private static void insertionsort(int tablica[], int size) {
        int i, temp1, temp2;

        for (i = 1; i <size; i++) {
            temp1 = i;
            temp2 = tablica[i];
            while ((temp1 > 0) && (tablica[temp1 - 1] > temp2)) {
                tablica[temp1] = tablica[temp1 - 1];
                temp1--;
            }
            tablica[temp1] = temp2;
        }
    }
}


