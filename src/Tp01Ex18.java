import java.util.Scanner;

public class Tp01Ex18 {
	public static void main(String[] args) {
		Scanner valor1 = new Scanner(System.in);
		System.out.printf("1- ");
		double a = valor1.nextInt();
		Scanner valor2 = new Scanner(System.in);
		System.out.printf("2- ");
		double b = valor2.nextInt();
		Scanner valor3 = new Scanner(System.in);
		System.out.printf("3- ");
		double c = valor3.nextInt();
		Scanner valor4 = new Scanner(System.in);
		System.out.printf("4- ");
		double d = valor4.nextInt();
		Scanner valor5 = new Scanner(System.in);
		System.out.printf("5- ");
		double e = valor5.nextInt();
		double soma = a + b + c + d + e;
		Scanner pagamento = new Scanner(System.in);
		System.out.printf("Pagamento:");
		double f = pagamento.nextInt();
		System.out.printf("o troco é: %f",f - soma);
	}
}
