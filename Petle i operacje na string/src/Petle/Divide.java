package Petle;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
/*Napisz funkcję divide wyznaczającą iloraz dwóch zadanych liczb całkowitych. Działanie
funkcji sprawdź pisząc odpowiedni program.
Napisz funkcję z obsługą błędów. */
public class Divide {
    public static void main(String[] args) {
        double a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Give me two numbers ");
        try {
            a = in.nextDouble();
            b = in.nextDouble();
            System.out.println("Result of divide: " + divide(a, b));
            System.out.println(check(a,b));
        }
        catch (Exception wrong){
            System.err.println("I can't calculate it!");
        }

    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static String check(double a, double b) {
        double temp=divide(a, b);
        if (temp * b == a)
        {  return("Result is OK!");}
        else
        {return("Something is wrong.");}
        }}


