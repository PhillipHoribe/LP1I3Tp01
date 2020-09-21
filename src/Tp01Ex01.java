import java.util.Scanner;
public class Tp01Ex01 {
public static void main(String[] args) {
	Scanner base = new Scanner(System.in);
	System.out.printf("base:");		
	double a = base.nextInt();
	Scanner altura = new Scanner(System.in);
	System.out.printf("altura:");	
	double b = altura.nextInt();	
	System.out.printf("%f",(a * b));
	}
}
