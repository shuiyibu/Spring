/**
 * 
 */
package dylan;

import org.springframework.context.ApplicationEvent;

/**
 * @author langdylan
 *
 *         Feb 24, 2016 12:14:31 PM
 */
public class CustomEvent extends ApplicationEvent
{

	/**
	 * @param source
	 */
	public CustomEvent(Object source)
	{
		super(source);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "My Custom Event";
	}
}
