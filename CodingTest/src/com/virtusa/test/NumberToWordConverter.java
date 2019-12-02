/**
 * 
 */
package com.virtusa.test;

import com.virtusa.service.impl.NumberToWordConverterServiceImpl;

/**
 * @author jikriyas
 *
 */
public class NumberToWordConverter {
	
	
	public static void main(String[] args) throws Exception {
		int number = 105;
		NumberToWordConverterServiceImpl obj = new NumberToWordConverterServiceImpl();
		System.out.println(obj.convertNumberToWord(number));
	}

}
