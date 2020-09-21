import java.util.Scanner;

public class Tp01Ex11 {
	public static void main(String[] args) {
	Scanner valor1 = new Scanner(System.in);
	System.out.printf("Diametro :");	
	double a = valor1.nextInt();
	System.out.printf("area:%f",(3.14 * ((a/2)*(a/2))));
	}
}