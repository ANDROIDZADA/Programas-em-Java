
import java.io.*;

class Calculadora {

	public static void main(String args[]) {

		try {
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			float num1, num2;
			System.out.println("Digite um número qualquer: ");
			num1 = stdin.readFloat();
			System.out.println("Digite outro número qualquer: ");
			num2 = stdin.readFloat();

			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

	}
	catch(Exception erro)
	{
		System.out.println(erro.getMessage());
		erro.printStackTrace();
	}
}
}
