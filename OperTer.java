//OperTer.java

class OperTer {

	public static void main (String[] args) {

		int n1 = 5, n2 = 8, ano = 2004;

		System.out.println("n1 = " + n1 + " , " + " n2 = " + n2 + " , " + " ano = 2016");

		System.out.println("Operador Ternário: ");
		System.out.println((n1 % 2) == 0? " n1 = Par " : " n1 = Impar ");
		System.out.println((n2 % 2) == 0? " n2 = Par " : " n2 = Impar ");
		System.out.println((((ano % 4) == 0 && (ano % 100) != 0) || (ano % 400) == 0) ? "Ano = Bissexto" : "Ano Não Bissexto");

	} }