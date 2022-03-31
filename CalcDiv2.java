//CalcDiv2.java

import java.io.*;

class CalcDiv2 {

public static void main(String args[]) {

try {

	BufferedReader Teclado1 = new BufferedReader(new InputStreamReader(System.in));
	float x, y, z = 0;
	System.out.println("Digite o valor de X: ");
	x = Float.parseFloat(Teclado1.readLine());
	System.out.println("Digite o valor de Y: ");
	y = Float.parseFloat(Teclado1.readLine());


	if(y == 0)
		System.out.println("Erro! Divisão por zero!");
	else
		z = x / y;
		System.out.println(x + " / " + y + " = " + z); }

	catch(Exception erro)
	{
	System.out.println("Erro na entrada de dados!");
	}
}
}


