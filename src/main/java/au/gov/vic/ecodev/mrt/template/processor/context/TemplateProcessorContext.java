package au.gov.vic.ecodev.mrt.template.processor.context;

import au.gov.vic.ecodev.mrt.api.constants.LogSeverity;
import au.gov.vic.ecodev.mrt.map.services.MapServices;
import au.gov.vic.ecodev.mrt.template.criteria.TemplateCriteria;
import au.gov.vic.ecodev.mrt.template.processor.exception.TemplateProcessorException;
import au.gov.vic.ecodev.mrt.template.processor.model.Template;
import au.gov.vic.ecodev.mrt.template.properties.TemplateProperties;

public interface TemplateProcessorContext {

	boolean saveStatusLog(final LogSeverity severity, final String logMessage);
	boolean saveDataBean(final Template template);
	
	boolean addFailedFiles(final String fileName);
	boolean addPassedFiles(final String fileName);
	
	long getBatchId();
	
	TemplateProperties getTemplateContextProperty(final String templatePropertyName) throws TemplateProcessorException;

	TemplateProperties search(final TemplateCriteria criteria) throws TemplateProcessorException;
	MapServices getMapServices();
}
