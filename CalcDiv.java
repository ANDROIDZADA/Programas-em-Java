//CalcDiv.java

import java.io.*;

class CalcDiv {

static DataInputStream Teclado1;

public static void main(String args[]) throws IOException {

float x, y, z;

Teclado1 = new DataInputStream(System.in);

System.out.println("Digite o valor de x: ");
x = Float.parseFloat(Teclado1.readLine());
System.out.println("Digite o valor de y: ");
y = Float.parseFloat(Teclado1.readLine());

if (y == 0) {

System.out.println("Erro! Divisão por zero!");
}
else {
z = x / y;
System.out.println(x + " / " + y + " = " + z);
}
}
}