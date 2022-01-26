import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		double x = 10.353565;
		String nome = "Maria";
		int idade = 31;
		double renda = 3000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product1, price2);
		System.out.printf("Record: %d years old, %d and %c%n", age, code, gender);
		
		
		
		

		System.out.println("Olá mundo!");
		System.out.println("Brasil");
		System.out.printf("%.6f%n", x);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.5f%n", x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.5f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.6f%n", x);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.5f%n", x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.5f%n", x);
		// x = s + b;

		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
	}

}
