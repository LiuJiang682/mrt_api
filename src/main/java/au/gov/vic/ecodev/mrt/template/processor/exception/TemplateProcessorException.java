package au.gov.vic.ecodev.mrt.template.processor.exception;

public class TemplateProcessorException extends Exception {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 4794840211400417431L;
	
	public TemplateProcessorException(final String message) {
		this(message, null);
	}

	public TemplateProcessorException(final String message, final Throwable t) {
		super(message, t);
	}
}
