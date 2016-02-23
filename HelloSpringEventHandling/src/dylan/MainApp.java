/**
 * 
 */
package dylan;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * @author langdylan
 *
 *         Feb 23, 2016 10:56:22 PM
 */
public class MainApp
{
	private static ConfigurableApplicationContext context;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("Beans.xml");

		// raise a start event
		context.start();

		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getMessage();

		// raise a stop event
		context.stop();
	}

}
