package miracleletter.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import miracleletter.models.LetterTemplate;
import corejava.systeminterfaces.LetterTemplateDAOI;
import utils.OracleQueries;

public class LetterTemplateDAO implements LetterTemplateDAOI {
	public LetterTemplate getLetterTemplateByName(String name) throws SQLException {
		LetterTemplate letterTemplate = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.LETTERTEMPLATEBYNAME);
			stmt.setString(1, name);
			result = stmt.executeQuery();
			
			if (result.next()) {
				letterTemplate = new LetterTemplate(result.getInt(1), name,
						result.getString(3), result.getDouble(4));
				System.out.println("Envelope has been created.");
			}
			
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return letterTemplate;
	}


}
