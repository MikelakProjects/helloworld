package helloworld;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Con esta clase Factory conseguimos que se carguen las implementaciones que queremos con sólo modificar el fichero
 * .properties.
 * Al integrar el proyecto en el framework Spring, esta clase ya no es necesaria. 
 * @author mikelak
 *
 */

public class MessageSupportFactory {

	// Patrón Singleton
	private static MessageSupportFactory instance;
	
	private Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;
	
	private MessageSupportFactory() {
		props = new Properties();
		
		try {
			props.load(new FileInputStream("src/resources/msf.properties"));
			
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			
			renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
			provider = (MessageProvider) Class.forName(providerClass).newInstance();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	// Patrón Singleton
	static {
		instance = new MessageSupportFactory();
	}
	
	public static MessageSupportFactory getInstance() {
		return instance;
	}
	
	public MessageRenderer getMessageRenderer() {
		return renderer;
	}
	
	public MessageProvider getMessageProvider() {
		return provider;
	}
}
