package helloworld;

/**
 * Esta definirá la interfaz del componente de renderizado.
 * Será implementada por todos los componentes que puedan renderizar mensajes. 
 * @author mikelak
 *
 */
public interface MessageRenderer {

	void render();
	void setMessageProvider(MessageProvider provider);
	MessageProvider getMessageProvider();
}
