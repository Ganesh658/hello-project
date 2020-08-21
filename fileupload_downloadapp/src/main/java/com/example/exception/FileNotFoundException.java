package com.example.exception;

public class FileNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public FileNotFoundException(String arg0) {
		super(arg0);
	}
}
