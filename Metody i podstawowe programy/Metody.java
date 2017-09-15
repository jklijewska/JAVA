package pl.kurs.hello;

public class Metody {
	public static void main(String[] args){
		System.out.println("Start");
		int suma= dodaj(2,5);
		System.out.println("Suma="+suma);
		System.out.println("End");
		
		//PÊTLA WHILE
		int i=0;
		while(i<5){
			System.out.println(i);
			i++;
		}
		do{System.out.println(i);
		i++;}
		while(i<20);
		
		
	}

	public static int dodaj(int a, int b){
		return a+b;
	}
	
}
