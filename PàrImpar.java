//ParImpar.java

import java.io.*;

class PàrImpar
{
	public static void main(String args[]) throws IOException
	{
		int N, resto;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String message;
		System.out.println("Programa par - impar: ");
		System.out.println("Digite um número inteiro qualquer: ");
		message = stdin.readLine();
		N = Integer.parseInt(message);
			resto = N%2;

			if(resto == 1)
				System.out.println("N = " + N + " é impar");
				else
				System.out.println("N = " + N + " é par");
			}
		}
