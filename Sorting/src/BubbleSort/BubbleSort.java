package BubbleSort;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Insert amount of numbers, which you'd like to sort ");
        int n = reading.nextInt(); //n-lenght of array to sort
        int tab[] = new int[n];
        System.out.println("Insert your numbers");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = reading.nextInt();
        }
        bubbleSort(tab);
        System.out.println("After bubble sort: ");
        for (int i = 0; i <tab.length ; i++) {
            System.out.println(tab[i]);
        }
    }
        public static void bubbleSort(int tab[]){
        int temp;
            for (int i = 0; i <tab.length-1 ; i++) {
                if(tab[i]>tab[i+1]){
                    temp=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=temp;
                }
            }
    }
}
