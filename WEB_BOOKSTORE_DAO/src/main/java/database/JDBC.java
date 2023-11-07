package database;



import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class JDBC {
	public static Connection getCon() {	
		SQLServerDataSource ds = new SQLServerDataSource();
		ds.setUser("sa");
		ds.setPassword("123");
		ds.setDatabaseName("BookStore");
		ds.setServerName("Trun9\\SQLEXPRESS02");
		ds.setPortNumber(1433);
		try {
			Connection c = ds.getConnection();
			return c;
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printInfo(Connection c) {
		try {
			if(c!=null) {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
