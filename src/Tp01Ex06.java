import java.util.Scanner;

public class Tp01Ex06 {
	public static void main(String[] args) {
		Scanner valor1 = new Scanner(System.in);
		System.out.printf("primeiro valor:");	
		double a = valor1.nextInt();	
		Scanner valor2 = new Scanner(System.in);
		System.out.printf("segundo valor:");	
		double b = valor2.nextInt();
		Scanner valor3 = new Scanner(System.in);
		System.out.printf("terceiro valor:");	
		double c = valor3.nextInt();
		Scanner valor4 = new Scanner(System.in);
		System.out.printf("quarto valor:");	
		double d = valor4.nextInt();
		System.out.printf("%f",(a + b + c + d) / 4);
	}
}