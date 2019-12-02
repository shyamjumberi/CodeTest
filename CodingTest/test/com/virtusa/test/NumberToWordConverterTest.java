/**
 * 
 */
package com.virtusa.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.virtusa.service.NumberToWordConverterService;
import com.virtusa.service.impl.NumberToWordConverterServiceImpl;
import com.virtusa.test.exception.InvalidNumberException;


/**
 * @author jikriyas
 *
 */
public class NumberToWordConverterTest {
	
	private NumberToWordConverterService service; 
	
	@Before
	public void init() {
		service = new NumberToWordConverterServiceImpl();
	}
	
	@Test(expected = InvalidNumberException.class)
	public void NumberToWordConverter_invalidNumber() throws Exception {
		service.convertNumberToWord(0);
	}

	
	@Test
	public void NumberToWordConverter_success_1234() throws Exception {
		String result  = service.convertNumberToWord(1234);
		Assert.assertEquals("one thousand two hundred and thirty four", result);
	}

	@Test
	public void NumberToWordConverter_success_3436789() throws Exception {
		String result  = service.convertNumberToWord(3436789);
		Assert.assertEquals("thirty four lack thirty six thousand seven hundred and eighty nine", result);
	} 
	
	@Test
	public void NumberToWordConverter_success_105() throws Exception {
		String result  = service.convertNumberToWord(105);
		Assert.assertEquals("one hundred and five", result);
	}

	@Test
	public void NumberToWordConverter_success_21() throws Exception {
		String result  = service.convertNumberToWord(21);
		Assert.assertEquals("twenty one", result);
	}
	
	@Test
	public void NumberToWordConverter_success_1() throws Exception {
		String result  = service.convertNumberToWord(1);
		Assert.assertEquals("one", result);
	}
}
