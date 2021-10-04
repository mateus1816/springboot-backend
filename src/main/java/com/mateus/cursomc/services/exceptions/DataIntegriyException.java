package com.mateus.cursomc.services.exceptions;

public class DataIntegriyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataIntegriyException(String msg) {
		super(msg);
	}
	
	public DataIntegriyException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
