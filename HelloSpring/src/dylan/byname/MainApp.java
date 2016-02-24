/**
 * 
 */
package dylan.byname;

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
		TextEditor2 textEditor=(TextEditor2)context.getBean("textEditor2");
		textEditor.getSpellChecker2();
		textEditor.spellCheck();
	}
}
