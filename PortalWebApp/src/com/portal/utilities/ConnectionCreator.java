package com.portal.utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCreator {
	public static Connection getDBConnection() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Hr","hr");
		return conn;
	}
}
