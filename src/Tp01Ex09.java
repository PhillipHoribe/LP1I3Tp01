import java.util.Scanner;

public class Tp01Ex09 {
	public static void main(String[] args) {
		Scanner valor1 = new Scanner(System.in);
		System.out.printf("Resistencia :");	
		double a = valor1.nextInt();	
		Scanner valor2 = new Scanner(System.in);
		System.out.printf("Corente eletrica :");	
		double b = valor2.nextInt();
		System.out.printf("tensão eletrica: %fV",(a * b));
	}
}