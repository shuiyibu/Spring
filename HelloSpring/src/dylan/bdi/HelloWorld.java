/**
 * 
 */
package dylan.bdi;

/**
 * @author langdylan
 *
 */
public class HelloWorld
{
	private String	message;
	private String	message2;

	/**
	 * @return the message
	 */
	public String getMessage()
	{
		System.out.println("World message: " + message);
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

	/**
	 * @return the message2
	 */
	public String getMessage2()
	{
		System.out.println("World message2: " + message2);
		return message2;
	}

	/**
	 * @param message2
	 *            the message2 to set
	 */
	public void setMessage2(String message2)
	{
		this.message2 = message2;
	}

}
