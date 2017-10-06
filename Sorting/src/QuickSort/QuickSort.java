package QuickSort;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert amount of numbers, which you'd like to sort ");
        int n = in.nextInt();
        int tab[] = new int[n];
        System.out.println("Insert your numbers");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = in.nextInt();
        }
        quickSort(tab, 0, n);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void quickSort(int tablica[], int a, int b){
        int temp;
        int start = 0;
        int end=tablica.length;
        int pivot=tablica[(start+end)/2];
        while(start<=end){
            while(tablica[start]<pivot)
                start++;
            while(tablica[end]>pivot)
                end--;
            temp=tablica[start];
            tablica[start]=tablica[end];
            tablica[end]=temp;
            start++;
            end--;
        }
        if (a<end)
            quickSort(tablica,a,end);
        if (start<b)
            quickSort(tablica,end,b);
    }
}
