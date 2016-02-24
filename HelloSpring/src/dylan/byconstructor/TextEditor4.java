/**
 * 
 */
package dylan.byconstructor;

/**
 * @author langdylan Feb 7, 2016 11:17:44 AM
 */
public class TextEditor4
{
	private SpellChecker4	spellChecker2;
	private String			name;
	
	

	/**
	 * @param spellChecker2
	 * @param name
	 */
	public TextEditor4(SpellChecker4 spellChecker2, String name)
	{
		super();
		this.spellChecker2 = spellChecker2;
		this.name = name;
	}

	/**
	 * @return the spellChecker
	 */
	public SpellChecker4 getSpellChecker2()
	{
		return spellChecker2;
	}

	/**
	 * @param spellChecker
	 *            the spellChecker to set
	 */
	public void setSpellChecker2(SpellChecker4 spellChecker2)
	{
		System.out.println("Inside setSpellChecker4...");
		this.spellChecker2 = spellChecker2;
	}

	
	
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	public void spellCheck()
	{
		spellChecker2.checkSpell();
	}
}
