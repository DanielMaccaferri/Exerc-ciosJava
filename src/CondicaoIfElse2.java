import java.util.Scanner;

public class CondicaoIfElse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");// O bloco if ou else se contiverem apenas um comando posso apagar as chaves
		}

		else if (hora < 18) {
			System.out.println("Boa tarde");
		}

		else {
			System.out.println("Boa noite");
		}
		
		sc.close();

	}
}
