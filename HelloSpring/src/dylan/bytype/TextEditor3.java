/**
 * 
 */
package dylan.bytype;

/**
 * @author langdylan Feb 7, 2016 11:17:44 AM
 */
public class TextEditor3
{
	private SpellChecker3	spellChecker;
	private String			name;

	/**
	 * @return the spellChecker
	 */
	public SpellChecker3 getSpellChecker()
	{
		return spellChecker;
	}

	/**
	 * @param spellChecker
	 *            the spellChecker to set
	 */
	public void setSpellChecker(SpellChecker3 spellChecker)
	{
		System.out.println("Inside setSpellChecker...");
		this.spellChecker = spellChecker;
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
		spellChecker.checkSpell();
	}
}
