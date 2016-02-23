/**
 * 
 */
package jsp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author langdylan
 * Feb 12, 2016 10:14:33 PM
 */
public class MainApp
{
	private static  AbstractApplicationContext context;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorld");
		helloWorld.getMessage();
		context.registerShutdownHook();

	}

}
