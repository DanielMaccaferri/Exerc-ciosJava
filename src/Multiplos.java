import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int y;
		int m;

	
		y = sc.nextInt();
		m = sc.nextInt();

		if (y % m == 0 || m % y == 0) {

			System.out.println("S�o Multiplos");
		} else {
			System.out.println("N�o s�o M�ltiplos");
		}

	}
}
