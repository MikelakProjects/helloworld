package helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring carga en el contexto las clases (beans) indicadas en app-context.xml, al iniciar la aplicación. 
 * De este modo, las clases concretas (implementación) se definen por fuera, y la aplicación trata con sus interfaces.
 * @author mikelak
 *
 */
public class HelloWorld {

	public static void main(String[] args) {	
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		
		// getBean es un método "type-safe", que devuelve una instancia del tipo adecuado (el que se le pasa por parámetro)
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}
}
