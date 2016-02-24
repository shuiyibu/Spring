/**
 * 
 */
package dylan.byname;

/**
 * @author langdylan Feb 7, 2016 11:17:44 AM
 */
public class TextEditor2
{
	private SpellChecker2	spellChecker2;
	private String			name;

	/**
	 * @return the spellChecker
	 */
	public SpellChecker2 getSpellChecker2()
	{
		return spellChecker2;
	}

	/**
	 * @param spellChecker
	 *            the spellChecker to set
	 */
	public void setSpellChecker2(SpellChecker2 spellChecker2)
	{
		System.out.println("Inside setSpellChecker...");
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
