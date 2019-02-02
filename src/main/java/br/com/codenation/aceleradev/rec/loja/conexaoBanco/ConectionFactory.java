package br.com.codenation.aceleradev.rec.loja.conexaoBanco;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class ConectionFactory {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://db4free.net:3306/adminproj";
	private static final String USERNAME = "adminproj";
	private static final String PASSWORD = "FSFU06hq";

	public static String status = "Não conectou...";

	public ConectionFactory() {

	}
	
	public static Connection getConexaoMySQL() {

		Connection connection = null;

		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			return connection;
		}

	}

	public static boolean fecharConexao() {

		try {

			ConectionFactory.getConexaoMySQL().close();

			return true;

		} catch (SQLException e) {

			return false;

		}

	}

	public static Connection reiniciarConexao() {

		fecharConexao();

		return ConectionFactory.getConexaoMySQL();

	}

}