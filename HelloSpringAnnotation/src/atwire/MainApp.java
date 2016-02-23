/**
 * 
 */
package atwire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author langdylan Feb 12, 2016 12:22:00 PM
 */
public class MainApp
{
	private static AbstractApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor textEditor = (TextEditor)context.getBean("textEditor");

		textEditor.spellCheck();

	}

}
