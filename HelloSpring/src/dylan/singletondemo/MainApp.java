/**
 * 
 */
package dylan.singletondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author langdylan
 *
 */
public class MainApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("s_helloWorld");
		helloWorld.setMessage("I am from helloWorld......");
		helloWorld.getMessage();
		
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("s_helloWorld");
		helloWorld2.getMessage();
	}
}
