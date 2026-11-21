package com.kodewala.exception;

public class InsufficientBalanceException extends RuntimeException {
	
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
