
import java.util.Scanner;

public class Tp01Ex05 {
	public static void main(String[] args) {
	Scanner diametro = new Scanner(System.in);
	System.out.printf("diametro:");	
	double b = diametro.nextInt();	
	double c = b/2;
	System.out.printf("%f",(4 * 3.14 * (Math.pow(c,3))) / 3);
	}
}