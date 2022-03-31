//Empresa.java

import java.io.*;

class Empresa {

int Id;
String Nome;
String CNPJ;
String Email;

	public static void main(String args[]) {

	Empresa emp = new Empresa();    //linha que instancia o objeto emp

	emp.Id = 1010;
	emp.Nome = "FITO";
	emp.CNPJ = "10101010";
	emp.Email = "fito@fito.br";

	System.out.println("ID: " + emp.Id);
	System.out.println("Nome: " + emp.Nome);
	System.out.println("CNPJ: " + emp.CNPJ);
	System.out.println("Email: " + emp.Email);

}
}


