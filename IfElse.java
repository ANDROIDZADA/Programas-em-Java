//IfExemplo.java

import java.io.*;

public class IfElse {

static DataInputStream LeTel;
static int DadoLido;

	public static void main(String[] args) throws IOException {

	LeTel = new DataInputStream(System.in);
	System.out.println("Digite um acesso: ");
	DadoLido = LeTel.readInt();

	if (DadoLido == 1) {
	System.out.println("Acesso à Mazé");
	}
	if (DadoLido == 2) {
	System.out.println("Acesso ao Jared");
	}
	if (DadoLido == 3) {
	System.out.println("Acesso ao Papai Rubens");
}
}
}

