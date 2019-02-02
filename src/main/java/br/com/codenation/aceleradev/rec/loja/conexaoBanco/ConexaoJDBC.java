package br.com.codenation.aceleradev.rec.loja.conexaoBanco;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class ConexaoJDBC {

	public static String status = "Não conectou...";

	public ConexaoJDBC() {

	}
	
	public static Connection getConexaoMySQL() {

		Connection connection = null;

		try {
			String driverName = "com.mysql.jdbc.Driver";

			Class.forName(driverName);

			String url = "jdbc:mysql://db4free.net:3306/adminproj";

			String username = "adminproj";

			String password = "FSFU06hq";

			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {

				status = ("STATUS--->Conectado com sucesso!");

			} else {

				status = ("STATUS--->Não foi possivel realizar conexão");

			}

			return connection;

		} catch (ClassNotFoundException e) {

			System.out.println("O driver expecificado nao foi encontrado.");

			return null;

		} catch (SQLException e) {
			
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");

			return null;

		}

	}
	
	public static String statusConection() {

		return status;

	}
	
	public static boolean fecharConexao() {

		try {

			ConexaoJDBC.getConexaoMySQL().close();

			return true;

		} catch (SQLException e) {

			return false;

		}

	}

	public static Connection reiniciarConexao() {

		fecharConexao();

		return ConexaoJDBC.getConexaoMySQL();

	}

}