package com.devsuperior.bds02.services.exceptions;

/**
 * @author Kalleo
 *
 */
public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
		
}
