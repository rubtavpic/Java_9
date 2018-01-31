interface A<String> {void out(String from);}
public class HolaMundoNuevo {
	static A<String> c = (s)->System.out.println(s);
	public static void main(String args[]) {
		System.out.println("Hola mundo antiguo, esto es Java 9");
		c.out("Hola mundo nuevo, esto es Java 9");
	}
}