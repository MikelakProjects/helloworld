package helloworld;

/**
 * Aquí tenemos una implementación del "provider". 
 * @author mikelak
 *
 */
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World!";
	}
}
