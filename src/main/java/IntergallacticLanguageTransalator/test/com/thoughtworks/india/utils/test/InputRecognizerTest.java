package com.thoughtworks.india.utils.test;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.india.exception.InvalidCommodityException;
import com.thoughtworks.india.exception.InvalidRomanNumeralException;
import com.thoughtworks.india.utils.InputRecognizer;

public class InputRecognizerTest {

	InputRecognizer inputRecognizer;

	@Before
	public void setUp() throws Exception {
		inputRecognizer = new InputRecognizer();
	}

	@After
	public void tearDown() throws Exception {
		inputRecognizer = null;
	}

	@Test
	public void testRecognizeInputCase1() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(1, inputRecognizer.recognizeInput("glob is I"));
	}

	@Test
	public void testRecognizeInputCase2() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(1, inputRecognizer.recognizeInput("prok is V"));
	}

	@Test
	public void testRecognizeInputCase3() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(1, inputRecognizer.recognizeInput("pish is X"));
	}

	@Test
	public void testRecognizeInputCase4() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(1, inputRecognizer.recognizeInput("tegj is L"));
	}

	@Test
	public void testRecognizeInputCase5() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(2, inputRecognizer
				.recognizeInput("glob glob Silver is 34 Credits"));
	}

	@Test
	public void testRecognizeInputCase6() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(2, inputRecognizer
				.recognizeInput("glob prok Gold is 57800 Credits"));
	}

	@Test
	public void testRecognizeInputCase7() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(2, inputRecognizer
				.recognizeInput("pish pish Iron is 3910 Credits"));
	}

	@Test
	public void testRecognizeInputCase8() throws InvalidCommodityException,
			InvalidRomanNumeralException, InvalidRomanNumeralException {
		Assert.assertEquals(3, inputRecognizer
				.recognizeInput("how much is pish tegj glob glob ?"));
	}

	@Test
	public void testRecognizeInputCase9() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(4, inputRecognizer
				.recognizeInput("how many Credits is glob prok Silver ?"));
	}

	@Test
	public void testRecognizeInputCase10() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(4, inputRecognizer
				.recognizeInput("how many Credits is glob prok Gold ?"));
	}

	@Test
	public void testRecognizeInputCase11() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(4, inputRecognizer
				.recognizeInput("how many Credits is glob prok Iron ?"));
	}

	@Test
	public void testRecognizeInputCase12() throws InvalidCommodityException,
			InvalidRomanNumeralException {
		Assert.assertEquals(
				0,
				inputRecognizer
						.recognizeInput("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?"));
	}

}
