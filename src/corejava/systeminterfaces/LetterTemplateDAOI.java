package corejava.systeminterfaces;

import java.sql.SQLException;

import miracleletter.models.LetterTemplate;

public interface LetterTemplateDAOI {
	public LetterTemplate getLetterTemplateByName(String name) throws SQLException;
}
