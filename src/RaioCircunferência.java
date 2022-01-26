import java.util.Locale;
import java.util.Scanner;

public class RaioCircunferência {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double area;
		double R = 0;
		
		R = sc.nextDouble();
		
		area = pi * (R * R);
		System.out.printf("area=%.4f%n", area);
		System.out.printf("area = %.5f%n ", area);
		
	}

}
