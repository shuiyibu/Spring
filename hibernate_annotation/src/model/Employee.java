/**
 * 
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author langdylan
 *
 */
@Entity
@Table(name = "Employee")
public class Employee
{
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int		id;
	
	@Column(name="firstname")
	private String	firstName;
	
	@Column(name="lastname")
	private String	lastName;
	
	@Column(name="salary")
	private int		salary;

	public Employee()
	{
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param salary
	 * @param certificate
	 */
	public Employee(String firstName, String lastName, int salary)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

}
