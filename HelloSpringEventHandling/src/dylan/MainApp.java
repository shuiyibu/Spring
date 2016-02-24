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

		CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");
		customEventPublisher.publish();
		customEventPublisher.publish();

	}

}
