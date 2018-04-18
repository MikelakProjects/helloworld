package helloworld;

/**
 * Hemos desacoplado el código de la implementación particular, definiéndola en un fichero .properties
 * Lo siguiente será refactorizar con Spring, porque aún quedan problemas en el diseño: hemos tenido que escribir
 * un montón de "glue code" para unir las partes de la aplicación, mientras esas partes permanecían débilmente acopladas.
 * Otro problema es que aún tenemos que asignar la implementación de las interfaces manualmente. 
 * @author mikelak
 *
 */
public class HelloWorld {

	public static void main(String[] args) {	
		
		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		
		mr.setMessageProvider(mp);
		mr.render();
	}
}
