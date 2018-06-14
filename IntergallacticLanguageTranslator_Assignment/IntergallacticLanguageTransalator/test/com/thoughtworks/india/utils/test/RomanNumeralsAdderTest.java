package com.thoughtworks.india.utils.test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.india.constants.RomanNumeral;
import com.thoughtworks.india.exception.InvalidRomanNumeralException;
import com.thoughtworks.india.utils.RomanNumeralsAdder;

public class RomanNumeralsAdderTest {

	RomanNumeralsAdder romanNumeralsAdder;

	@Before
	public void setUp() throws Exception {
		romanNumeralsAdder = new RomanNumeralsAdder();
	}

	@After
	public void tearDown() throws Exception {
		romanNumeralsAdder = null;
	}

	@Test
	public void testGetTotalOfRomanNumeralsCase1() {

		List<RomanNumeral> inputList = new ArrayList<RomanNumeral>();
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.V);
		inputList.add(RomanNumeral.I);
		try {
			Assert.assertEquals(2006,
					romanNumeralsAdder.getTotalOfRomanNumerals(inputList));
		} catch (InvalidRomanNumeralException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testGetTotalOfRomanNumeralsCase2() {

		List<RomanNumeral> inputList = new ArrayList<RomanNumeral>();
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.C);
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.X);
		inputList.add(RomanNumeral.L);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.V);
		try {
			Assert.assertEquals(1944,
					romanNumeralsAdder.getTotalOfRomanNumerals(inputList));
		} catch (InvalidRomanNumeralException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testCheckValidRepetetionsInNumeralCase1() {

		List<RomanNumeral> inputList = new ArrayList<RomanNumeral>();
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.C);
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.X);
		inputList.add(RomanNumeral.L);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.V);
		Assert.assertEquals(true,
				romanNumeralsAdder.checkValidRepetetionsInNumeral(inputList));

	}

	@Test
	public void testCheckValidRepetetionsInNumeralCase2() {

		List<RomanNumeral> inputList = new ArrayList<RomanNumeral>();
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.C);
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.X);
		inputList.add(RomanNumeral.L);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.V);
		Assert.assertEquals(false,
				romanNumeralsAdder.checkValidRepetetionsInNumeral(inputList));

	}

	@Test
	public void testCheckValidRepetetionsInNumeralCase3() {

		List<RomanNumeral> inputList = new ArrayList<RomanNumeral>();
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.C);
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.X);
		inputList.add(RomanNumeral.L);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.V);
		inputList.add(RomanNumeral.V);
		Assert.assertEquals(false,
				romanNumeralsAdder.checkValidRepetetionsInNumeral(inputList));

	}

	@Test
	public void testCheckValidRepetetionsInNumeralCase4() {

		List<RomanNumeral> inputList = new ArrayList<RomanNumeral>();
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.C);
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.X);
		inputList.add(RomanNumeral.L);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.V);
		Assert.assertEquals(true,
				romanNumeralsAdder.checkValidRepetetionsInNumeral(inputList));

	}

	@Test
	public void testCheckValidSubtractiblesCase1() {

		List<RomanNumeral> inputList = new ArrayList<RomanNumeral>();
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.V);
		inputList.add(RomanNumeral.I);
		Assert.assertEquals(true,
				romanNumeralsAdder.checkValidSubtractibles(inputList));

	}

	@Test
	public void testCheckValidSubtractiblesCase2() {

		List<RomanNumeral> inputList = new ArrayList<RomanNumeral>();
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.C);
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.X);
		inputList.add(RomanNumeral.L);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.V);
		Assert.assertEquals(true,
				romanNumeralsAdder.checkValidSubtractibles(inputList));

	}

	@Test
	public void testCheckValidSubtractiblesCase3() {

		List<RomanNumeral> inputList = new ArrayList<RomanNumeral>();
		inputList.add(RomanNumeral.M);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.L);
		inputList.add(RomanNumeral.X);
		inputList.add(RomanNumeral.L);
		inputList.add(RomanNumeral.I);
		inputList.add(RomanNumeral.V);
		Assert.assertEquals(false,
				romanNumeralsAdder.checkValidSubtractibles(inputList));

	}

}
