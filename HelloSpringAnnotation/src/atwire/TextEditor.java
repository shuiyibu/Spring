/**
 * 
 */
package atwire;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author langdylan Feb 12, 2016 4:23:46 PM
 */
public class TextEditor
{
	private SpellChecker spellChecker;

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker)
	{
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker()
	{
		return spellChecker;
	}

	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}
}
