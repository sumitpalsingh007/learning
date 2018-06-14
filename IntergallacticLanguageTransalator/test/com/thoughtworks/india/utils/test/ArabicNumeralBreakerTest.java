package com.thoughtworks.india.utils.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.india.utils.ArabicNumeralBreaker;

public class ArabicNumeralBreakerTest {

	ArabicNumeralBreaker arabicNumeralBreaker;

	@Before
	public void setUp() throws Exception {
		arabicNumeralBreaker = new ArabicNumeralBreaker();
	}

	@After
	public void tearDown() throws Exception {
		arabicNumeralBreaker = null;
	}

	@Test
	public final void testGetArabiciDigits() {
		List<Integer> outPutList = new ArrayList<Integer>();
		outPutList.add(10000);
		outPutList.add(2000);
		outPutList.add(300);
		outPutList.add(40);
		outPutList.add(5);
		Assert.assertEquals(outPutList,
				arabicNumeralBreaker.getArabiciDigits("12345"));
	}

}
