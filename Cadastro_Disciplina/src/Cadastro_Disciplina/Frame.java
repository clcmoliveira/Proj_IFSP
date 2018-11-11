//******************************************************

//Instituto Federal de São Paulo - Campus Sertãozinho

//Disciplina......: M3LPBD

//Programação de Computadores e Dispositivos Móveis

//Aluno...........: CAMILA LEITE COURA MARIANO DE OLIVEIRA

//******************************************************

package Cadastro_Disciplina;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Frame implements ActionListener {
	/* Passo 1 - Definir os padrões
	 * OBJETIVO - Definir as variáveis globais, aquelas que serão 
	 * utilizadas em todos os frames
	 */
	private String title = "Cadastro de Disciplinas";
	private Dimension dim;
	private JFrame frame = new JFrame(title);
	private JPanel panel = new JPanel();
	private JScrollPane scrollPane = new JScrollPane(panel,
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
	        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	private JLabel ldis, lcar, lcur, l_qt, lper, lshow;
	private JTextField tfdis, tfcar, tfcur, tf_qt, tfper;
	private JButton save_dis, show_cad, show_list;
	
	/* Passo 2 - Mostrar o Menu Principal
	 * OBJETIVO: Exibi-la após a conexão com o Banco
	 * */
	void principal() {
		lshow = new JLabel("<html><h3>Bem Vindo!</h3><br>Selecione a opção de sua preferência:</html>");
		show_cad = new JButton ("Cadastrar Disciplina");
		show_list = new JButton ("Visualizar Disciplinas");
		
		panel.add(lshow);
		panel.add(show_cad);
		panel.add(show_list);
		dim = new Dimension(300,200); 
		panel.setPreferredSize(dim);
		
		frame.add(scrollPane);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void formDisciplina(){
		JLabel lfull = new JLabel ("<html>"
				+ "<br>Nome da disciplina:"
				+ "<br>Carga horaria:"
				+ "<br>Curso que ela pertence:"
				+ "<br>Número de vagas:"
				+ "<br>Período:"
				+ "</html>");
		//ldis = new JLabel ("");
		tfdis = new JTextField(20);
		//lcar = new JLabel ("<html></html>"); 
		tfcar = new JTextField(20);
		//lcur = new JLabel ("<html></html>"); 
		tfcur = new JTextField(20);
		//l_qt = new JLabel ("<html><br></html>");
		tf_qt = new JTextField(20);
		//lper = new JLabel ("<html></html>");
		tfper = new JTextField(20);
		
		save_dis = new JButton("Salvar");
		save_dis.addActionListener(this);
		
		panel.add(lfull);
		panel.add(tfdis);
		//panel.add(lcar);
		panel.add(tfcar);
		//panel.add(lcur);
		panel.add(tfcur);
		//panel.add(l_qt);
		panel.add(tf_qt);
		//panel.add(lper);
		panel.add(tfper);
		panel.add(save_dis);
		dim = new Dimension(300,300);
		panel.setPreferredSize(dim);
		
		frame.add(scrollPane);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	void listDisciplina() {
		int i, j;
		
		for(i = 0; i < 10; i++) {
			panel.add(ldis);
			panel.add(lcar);
			panel.add(lcur);
			panel.add(l_qt);
			panel.add(lper);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	} 
}	
