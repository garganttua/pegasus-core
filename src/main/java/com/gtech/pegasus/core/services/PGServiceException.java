package com.gtech.pegasus.core.services;

public class PGServiceException extends Exception {

	public PGServiceException(PGServiceExceptionLabels label) {
		super( label.toString() );
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8802792679307062653L;

}