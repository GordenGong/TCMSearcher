package core.service;

public class PatientException extends RuntimeException {

	public PatientException() {
	}

	public PatientException(String message) {
		super(message);
	}

	public PatientException(Throwable cause) {
		super(cause);
	}

	public PatientException(String message, Throwable cause) {
		super(message, cause);
	}

	public PatientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
