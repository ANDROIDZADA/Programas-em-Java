//Empresa2.java

import java.io.*;

class Empresa2 {

static DataInputStream LeTel;
static String nome;
static String id;
static String cnpj;
static String email;

public static void main(String args[]) throws IOException {

LeTel = new DataInputStream(System.in);
System.out.println("\nDigite o ID: ");
id = LeTel.readLine();
System.out.println("\nDigite o nome: ");
nome = LeTel.readLine();
System.out.println("\nDigite o CNPJ: ");
cnpj = LeTel.readLine();
System.out.println("\nDigite o e-mail: ");
email = LeTel.readLine();

System.out.println("\n\n\nID: " + id);
System.out.println("Nome: " + nome);
System.out.println("CNPJ: " + cnpj);
System.out.println("E-mail: " + email);

}
}
