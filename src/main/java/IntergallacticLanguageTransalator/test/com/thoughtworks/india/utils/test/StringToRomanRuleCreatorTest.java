/**
 * 
 */
package com.thoughtworks.india.utils.test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.india.constants.RomanNumeral;
import com.thoughtworks.india.exception.InvalidRomanNumeralException;
import com.thoughtworks.india.model.Rule;
import com.thoughtworks.india.utils.StringToRomanRuleCreator;

/**
 * @author SUMIT
 * 
 */
public class StringToRomanRuleCreatorTest {

	StringToRomanRuleCreator stringToRomanRuleCreator;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		stringToRomanRuleCreator = new StringToRomanRuleCreator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		stringToRomanRuleCreator = null;
	}

	/**
	 * Test method for
	 * {@link com.thoughtworks.india.utils.StringToRomanRuleCreator#createRuleFromString(java.lang.String)}
	 * .
	 * 
	 * @throws InvalidRomanNumeralException
	 */
	@Test
	public final void testCreateRuleFromStringCase1()
			throws InvalidRomanNumeralException {
		Assert.assertEquals(new Rule("glob", RomanNumeral.I),
				stringToRomanRuleCreator.createRuleFromString("glob is I"));
	}

	@Test
	public final void testCreateRuleFromStringCase2()
			throws InvalidRomanNumeralException {
		Assert.assertEquals(new Rule("prok", RomanNumeral.V),
				stringToRomanRuleCreator.createRuleFromString("prok is V"));
	}

	@Test
	public final void testCreateRuleFromStringCase3()
			throws InvalidRomanNumeralException {
		Assert.assertEquals(new Rule("pish", RomanNumeral.X),
				stringToRomanRuleCreator.createRuleFromString("pish is X"));
	}

	@Test
	public final void testCreateRuleFromStringCase4()
			throws InvalidRomanNumeralException {
		Assert.assertEquals(new Rule("tegj", RomanNumeral.L),
				stringToRomanRuleCreator.createRuleFromString("tegj is L"));
	}

}
