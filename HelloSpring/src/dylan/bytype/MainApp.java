/**
 * 
 */
package dylan.bytype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author langdylan
 *Feb 7, 2016 11:19:58 AM
 */
public class MainApp
{
private static AbstractApplicationContext context;
	/**
	 * 
	 */
	public static void main(String[] args)
	{
		context=new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor3 textEditor=(TextEditor3)context.getBean("textEditor3");
		textEditor.getSpellChecker();
		textEditor.spellCheck();
	}
}
