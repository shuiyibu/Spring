/**
 * 
 */
package dylan;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author langdylan
 *
 *         Feb 24, 2016 12:16:42 PM
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware
{
	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher)
	{
		// TODO Auto-generated method stub
		this.publisher = publisher;

	}

	public void publish()
	{
		CustomEvent customEvent = new CustomEvent(this);
		publisher.publishEvent(customEvent);
	}
}
