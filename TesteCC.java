//Exemplo_Encapsulamento

//Conta_Corrente.java (CC)

class ContaCorrente
{
	private int ContaCorrente;
	private String NomeCliente;
	private float Saldo;
	public void setSaldo(float S) //metodo setSaldo
	{
		if(S != 0)
			Saldo = S;
			else
		System.out.println("Erro ao setar/passar o saldo!");
		}
	public void setNomeCliente(String nom) //metodo setNomeCliente
	{
		if(nom != "")
			NomeCliente = nom;
		else
			System.out.println("Erro ao setar/passar o nome!");
			}
		public void setContaCorrente(int CC) //metodo setCC
		{
			if(CC != 0)
				ContaCorrente = CC;
			else
				System.out.println("Erro ao setar/passar a CC!");
			}
			public void Exibe() //método exibir tudo
			{
				System.out.println("Nome cliente: " + NomeCliente);
				System.out.println("Conta Corrente: " + ContaCorrente);
				System.out.println("Saldo: " + Saldo);
			}
		}

//TesteCC.java

class TesteCC
{
	static ContaCorrente Teste;

	public static void main(String args[])
	{
		//ContaCorrente Teste;
		Teste = new ContaCorrente();

		//Teste.NomeCliente = "Jair";
		//Teste.ContaCorrente = 1111;
		//Teste.Saldo = 2000;
		Teste.setNomeCliente("Jair");
		Teste.setContaCorrente(1111);
		Teste.setSaldo(2000); //idem
		//System.out.println(Teste.NomeCliente);
		//System.out.println(Teste.Saldo);
		System.out.println("Exibir usando o método Exibe()");
		Teste.Exibe();
	}
}


