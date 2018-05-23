package CoreJava.systemInterfaces;

import java.sql.SQLException;

import MiracleLetter.Models.LetterTemplate;

public interface LetterTemplateDAOI {
	public LetterTemplate getLetterTemplateByName(String name) throws SQLException;
}
