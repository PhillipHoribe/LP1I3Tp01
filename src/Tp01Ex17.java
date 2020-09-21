import java.util.Scanner;

public class Tp01Ex17 {
	public static void main(String[] args) {
		Scanner valor1 = new Scanner(System.in);
		System.out.printf("X :");
		double x = valor1.nextInt();
		Scanner valor2 = new Scanner(System.in);
		System.out.printf("Y :");	
		double y = valor2.nextInt();
		System.out.printf("X elevado a Y %f", Math.pow(x, y));
		
	}
}	
	
