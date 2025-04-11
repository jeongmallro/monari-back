package com.monari.monariback.common.exception;

import com.monari.monariback.common.error.ErrorCode;

public class AuthException extends RuntimeException {

	private final ErrorCode errorCode;

	public AuthException(ErrorCode errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}
}
