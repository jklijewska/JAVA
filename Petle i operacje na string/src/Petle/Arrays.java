package Petle;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
       /* int tablica[]={4,5,2,5};
        int tab[]=new int[5];
        W prowadź n liczb całkowitych do jednowymiarowej tablicy i wyprowadź je na ekran w
            odwrotnej kolejności.
        Scanner odczyt1=new Scanner(System.in);
        int n=odczyt1.nextInt();
        int liczba;
        int tabl[]=new int[n];
        for(int i=0; i<tabl.length;i++){

            tabl[i]=odczyt1.nextInt();
        }
        for (int i = tabl.length-1; i >=0 ; i--) {
            System.out.println(tabl[i]);
        }*/



        /*
                W tablicy jednowymiarowej przechowującą liczby całkowite znaleźć liczbę minimalną ciągu.
        Scanner odczyt1=new Scanner(System.in);
        int n=odczyt1.nextInt();
        int liczba;
        int max=0;
        int min=5464;
        int tabl[]=new int[n];
        for(int i=0; i<tabl.length;i++){

            tabl[i]=odczyt1.nextInt();
        }
        for (int i = 0; i < tabl.length; i++) {
            if(tabl[i]>max) max=tabl[i];
            if(tabl[i]<min) min=tabl[i];

        }
        System.out.println("Min "+min+" Max "+max);
    }
    */

       /*
        Napisz program, który odczytuje dany wyraz z konsoli tak długo aż natrafi na
        poprawnie wprowadzone hasło.*/
       /* Scanner odczyt1 = new Scanner(System.in);
        String haslo = odczyt1.nextLine();
        String wyraz = odczyt1.nextLine();
        while (!haslo.equals(wyraz)) {
            wyraz = odczyt1.nextLine();
        }*/

        /*W tablicy jednowymiarowej znajdź liczbę, która występuje najczęściej*/
       /* Scanner odczyt1 = new Scanner(System.in);
        int n = odczyt1.nextInt();
        int liczba;
        int pom = 0;
        int max = 0;
        int szukana = 0;
        int tabl[] = new int[n];
        for (int i = 0; i < tabl.length; i++) {
            tabl[i] = odczyt1.nextInt();
        }
        for (int i = 0; i < tabl.length; i++) {
            liczba = tabl[i];
            for (int j = 0; j < tabl.length; j++) {
                if (tabl[i] == tabl[j])
                    pom++;

            }
            if (pom > max) {
                max = pom;
                szukana=liczba;

            }
            pom = 0;
        }
        System.out.println(szukana); */


      /*  Dla danej tablicy liczb całkowitych oblicz średnią arytmetyczną oraz sumę ciągu*/
        Scanner odczyt1=new Scanner(System.in);
        int n=odczyt1.nextInt();
        int srednia;
        int suma=0;
        int tabl[]=new int[n];
        for(int i=0; i<tabl.length;i++){
            tabl[i]=odczyt1.nextInt();
        }
        for (int i = 0; i <tabl.length ; i++) {
            suma+=tabl[i];
        }
       srednia=suma/tabl.length;
        System.out.println(suma+" "+srednia);
    }
}
