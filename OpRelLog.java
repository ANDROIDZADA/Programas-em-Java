
//OpRelLog.java

class OpRelLog {

public static void main(String[] args) {

	int a = 20, b = 30, c = 1, d = 20;

	System.out.println("a = 20, b = 30, c = 1, d = 20");
	System.out.println("\n\nOperadores Relacionais: ");
	System.out.println(b + " < " + a + " -> " + (b < a));
	System.out.println(a + " == " + d + " -> " + (a == d));
	System.out.println(c + " > " + b + " -> " + (c > b));
	System.out.println(a + " != " + d + " -> " + (a != d));
	System.out.println(a + " < " + d + " -> " + (a < d));
	System.out.println(a + " <= " + d + " -> " + (a <= d));
	System.out.println(c + " >= " + b + " -> " + (c >= b));
	System.out.println("\n\nOperadores Lógicos: ");
	System.out.println("(b < a || c == 1) -> " + (b < a || c == 1));
	System.out.println("(a == b && d != a) -> " + (a == b && d != a));
	System.out.println("(!(c > b)) -> " + (!(c > b)));

} }