import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numFunc = 0;
		double horasTrab = 0;
		double salHoras = 0;
		double calcSal = 0;

		numFunc = sc.nextInt();
		horasTrab = sc.nextDouble();
		salHoras = sc.nextDouble();

		calcSal = horasTrab * salHoras;
		System.out.printf("O numFunc recebe o valor de salario de %.2f%n", calcSal);

	}

}
