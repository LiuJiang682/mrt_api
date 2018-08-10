package au.gov.vic.ecodev.mrt.template.loader.fsm.model;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface Message {

	public List<File> getFileList();
	public void setFileList(final List<File> fileList);
	
	public List<String> getFileNames();
	public void setFileNames(final List<String> fileNames);
	
	public List<String> getAbsoluteFileNames();
	public void setAbsoluteFileNames(final List<String> absolutionFileNames);
	
	public List<String> getTemplateClasses();
	public void setTemplateClasses(final List<String> templateClasses);
	
	public long getBatchId();
	public void setBatchId(final long batchId);
	
	public List<File> getPassedFiles();
	public void setPassedFiles(final List<File> passedFileNames);
	
	public List<File> getFailedFiles();
	public void setFailedFiles(final List<File> failedFileNames);
	
	public String getLogFileName();
	public void setLogFileName(final String logFileName);
	
	public String getDirectErrorMessage();
	public void setDirectErrorMessage(final String string);
	
	public List<Map<String, Object>> getTemplateOwnerEmail();
	public void setTemplateOwnerEmail(final List<Map<String, Object>> owenerEmails);
	
	public List<String> getBoreHoleIdsOutSideTenement();
	public void setBoreHoleIdsOutSideTenement(final List<String> boreHoleIds);
	
	public List<String> getSampleIdsOutSideTenement();
	public void setSampleIdsOutSideTenement(final List<String> sampleIds);
	
	public String getPassedFileDirectory();
	public void setPassedFileDirectory(final String directoryName);
	
	public String getFailedFileDirectory();
	public void setFailedFileDirectory(final String directoryName);
	
	public String getEmailSubject();
	public void setEmailSubject(final String subject);
}
