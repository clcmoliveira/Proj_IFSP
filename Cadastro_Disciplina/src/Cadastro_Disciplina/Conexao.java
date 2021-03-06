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
	/*	Passo 1 - Separando as partes! 
	*	Objetivo: Aqui separei cada parte dos dados da minha conex�o mySQL a Java.
	*/
	
	private static Connection conn;
	private static final String driver = "com.mysql.jdbc.driver";
	private static final String server = "127.0.0.1";
	private static final String port = "3306";
	private static final String db = "proj_ifsp";
	private static final String url = "jdbc:mysql://"+ server +":"+ port +"/"+db;
	private static final String user = "root";
	private static final String pass = "IAULeW0MFdqcdcPF";
	
	/*	Passo 2 - Metodo (embora em branco) que possui o mesmo nome da classe. 
	*	Objetivo: Ele ser� util no Principal e em Funcoes
	*/
	private Conexao() {}
	
	/*	Passo 3 - Iniciando a conex�o pelo m�todo getConnection
	 */
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
	
	/*	Passo 4 - Fechando a minha conex�o com o m�todo CloseConnection
	 */
    public static boolean CloseConnection() {
        try {
            Conexao.getConnection().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
 
    /*	Passo 5 - Reiniciando a minha conex�o com o m�todo Restart
 	*/
    public static Connection Restart() {
        CloseConnection();
        return Conexao.getConnection();
    }
}
