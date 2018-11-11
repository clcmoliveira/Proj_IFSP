//******************************************************

//Instituto Federal de São Paulo - Campus Sertãozinho

//Disciplina......: M3LPBD

//Programação de Computadores e Dispositivos Móveis

//Aluno...........: CAMILA LEITE COURA MARIANO DE OLIVEIRA

//******************************************************

package Cadastro_Disciplina;

import java.sql.*;

public class Principal {

	public static void main(String[] args) throws SQLException {
		/*	Passo 1 - Testar Conexão
		 * OBJETIVO: Saber se o banco de dados está 
		 * conectado para avançar para o Passo 2 ou não	
		 * */
		
		/*Connection conn = Conexao.getConnection();
		if (conn != null) {
			System.out.println("Conectou!");
		} else {
			System.out.println("Não Conectou!");
		}*/
		
		/*	Passo 2 - Após Passo 1, exibir o painel inicial
		 * Objetivo: Exibir um menu aonde o usuário acesse ou o 
		 * Cadastro ou a Lista de Disciplinas Cadastradas	
		 * */
		new Frame().formDisciplina();
		
		new Frame().principal();
	}

}
