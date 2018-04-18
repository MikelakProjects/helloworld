package helloworld;

/**
 * Hemos desacoplado el código de la implementación particular, definiéndola en un fichero .properties
 * Lo siguiente será refactorizar con Spring
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
