/**
 * 
 */
package dylan.iib;

/**
 * @author langdylan Feb 7, 2016 11:17:44 AM
 */
public class TextEditor
{
	private SpellChecker spellChecker;

	/**
	 * @return the spellChecker
	 */
	public SpellChecker getSpellChecker()
	{
		return spellChecker;
	}

	/**
	 * @param spellChecker
	 *            the spellChecker to set
	 */
	public void setSpellChecker(SpellChecker spellChecker)
	{
		System.out.println("Inside setSpellChecker...");
		this.spellChecker = spellChecker;
	}

	public void spellCheck()
	{
		spellChecker.checkSpell();
	}
}
