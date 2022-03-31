//CalcSomaSwitch.java

import java.io.*;

class CalcSoma2
{
  static LeTel DadoLido; //DadoLido = objeto
  static Soma RSoma; //sem o static, não compila
  static NGrupoBib Nomes;

  public static void main(String args[]) throws IOException
  {
  System.out.println("Calculadora Soma:");
  System.out.println("\n1-Soma N. inteiro:");
  System.out.println("\n2-Soma N. reais:");
  System.out.println("\n3-Soma ou Concatena Strings:");
  System.out.println("\n4-Sair");
  System.out.println("\n\n-Qual opcao?");
  int op = Integer.parseInt(DadoLido.LeTeclado());

  switch(op)
  {
  case 1:
  {
  int num1, num2;
  System.out.println("Digite um numero inteiro qualquer:");
  num1 = Integer.parseInt(DadoLido.LeTeclado());
  System.out.println("Digite outro numero inteiro qualquer:");
  num2 = Integer.parseInt(DadoLido.LeTeclado());
  System.out.println("A soma de N inteiros= "+ RSoma.MSoma(num1,num2));
  break;
  }
  case 2:
  {
  float num1,num2;
  System.out.println("Digite um numero real qualquer:");
  num1 = Float.parseFloat(DadoLido.LeTeclado());
  System.out.println("Digite um outro numero qualquer:");
  num2 = Float.parseFloat(DadoLido.LeTeclado());
  System.out.println("A soma de N reais = " + RSoma.MSoma(num1,num2));
  break;
  }
  case 3:
  {
  String var1, var2;
  System.out.println("Digite uma palavra qualquer:");
  var1 = DadoLido.LeTeclado();
  System.out.println("Digite outra palavra qualquer:");
  var2 = DadoLido.LeTeclado();
  System.out.println("A concatenação = " + RSoma.MSoma(var1,var2));
  break;
  }
  case 4:
  System.out.println("\nEstou saindo....");
  break;
  default:
  System.out.println("\nOpcao invalido!!!!");
  }
  Nomes.NGrupoBib();
  }
  }
