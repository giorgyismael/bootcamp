package db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import db.exceptions.DbException;

public class DB {
	private static Connection conn;
	public static Connection getConnection() {
		try {
			Class.forName ("org.h2.Driver");
			Properties props = loadProperties();
			String dburl = props.getProperty("dburl");
			conn = DriverManager.getConnection (dburl, props);
			return conn;
		} catch (ClassNotFoundException e) {
			throw new DbException(e.getMessage());
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	private static Properties loadProperties() throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileReader("db.properties"));
		return props;
	}
	
	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	public static void closeStatement(Statement st) {
		try {
			st.close();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	public static void closeResultSet(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
}
