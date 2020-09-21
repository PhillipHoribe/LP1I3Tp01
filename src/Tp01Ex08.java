
import java.util.Scanner;

public class Tp01Ex08 {
	public static void main(String[] args) {
		System.out.println("Milha Maritima = 1852m");
		System.out.println("Quilometro = 1000m");
		System.out.println("");
	Scanner Conversor = new Scanner(System.in);
	System.out.printf("Digite o valor em Milhas Maritima:");	
	double a = Conversor.nextInt();
	System.out.printf("%f",(a * 1000) / 1852);
	}
}