package helloworld;

/**
 * 
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
