//LeTeclado2.java

import java.io.*;

class LeTeclado2
{
public static void main (String args[])
 {
 try
 {
 BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
 String message;
 System.out.println("Digite um texto qualquer: ");
 message = stdin.readLine();
 System.out.println("Você digitou " + message);
 }
 catch(Exception erro)
 {
 System.out.println(erro.getMessage());
 erro.printStackTrace();
 }
 }
 }