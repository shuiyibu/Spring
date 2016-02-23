/**
 * 
 */
package jsp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author langdylan Feb 12, 2016 10:12:35 PM
 */
public class HelloWorld
{
	private String message;

	@Autowired
	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage()
	{
		System.out.println("Your message: " + message);
		return message;
	}

	@PostConstruct
	public void init()
	{
		System.out.println("Bean is going through init...");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("Bean will destroy now...");
	}
}
