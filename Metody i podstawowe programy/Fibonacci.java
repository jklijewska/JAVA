package pl.kurs.hello;

public class Fibonacci {
	
	
	
	public static final int WARTOSC_MAX=300;
	
	public static void main(String[] args){
int a,b, suma;
a=1;
b=2;
while(a<WARTOSC_MAX){
	suma=a+b;
	System.out.println(suma);
	a=b;
	b=suma;
}
}
}
