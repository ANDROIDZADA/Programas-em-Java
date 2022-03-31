//CalcSoma.java

import java.io.*;

class CalcSoma {

	public static void main(String args[]) throws IOException {

		BufferedReader Teclado1 = new BufferedReader(new InputStreamReader(System.in));

		float num1, num2, resultado;

		System.out.println("Digite um número: ");
		num1 = Float.parseFloat(Teclado1.readLine());
		System.out.println("Digite outro número: ");
		num2 = Float.parseFloat(Teclado1.readLine());

		resultado = num1 + num2;

		System.out.println(num1 + " + " + num2 + " = " + resultado);

	}
}
