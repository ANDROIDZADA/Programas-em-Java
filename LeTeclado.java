//LeTeclado.java

import java.io.*;

class LeTeclado {

	static DataInputStream LeTel;
	static String DadoLido;

	public static void main(String args[]) throws IOException {

		LeTel = new DataInputStream(System.in);
		System.out.println("Digite uma palavra qualquer: ");
		DadoLido = LeTel.readLine();
		System.out.println("Você digitou: " + DadoLido);
	}
}
