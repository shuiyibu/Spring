/**
 * 
 */
package dylan.prototypedemo;

/**
 * @author langdylan
 *
 */
public class HelloWorld
{
	private String message;

	/**
	 * @return the message
	 */
	public void getMessage()
	{
		System.out.println("Your message:" + message);
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public void init()
	{
		System.out.println("This Bean is going to through init...");
	}

	public void destroy()
	{
		System.out.println("This bean will destroy now...");
	}
}
