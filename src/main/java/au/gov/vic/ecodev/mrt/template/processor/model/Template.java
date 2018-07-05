package au.gov.vic.ecodev.mrt.template.processor.model;

import java.util.List;

public interface Template {

	void put(final String key, final List<String> values);
	void put(final String key, final TemplateValue value);
	List<String> get(final String key);
	TemplateValue getTemplateValue(final String key);
	
	List<String> getKeys();
}
