package miracleletter.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import miracleletter.dao.OracleConnection;

public class OracleConnection {
	public static Connection getConnection() throws ClassNotFoundException,
	IOException, SQLException {
	final Properties prop = new Properties();
	final InputStream inputStream = OracleConnection.class.getClassLoader()
			.getResourceAsStream(
					"miracleletter/resources/db.properties");
	prop.load(inputStream);
	Class.forName(prop.getProperty("driver"));
	final Connection connection = DriverManager.getConnection(prop.getProperty("url"), 
			prop.getProperty("user"), prop.getProperty("password"));
//	Class.forName("oracle.jdbc.driver.OracleDriver");
//	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", 
//			"justin", "password");
	return connection;
	}
}
