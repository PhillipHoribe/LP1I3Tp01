import java.util.Scanner;

public class Tp01Ex15 {
	public static void main(String[] args) {
		Scanner valor1 = new Scanner(System.in);
		System.out.printf("Valor do Dolar :");	
		double a = valor1.nextInt();
			Scanner valor2 = new Scanner(System.in);
			System.out.printf("Quantidade de dolar :");	
			double b = valor2.nextInt();
			System.out.printf("Valor em Reais: %f:",(a*b));	
	}
}
