import java.util.Scanner;

public class Tp01Ex16 {
	public static void main(String[] args) {
		Scanner valor1 = new Scanner(System.in);
		System.out.printf("Valor do Angulo :");	
		double a = valor1.nextInt();
		double rad = (Math.PI/180) * a;
		double seno = Math.sin(rad);
		double cosseno = Math.cos(rad);
		double tangente = Math.tan(rad);
		double secante = 1 / cosseno ;
		System.out.printf("Seno: %f" +  " Cosseno: %f" +  " Tangente: %f" +  " Secante: %f",seno,  cosseno, tangente, secante);
	}
}
