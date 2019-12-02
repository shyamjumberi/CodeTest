/**
 * 
 */
package com.virtusa.service.impl;

import com.virtusa.service.NumberToWordConverterService;
import com.virtusa.test.exception.InvalidNumberException;

/**
 * @author jikriyas
 *
 */
public class NumberToWordConverterServiceImpl implements NumberToWordConverterService {


	/**
	 * Convert a number to word
	 * 
	 * @param number
	 * @return word
	 * @throws Exception
	 */
	public  String convertNumberToWord(int number) throws Exception  {
		final StringBuilder builder = new StringBuilder();
		if (number <= 0) {
			throw new InvalidNumberException("Invalid number");
		} else {
			numberToWord( (number / 10000000) % 100, " crore", builder);
			numberToWord( (number / 100000) % 100, " lack", builder);
			numberToWord( (number / 1000) % 100, " thousand", builder);
			numberToWord( (number / 100) % 10, " hundred and", builder);
			numberToWord( (number  % 100), " ", builder);
		}
		return builder.toString().trim();
	}
	
	private String numberToWord(int number, String word, StringBuilder builder) {
		
		final String[] ones = {"", " one", " two", " three", " four", " five", " six", " seven", "eight", "nine", "ten", "eleven", "twevle", 
				"thirteen", "fourtieen", "fifteen", "sixteen", "seventeen", "eighteen",  "nineteen"};
		
		final String[] tens = {"", "", " twenty", " thirty", " fourty" , " fifty" , " sixty", " seventy", " eighty" , " ninety"};
		
		if (number > 19) {
			builder.append(tens[number / 10] + " " + ones[number % 10].trim());
		} else {
			builder.append(ones[number]);
		}
		if (number > 0) {
			builder.append(word);
		}
		return builder.toString();
	}
}
