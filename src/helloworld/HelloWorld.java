package helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author mikelak
 *
 */
public class HelloWorld {

	public static void main(String[] args) {	
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("");
	}
}
