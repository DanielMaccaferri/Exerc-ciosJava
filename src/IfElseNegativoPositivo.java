import java.util.Scanner;

public class IfElseNegativoPositivo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		if(num >= 0) {
			System.out.println("Esse n�mero � positivo");
		}
		else {
			System.out.println("Esse n�mero � negativo");
		}
		
		sc.close();
	}
}
