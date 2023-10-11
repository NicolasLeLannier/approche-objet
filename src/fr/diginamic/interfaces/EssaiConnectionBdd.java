package fr.diginamic.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EssaiConnectionBdd {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = DriverManager.getConnection("jdbc.mysql/localhost...", "admin", "root");
	}

}
