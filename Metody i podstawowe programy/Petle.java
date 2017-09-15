package pl.kurs.hello;

public class Petle {

	public static void main(String[] args){
		for(int i=0; i<10; i++){
			
			if (i==5){
				continue;
			}
			System.out.println("wartosc i="+i);
		}
	}
}
