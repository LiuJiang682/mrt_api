package au.gov.vic.ecodev.mrt.template.processor.model;

import java.util.List;

public interface Template {

	void put(final String key, final List<String> values);
	List<String> get(final String key);
	
	List<String> getKeys();
}
