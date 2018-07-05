package au.gov.vic.ecodev.mrt.mail;

import au.gov.vic.ecodev.mrt.template.processor.context.TemplateProcessorContext;

public interface EmailBodyBuilder {

	void setTemplateProcessorContext(final TemplateProcessorContext templateProcessorContext);
	String build();
}
