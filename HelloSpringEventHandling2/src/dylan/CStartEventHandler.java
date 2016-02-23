/**
 * 
 */
package dylan;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author langdylan
 *
 * Feb 23, 2016 10:49:48 PM
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent>
{

	@Override
	public void onApplicationEvent(ContextStartedEvent event)
	{
		// TODO Auto-generated method stub
		System.out.println("ContextStartedEvent Received...");
	}

}
