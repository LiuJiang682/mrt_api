package au.gov.vic.ecodev.mrt.template.processor;

import java.io.File;
import java.util.List;

import au.gov.vic.ecodev.mrt.template.processor.context.TemplateProcessorContext;
import au.gov.vic.ecodev.mrt.template.processor.exception.TemplateProcessorException;

public interface TemplateProcessor {

	void setFileList(final List<File> files);
	void setTemplateProcessorContent(final TemplateProcessorContext context);
	void processFile() throws TemplateProcessorException;

}
