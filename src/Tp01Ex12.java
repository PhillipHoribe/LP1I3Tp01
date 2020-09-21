import java.util.Scanner;

public class Tp01Ex12 {
	public static void main(String[] args) {
	Scanner valor1 = new Scanner(System.in);
	System.out.printf("Valor do Diametro :");	
	double d = valor1.nextInt();
	System.out.printf("Area: %f",(3.14 * (d /2 )));
	}
}