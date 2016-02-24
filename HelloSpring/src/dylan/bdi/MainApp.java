/**
 * 
 */
package dylan.bdi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author langdylan Feb 7, 2016 10:26:10 AM
 */
public class MainApp
{

	private static AbstractApplicationContext context;

	/**
	 * 
	 */

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("bd_helloWorld");
		helloWorld.getMessage();
		helloWorld.getMessage2();

		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		helloSpring.getMessage();
		helloSpring.getMessage2();
		helloSpring.getMessage3();
	}

}
