import java.util.Scanner;

public class DiferencaABCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0; int B = 0; int C = 0; int D = 0;
		int DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENCA = (A*B)-(C*D);
		sc.close();
		System.out.println("DIFERENCA = " + DIFERENCA);
	}

}
