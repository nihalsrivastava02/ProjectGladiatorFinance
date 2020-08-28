package com.lti.exception;

public class CustomerServiceException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public CustomerServiceException(String message) {
		super(message);
	}

	public CustomerServiceException() {
		super();
	}

	public CustomerServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CustomerServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerServiceException(Throwable cause) {
		super(cause);
	}
}