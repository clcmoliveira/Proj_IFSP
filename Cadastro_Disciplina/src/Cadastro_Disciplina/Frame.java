//******************************************************
//Instituto Federal de S�o Paulo - Campus Sert�ozinho
//Disciplina......: M3LPBD
//Programa��o de Computadores e Dispositivos M�veis
//Aluno...........: CAMILA LEITE COURA MARIANO DE OLIVEIRA
//******************************************************

package Cadastro_Disciplina;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

public class Frame implements ActionListener {
    /* Passo 1 - Definir os padr�es
     * OBJETIVO - Definir as vari�veis globais, aquelas que ser�o 
     * utilizadas em todos os frames
     */
    private String title = "Cadastro de Disciplinas";
    private Dimension dim;
    private JFrame frame = new JFrame(title);
    private JPanel panel = new JPanel();
    private JScrollPane scrollPane = new JScrollPane(panel,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    private JLabel ldis, lcar, lcur, lnum, lper, lshow;
    private JTextField tfdis, tfcar, tfcur, tfnum, tfper;
    private JButton save_dis, show_cad, show_list;
	
    /* Passo 2 - Mostrar o Menu Principal
     * OBJETIVO: Exibi-la ap�s a conex�o com o Banco
     */
    void principal() {
        lshow = new JLabel("<html>"
                + "<h3>Bem Vindo!</h3>"
                + "<br>Selecione a op��o de sua prefer�ncia:"
                + "</html>");
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
    
    /*
    *   Passo 3 - Exibir o cadastro de Disciplinas
    *   Objetivo: Ap�s selecionar o bot�o de 
    *   Cadastro de Disciplinas, exibir esta tela
    */

    void formDisciplina(){
        ldis = new JLabel("Nome da Disciplina: ");
        lcar = new JLabel("Carga Hor�ria");
        lcur = new JLabel("Curso que ela pertence:");
        lnum = new JLabel("N�mero de vagas:");
        lper = new JLabel("Per�odo:");
        tfdis = new JTextField(20);
        tfcar = new JTextField(20);
        tfcur = new JTextField(20);
        tfnum = new JTextField(20);
        tfper = new JTextField(20);
		
	save_dis = new JButton("Salvar");
	save_dis.addActionListener(this);
		
	panel.add(ldis);
	panel.add(tfdis);
	panel.add(lcar);
	panel.add(tfcar);
	panel.add(lcur);
	panel.add(tfcur);
	panel.add(lnum);
	panel.add(tfnum);
	panel.add(lper);
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
        List<Disciplina> lista = new Funcoes().listar();
    	panel.add((Component) lista);
        panel.add(ldis);
        panel.add(lcar);
        panel.add(lcur);
        panel.add(lnum);
        panel.add(lper);
        dim = new Dimension(300,300);
        panel.setPreferredSize(dim);
		
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
    @Override
    public void actionPerformed(ActionEvent e) {
		
    } 
}