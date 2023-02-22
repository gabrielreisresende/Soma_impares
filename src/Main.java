import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, troca = 0, soma = 0;

		System.out.println("Digite dois números:");
		x = sc.nextInt();
		y = sc.nextInt();

		if (y > x) {
			troca = x;
			x = y;
			y = troca;
		}

		for (int i = y; i < x; i = i + 1) {
			if (i % 2 != 0)
				soma = soma + i;
		}
		System.out.println("SOMA DOS ÍMPARES = " + soma);

		sc.close();
	}

}
