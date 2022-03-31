//ExHeranca.java

class Funcionario
{
	String Nome, Email, Cargo;
	float Salario;
	void setDados(String n, String e, String c, float s)
	{
	Nome = n;
	Email = e;
	Cargo = c;
	Salario = s;
	}
       }

class Programador extends Funcionario
{
	String Ling, SistOp;
	void setLing(String lin, String so)
	{
	Ling = lin;
	SistOp = so;
	}
       }

class ExHeranca
{
	public static void main(String args[])
	{
	Programador Prog = new Programador();
	Prog.setLing("Java", "Linux");
	Prog.setDados("XXXXX","xxx@xxx.com.br","Prog.Senior",3000);

		System.out.println("Nome Programador: " + Prog.Nome);
		System.out.println("Cargo: " + Prog.Cargo);
		System.out.println("Linguagem: " + Prog.Ling);
		System.out.println("Salario: " + Prog.Salario);
		System.out.println("Email: " + Prog.Email);
		}
	}