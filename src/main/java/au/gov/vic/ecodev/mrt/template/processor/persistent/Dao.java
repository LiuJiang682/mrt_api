package au.gov.vic.ecodev.mrt.template.processor.persistent;

import org.springframework.jdbc.core.JdbcTemplate;

import au.gov.vic.ecodev.mrt.template.processor.model.Entity;

public interface Dao {

	boolean updateOrSave(Entity entity);
	Entity get(long id);
	void setJdbcTemplate(final JdbcTemplate jdbcTemplate);
}
