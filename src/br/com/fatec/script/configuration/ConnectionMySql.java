package br.com.fatec.script.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySql {

	private static final String USUARIO = "root";
	private static final String SENHA = "admin";
	private static final String URL = "jdbc:mysql://localhost/testdb?serverTimezone=America/Sao_Paulo";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	public static Connection open() throws Exception {
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conn;
	}
}