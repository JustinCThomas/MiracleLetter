package miracleletter.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import miracleletter.models.Envelope;
import corejava.systeminterfaces.EnvelopeDAOI;
import utils.OracleQueries;

public class EnvelopeDAO implements EnvelopeDAOI {

	public Envelope getEnvelopeById(int id) throws SQLException {
		Envelope envelope = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ENVELOPEBYID);
			stmt.setInt(1, id);
			result = stmt.executeQuery();
			
			if (result.next()) {
				envelope = new Envelope(id, result.getString(2), 
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
		return envelope;
	}

}
