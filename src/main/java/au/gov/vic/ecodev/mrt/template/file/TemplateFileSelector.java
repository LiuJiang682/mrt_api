package au.gov.vic.ecodev.mrt.template.file;

import java.util.List;
import java.util.Optional;

public interface TemplateFileSelector {

	public void setSelectionFileDirectory(final String directory);
	
	public Optional<List<String>> getTemplateFileInDirectory(final List<String> dataTemplate) throws Exception;
}
