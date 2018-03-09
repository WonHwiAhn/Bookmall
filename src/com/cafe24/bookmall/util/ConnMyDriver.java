package com.cafe24.bookmall.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnMyDriver{
	 private static ConnMyDriver instance;
	    private Connection connection;
	    private String url = "jdbc:mysql://localhost/bookmall";
	    private String username = "bookmall";
	    private String password = "bookmall";

	    private ConnMyDriver() throws SQLException {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            this.connection = DriverManager.getConnection(url, username, password);
	        } catch (ClassNotFoundException ex) {
	            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
	        }
	    }

	    public Connection getConnection() {
	        return connection;
	    }

	    public static ConnMyDriver getInstance() throws SQLException {
	        if (instance == null) {
	            instance = new ConnMyDriver();
	        } else if (instance.getConnection().isClosed()) {
	            instance = new ConnMyDriver();
	        }

	        return instance;
	    }
}
