//Exemplo de Heranca com Super

class Pai
{

	int ano = 2005; //ano letivo
	String curso = "Fac Fito - Ci�ncia da Computa��o";
	}

class Filha extends Pai
{

	int ano = 4; //ano s�rie
	String disciplina = "Linguagem de Programa��o";

	void mostra()
	{
	System.out.println("Classe Pai ano: " + super.ano);
	System.out.println("Classe Pai curso: " + curso);
	System.out.println();
	System.out.println("Classe Filha ano: " + ano);
	System.out.println("Classe Filha disciplina: " + disciplina);
		}
		 }

class TesteHer
{
	public static void main(String args[])
	{
	Filha aluno = new Filha();
	aluno.mostra();
	}
	}




