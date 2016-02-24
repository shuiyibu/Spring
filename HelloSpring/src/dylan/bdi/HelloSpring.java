/**
 * 
 */
package dylan.bdi;

/**
 * @author langdylan Feb 7, 2016 10:25:16 AM
 */
public class HelloSpring
{
	private String	message;
	private String	message2;
	private String	message3;

	/**
	 * @return the message
	 */
	public String getMessage()
	{
		System.out.println("Spring message: " + message);
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
		System.out.println("Spring message2: " + message2);
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

	/**
	 * @return the message3
	 */
	public String getMessage3()
	{
		System.out.println("Spring message3: " + message3);
		return message3;
	}

	/**
	 * @param message3
	 *            the message3 to set
	 */
	public void setMessage3(String message3)
	{
		this.message3 = message3;
	}

}
