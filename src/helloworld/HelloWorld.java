package helloworld;

/**
 * Hacemos que sea algo más configurable (extensible dicen en el libro) pintando el valor que le pasemos por parámetro
 * de entrada, y si no se pasa ninguno, pintará el mensaje por defecto.
 * 
 * No obstante, se podría hacer mucho más "extensible". Por ejemplo, el componente que pinta el mensaje es el mismo
 * que lo obtiene. Cambiar uno supone cambiar el otro. Un mejor diseño será separar ambos componentes.
 * 
 * @author mikelak
 *
 */
public class HelloWorld {

	public static void main(String[] args) {	
		
		if (args.length > 0) {
			System.out.println(args[0]);
		}
		else {
			System.out.println("Hello, world!");
		}		
	}
}
