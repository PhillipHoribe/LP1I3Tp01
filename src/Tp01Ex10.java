import java.util.Scanner;

public class Tp01Ex10 {
public static void main(String[] args) {
	Scanner valor1 = new Scanner(System.in);
	System.out.printf("Temperatura em celsius :");	
	double a = valor1.nextInt();
	double x;
	x = ((a * 9) + 160)/5; 
	System.out.printf("Temperatura em Fahrenheit %f:",x);
	}
}