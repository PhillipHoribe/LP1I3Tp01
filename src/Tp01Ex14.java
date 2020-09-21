import java.util.Scanner;

public class Tp01Ex14 {
	public static void main(String[] args) {
	Scanner valor1 = new Scanner(System.in);
	System.out.printf("Raio da esfera :");	
	double a = valor1.nextInt();
	double b = (4 * (3.14 * Math.pow(a,3)))/3;
	Scanner valor2 = new Scanner(System.in);
	System.out.printf("aresta do cubo :");	
	double c = valor2.nextInt();
	double d = Math.pow(c,3);
	System.out.printf("volume livre = %f", d - b);
	}
}