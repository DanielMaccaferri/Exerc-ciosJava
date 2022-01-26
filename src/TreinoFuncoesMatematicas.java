public class TreinoFuncoesMatematicas {
	public static void main(String[] args) {
		double h = 6.0;
		double p = 36;
		double z = -6.0;
		double l = 2.0;
		double o = 3.0;
		double delta;
		double a = 4;
		double b = 5;
		double c = 6;		
		double x1;
		double x2;
		
		double C,F,G;
		
		C = Math.sqrt(h);
		F = Math.sqrt(p);
		G = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + h + " = " + C);
		System.out.println("Raiz quadrada de " + p + " = " + F);
		System.out.println("Raiz quadrada de " + 25.0 + " = " + G );
		
		C = Math.pow(h, l);
		F = Math.pow(l, 3.0);
		G = Math.pow(o, 100.0);
		System.out.println(h + " elevado a " + l + " = " + C );
		System.out.println(l + " elevado a " + l + 3.0 + " = " + F);
		System.out.println(o + " elevado a " + 100.0 + " = " + G); // Potenciação
		
		C = Math.abs(z);
		F = Math.abs(3.0);
		
		System.out.println("O valor absoluto de " + z + " = " + C); // Tirar o sinal negativo caso exista
		System.out.println("O valor absoluto de " + 3.0 + " = " + F); // Tirar o sinal negativo caso exista
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		System.out.println(x1);
		System.out.println(x2);
	}	
}
