/**
 * 
 */
package com.virtusa.test.exception;

/**
 * @author jikriyas
 *
 */
public class InvalidNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9029623518583809047L;

	public InvalidNumberException(String message) {
		super(message);
	}
	
	public InvalidNumberException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
