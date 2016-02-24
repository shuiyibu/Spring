/**
 * 
 */
package dylan.bpp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author langdylan
 *Feb 6, 2016 11:06:46 PM
 */
public class MainApp
{
private static AbstractApplicationContext context;
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld=(HelloWorld)context.getBean("b_helloWorld");
		helloWorld.getMessage();
		context.registerShutdownHook();
	}

}
