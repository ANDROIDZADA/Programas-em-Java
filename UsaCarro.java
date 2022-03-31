//Carro.java

class Carro {

String Modelo;
int Ano;
double Preco;

Carro() // metodo construtor; tem o mesmo nome da classe mas sem o tipo.

{

Modelo = "Civic";
Ano = 2000;
Preco = 25000.00;
}

Carro(String M, int A, double P) // sobrecarga do metodo construtor com argumentos/parametros

{
Modelo = M;
Ano = A;
Preco = P;
}

public void ExibeCarro()
{
System.out.println(Modelo + " " + Ano + " " + Preco);
} }

class UsaCarro {

	public static void main(String args[])

	{

	Carro C1, C2, C3; //declaracao dos objetos C1, C2, C3 - só declaração, ou seja, ele não instancia/cria o objeto
	C1 = new Carro(); //instanciando o objeto C1 - é necessário instanciar ou inicializar objeto
	C2 = new Carro(); //idem
	C3 = new Carro("Celta", 2004, 18000.00); //idem - no caso com passagem de argumentos

	C2.Modelo = "Corolla";
	C2.Ano = 2002;
	C2.Preco = 35000.00;

	System.out.println("Mostra carros");
	C1.ExibeCarro();
	C2.ExibeCarro();
	C3.ExibeCarro();
	}
	}



