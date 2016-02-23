/**
 * 
 */
package dylan;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author langdylan
 *
 * Feb 23, 2016 10:52:40 PM
 */
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent>
{

	@Override
	public void onApplicationEvent(ContextStoppedEvent event)
	{
		// TODO Auto-generated method stub
		System.out.println("ContextStoppedEvent Received...");
		
	}

}
