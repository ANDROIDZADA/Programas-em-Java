//Temp.java

import java.io.*;

class Temp
{
	private static float Celsius(float fahr)       //definicao do metodo Celsius
	{
		float C,F;
		C = (fahr - 32) * 5/9;
		return C;
			}    //fim do metodo Celsius
	public static void main(String args[]) throws IOException {

	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	float f, c;
	System.out.println("Digite a temperatura em Farenheit: ");
	f = Float.parseFloat(stdin.readLine());
	c = Celsius(f);
	System.out.println("Temperatura em Celsius: " + c);
}
}
