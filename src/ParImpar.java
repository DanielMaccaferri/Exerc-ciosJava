import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;

		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � �mpar");
		}
		sc.close();
	}
}
