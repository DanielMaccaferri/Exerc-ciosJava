import java.util.Scanner;

public class SomaValoresInteiros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int x;
//		int y;
//		int soma;
		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("Soma = " + soma);
		sc.close();
		
	}

}
