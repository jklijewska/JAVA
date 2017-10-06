package Petle;

import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Give me tree numbers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        pitagoras(a, b, c);
    }

    public static void pitagoras(int a, int b, int c) {
        if ((a * a) + (b * b) == (c * c))
            System.out.println("You have pitagorean triple");
        else
            System.out.println("You don't have pitagorean triple");

    }
}
