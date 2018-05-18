package au.gov.vic.ecodev.mrt.template.processor.update;

import java.util.List;

import au.gov.vic.ecodev.mrt.template.processor.exception.TemplateProcessorException;
import au.gov.vic.ecodev.mrt.template.processor.model.Template;
import au.gov.vic.ecodev.mrt.template.processor.persistent.Dao;

public interface TemplateUpdater {

	void setDaos(List<Dao> doas);
	void update(long sessionId, Template template) throws TemplateProcessorException;
	List<Class<? extends Dao>> getDaoClasses();
}
