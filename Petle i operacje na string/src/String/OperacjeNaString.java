package String;
import java.util.Scanner;

public class OperacjeNaString {
    public static void main(String[] args) {
        /* Program sprawdzający czy podany napis jest w formacie kodu pocztowego
         */
     /*  String kod;
        char znak;
        int cyfry=0; //liczba cyfr w kodzie pocztowym
        Scanner odczyt1=new Scanner(System.in);
        System.out.println("Podaj kod pocztowy: ");
        kod=odczyt1.nextLine();
            for(int j=0; j<kod.length(); j++)
            {
                if(j!=2) {
                    znak = kod.charAt(j);
                    if(Character.isDigit(znak)){
                       cyfry++;
                    }
                }
           }
            if(cyfry==5 &&kod.indexOf("-")==2 && kod.length()==6) System.out.println("Prawidłowy kod pocztowy");
            else System.out.println(("Zły kod pocztowy"));
   */

       /* Program który sprawdza czy imie jest męskie czy żeńskie
        String imie;
        boolean czydamskie;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imię ");
        imie = odczyt.nextLine();
        czydamskie=imie.endsWith("a");
        if (czydamskie==true){
            System.out.println("Imię damskie");
        }
        else {
            System.out.println("Imię męskie");
        }
        */
        /* Program sprawdzający ilość małych liter */
       /* String wyraz;
        char litera;
        int ilosc=0;
        Scanner odczyt2 = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        wyraz = odczyt2.nextLine();
        for (int j = 0; j < wyraz.length(); j++) {
            litera = wyraz.charAt(j);
            if (litera > 96 && litera < 123) {
                System.out.println("Występuje mała litera: " + litera + " na pozycji: " + j);
                ilosc++;
            }
        }
        System.out.println("Ilość małych liter w słowie: "+ilosc);
        */

        /* Program sprawdzający ilość dzielników liczby */

int dzielniki=0;
        Scanner odczyt3=new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = odczyt3.nextInt();
        for(int i=1; i<=liczba; i++) {
            if (liczba % i == 0) {
                dzielniki++;
                System.out.println("Dzielnikiem jest: " + i);
            }
        }
        System.out.println("Liczba ma "+dzielniki+" dzielników");
    }
}
