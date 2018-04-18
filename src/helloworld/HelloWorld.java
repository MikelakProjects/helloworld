package helloworld;

/**
 * Para separar la aplicación en dos componentes, creamos dos interfaces y las clases que las implementan. 
 * No obstante, sigue habiendo un problema. Si queremos cambiar la implementación, hemos de cambiar el código,
 * forzosamente. Para evitar esto, crearemos una clase Factory (en la rama3)
 * @author mikelak
 *
 */
public class HelloWorld {

	public static void main(String[] args) {	
		
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		
		mr.setMessageProvider(mp);
		mr.render();
	}
}
