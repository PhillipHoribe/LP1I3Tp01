import java.util.Scanner;

public class Tp01Ex13 {
	public static void main(String[] args) {
		Scanner valor1 = new Scanner(System.in);
		System.out.printf("Velocidade inicial(m/s) :");	
		double a = valor1.nextInt();
		Scanner valor2 = new Scanner(System.in);
		System.out.printf("Aceleração :");	
		double b = valor2.nextInt();
		Scanner valor3 = new Scanner(System.in);
		System.out.printf("Tempo :");	
		double c = valor3.nextInt();
		System.out.printf("Velocidade Final(km/h): %f ",(((b * c) + a))*3.6);
		}
}