package pl.kurs.hello; //deklaracja pakietu
/** Klasa Hello - programowanie imperatywne <br>
 * Próba HTMLowego entera
 * 
 */
public class Hello {
	/** Funkcja wypisujaca znak na ekran	 
	 */
	public static void pisz(char c, int ile){
		for (int i=0; i<ile; i++){
		System.out.print(c);}
	}
	
	
	/** Funkcja uruchumieniowa
	 * @param args argumenty wiersza polecenia
	 * @return co zwraca funkcja
	 */

	public static void main(String[] args) {
			//komentarz na jedn¹ liniê
			/* komentarz d³u¿szy*/
		System.out.println("Start");
			//	System.out.println("Argument z konsoli: "+args[0]);
		int zmienna = 10;
			////IF
		if(zmienna==4){
			System.out.println("Warunek spe³niony");		
		} else {System.out.println("Nie wysz³o");}
			//FOR
		for(int i=0;i<10;i++){
			System.out.println("."+i);
		}
		System.out.println("Koniec");
	
//CHOINKA
/*	for (int a=1;a<10;a++){
		for(int b=1; b<a; b++){
			System.out.print("*");}
		System.out.println();
	}
	System.out.println("*\n*\n");*/
	
	//SZEŒCIOKAT

	int size =4;
	int lenght =size*2;
	//int akt=0;
	int aa =size;
	for(int i=1; i<=lenght;i++){ //i-aktualny wiersz
		if(i==1|| i==lenght){
			for(int j=1; j<=size; j++) {System.out.print(" ");}
			for(int j=1; j<=size; j++) {System.out.print("*");}
			System.out.println();
		}
		else{
			if(i<=size){
				for(int j=1; j<=(size-i); j++) {System.out.print(" ");}
				System.out.print("*");
				aa=aa+2;
				for(int j=1; j<=aa; j++) {System.out.print(" ");}
				System.out.print("*\n");} 
			else{
				System.out.print(" ");
				for(int j=1; j<(i-size); j++) {System.out.print(" ");}
				System.out.print("*");
				aa=aa-2;
				for(int j=1; j<=aa; j++) {System.out.print(" ");}
				System.out.print("*\n");
				}
			}
		}
			
			
		pisz('k', 5);
		
		
		
	}
	
}
