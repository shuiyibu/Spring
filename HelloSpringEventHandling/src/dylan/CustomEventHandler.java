/**
 * 
 */
package dylan;

import org.springframework.context.ApplicationListener;

/**
 * @author langdylan
 *
 *         Feb 24, 2016 12:27:29 PM
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent>
{

	@Override
	public void onApplicationEvent(CustomEvent customEvent)
	{
		// TODO Auto-generated method stub
		System.out.println(customEvent.toString());
	}

}
