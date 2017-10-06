package Petle;

public class Petle {
    public static void main(String[] args){
        /*  Wypisywanie liczb od 2 do 100 w konsoli
     */
   // int i;
        System.out.print("Liczby od 1 do 100: ");
    for(int i=2; i<=100; i++){
        System.out.print(i+" ");
    }
    /*Wypisywanie liczb od 100 do 10 */
    System.out.print("\nLiczby od 100 do 10: ");
    for(int i=100; i>=10; i--){
        System.out.print(i+" ");
    }
    /*Suma wszystkich liczb od 1 do 100*/
    int suma=0;
    for(int i=1; i<=100; i++){
        suma=suma+i;
    }
    System.out.println("\nSuma :"+suma);
}
}
