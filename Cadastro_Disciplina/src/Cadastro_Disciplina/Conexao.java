//******************************************************
//Instituto Federal de S�o Paulo - Campus Sert�ozinho
//Disciplina......: M3LPBD
//Programa��o de Computadores e Dispositivos M�veis
//Aluno...........: CAMILA LEITE COURA MARIANO DE OLIVEIRA
//******************************************************

package Cadastro_Disciplina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {
	//como diria Json = vamos por partes! Aqui separei cada parte dos dados da minha conexão mySQL a Java.
	
	private static Connection conn;
	private static final String driver = "com.mysql.jdbc.driver";
	private static final String server = "127.0.0.1";
	private static final String port = "3306";
	private static final String db = "proj_ifsp";
	private static final String url = "jdbc:mysql://"+ server +":"+ port +"/"+db;
	private static final String user = "root";
	private static final String pass = "IAULeW0MFdqcdcPF";
	
	//metodo (embora em branco) que possui o mesmo nome da classe. Ele será util no Main e no DAO
	private Conexao() {}
	
	//iniciando a conexão pelo método getConnection
	public static synchronized Connection getConnection() {
		if (conn == null) {
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, pass);
			} catch (ClassNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Erro ao carregar o driver de conexão\n" + e);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Não foi possível estabalecer conexão com o banco de dados\n" + e);
			}
		}
		JOptionPane.showMessageDialog(null, "Bem Vindos!");
		return conn;
	}
	
	//fechando a minha conexão com o método CloseConnection
	 
    public static boolean CloseConnection() {
        try {
            Conexao.getConnection().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
 
    //reiniciando a minha conexão com o método Restart
 
    public static Connection Restart() {
        CloseConnection();
        return Conexao.getConnection();
    }
}
