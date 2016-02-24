/**
 * 
 */
package dylan.ic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author langdylan Feb 7, 2016 2:14:07 PM
 */
public class MainApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("Beans.xml");
		JavaCollection javaCollection = (JavaCollection) context.getBean("javaCollection");

		javaCollection.getAddressList();
		javaCollection.getAddressSet();
		javaCollection.getAddressMap();
		javaCollection.getAddressProp();

	}

}
