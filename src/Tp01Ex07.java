
	import java.util.Scanner;

	public class Tp01Ex07 {
		public static void main(String[] args) {
			Scanner valor1 = new Scanner(System.in);
			System.out.printf("primeiro valor:");	
			double a = valor1.nextInt();	
			Scanner valor2 = new Scanner(System.in);
			System.out.printf("segundo valor:");	
			double b = valor2.nextInt();
			System.out.printf("%f",Math.sqrt(a * b));
		}
	}

