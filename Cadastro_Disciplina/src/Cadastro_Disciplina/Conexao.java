package Cadastro_Disciplina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	/*	Passo 1 - Criar o bloco est�tico de inicializa��o	*/
	static {
		/*	Passo 2 - Realizar a conex�o com o BD	
		 * 	2.1 - Se for MySQL, usar a JDBC da mesma e comentar as refer�ncias ao Postgres	*/
		try {
			//Class.forName("org.postgresql.Driver");
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/proj_ifsp","root","123456");
		//Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/java_sgbd","root","123456");
		return conn;
	}
}
