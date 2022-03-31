//TesteLeTel.java

import java.io.*;

class TesteLeTel {

	static LeTel DadoLido;

public static void main(String args[]) throws IOException {

	int num1, num2, resultado;

	System.out.println("Digite um número inteiro qualquer: ");
	num1 = Integer.parseInt(DadoLido.LeTeclado());

	System.out.println("Digite outro número inteiro qualquer: ");
	num2 = Integer.parseInt(DadoLido.LeTeclado());

	resultado = num1 + num2;

	System.out.println("Resultado = " + resultado);

	}
	}