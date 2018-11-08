package Cadastro_Disciplina;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Frame implements ActionListener {
	private JLabel ldis, lcar, lcur, l_qt, lper;
	private JTextField tfdis, tfcar, tfcur, tf_qt, tfper;
	private JButton button;
	private JPanel panel;
	private JFrame frame;
	private JScrollPane scrollPane;
	
	void formDisciplina(){
		ldis = new JLabel ("\nNome da disciplina:");
		tfdis = new JTextField(20);
		lcar = new JLabel ("\nCarga horaria:"); 
		tfcar = new JTextField(20);
		lcur = new JLabel ("\nCurso que ela pertence:"); 
		tfcur = new JTextField(20);
		l_qt = new JLabel ("\nN�mero de vagas:");
		tf_qt = new JTextField(20);
		lper = new JLabel ("\nPer�odo:");
		tfper = new JTextField(20);
		
		button = new JButton("Salvar");
		button.addActionListener(this);
		
		panel = new JPanel();
		panel.add(ldis);
		panel.add(tfdis);
		panel.add(lcar);
		panel.add(tfcar);
		panel.add(lcur);
		panel.add(tfcur);
		panel.add(l_qt);
		panel.add(tf_qt);
		panel.add(lper);
		panel.add(tfper);
		panel.add(button);
		
		
		frame = new JFrame("Cadastro de Dsiciplinas");
		panel.setPreferredSize(new Dimension(400, 200));
		scrollPane = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.add(scrollPane);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String txtdis = tfdis.getText();
		String txtcar = tfcar.getText();
		String txtcur = tfcur.getText();
		String txt_qt = tf_qt.getText();
		String txtper = tfper.getText();
		
		//Juntar tudo em um texto s� para ser exibido na frame
		String txt = txtdis + txtcar + txtcur + txt_qt + txtper;
		JOptionPane.showMessageDialog(frame, txt);
	}
}
