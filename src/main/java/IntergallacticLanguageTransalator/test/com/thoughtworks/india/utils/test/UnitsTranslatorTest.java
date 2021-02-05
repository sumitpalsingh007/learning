package com.thoughtworks.india.utils.test;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.india.constants.Comodity;
import com.thoughtworks.india.constants.RomanNumeral;
import com.thoughtworks.india.exception.InvalidCommodityException;
import com.thoughtworks.india.exception.InvalidRomanNumeralException;
import com.thoughtworks.india.model.Rate;
import com.thoughtworks.india.model.Rule;
import com.thoughtworks.india.utils.UnitsTranslator;

public class UnitsTranslatorTest {

	UnitsTranslator unitsTranslator;
	Map<String, Rule> rules;
	Map<String, Rate> rates;

	@Before
	public void setUp() throws Exception {
		unitsTranslator = new UnitsTranslator();
		rules = new HashMap<String, Rule>();
		rates = new HashMap<String, Rate>();

		Rule globRule = new Rule("glob", RomanNumeral.I);
		Rule pishRule = new Rule("pish", RomanNumeral.X);
		Rule porkRule = new Rule("prok", RomanNumeral.V);
		Rule tegj = new Rule("tegj ", RomanNumeral.L);

		Rate silverRate = new Rate(Comodity.SILVER, 17);
		Rate goldRate = new Rate(Comodity.GOLD, 14450);
		Rate ironRate = new Rate(Comodity.IRON, 195.5);

		rules.put("glob", globRule);
		rules.put("prok", porkRule);
		rules.put("pish", pishRule);
		rules.put("tegj", tegj);

		rates.put("Silver", silverRate);
		rates.put("Gold", goldRate);
		rates.put("Iron", ironRate);
	}

	@After
	public void tearDown() throws Exception {
		unitsTranslator = null;
		rules = null;
	}

	@Test
	public void testGetRateFromInputCase1()
			throws InvalidRomanNumeralException, InvalidCommodityException {
		Assert.assertEquals(new Rate(Comodity.SILVER, 17), unitsTranslator
				.getRateFromInput("glob glob Silver is 34 Credits", rules));
	}

	@Test
	public void testGetRateFromInputCase2()
			throws InvalidRomanNumeralException, InvalidCommodityException {
		Assert.assertEquals(new Rate(Comodity.GOLD, 14450), unitsTranslator
				.getRateFromInput("glob prok Gold is 57800 Credits", rules));
	}

	@Test
	public void testGetRateFromInputCase3()
			throws InvalidRomanNumeralException, InvalidCommodityException {
		Assert.assertEquals(new Rate(Comodity.IRON, 195.5), unitsTranslator
				.getRateFromInput("pish pish Iron is 3910 Credits", rules));
	}

	@Test
	public void testGetNumbersFromIntergalactic()
			throws InvalidRomanNumeralException, InvalidCommodityException {
		Assert.assertEquals(42, unitsTranslator.getNumbersFromIntergalactic(
				"how much is pish tegj glob glob", rules));
	}

	@Test
	public void testGetTotalAmountForCommodity()
			throws InvalidRomanNumeralException, InvalidCommodityException {
		Assert.assertEquals(68.0, unitsTranslator.getTotalAmountForCommodity(
				"how many Credits is glob prok Silver", rates, rules));
	}

}
