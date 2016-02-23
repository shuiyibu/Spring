/**
 * 
 */
package req;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author langdylan
 *
 */
public class Student
{
	private Integer	age;
	private String	name;

	@Required
	/**
	 * @return the age
	 */
	public Integer getAge()
	{
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age)
	{
		this.age = age;
	}

	@Required
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

}
