package br.com.cap.heartrates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionfactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/bd_projeto?useTimezone=true&serverTimezone=UTC", 
					"root", 
					""); 			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
