//******************************************************
//Instituto Federal de S�o Paulo - Campus Sert�ozinho
//Disciplina......: M3LPBD
//Programa��o de Computadores e Dispositivos M�veis
//Aluno...........: CAMILA LEITE COURA MARIANO DE OLIVEIRA
//******************************************************

package Cadastro_Disciplina;
public class Disciplina {
	private int id_dis;
	private String disciplina;
	private int carga_horaria;
	private String curso;
	private int qt_vagas;
	private String periodo;

    Disciplina(String disciplina, int carga_horaria, String curso, int qt_vagas, String periodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
    //aqui quero fazer um construtor onde ou a placa ou a renavam são suficientes para remover um veículo
	
	public Disciplina(int id_dis) {
            //set disciplina para null
            this(null, null, null, null, null, 0);
	}
	
	public int getId_dis() {
		return id_dis;
	}
	public void setId_dis(int id_dis) {
		this.id_dis = id_dis;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public int getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int getQt_vagas() {
		return qt_vagas;
	}
	public void setQt_vagas(int qt_vagas) {
		this.qt_vagas = qt_vagas;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
        
        public void add(Disciplina dis) {
		// TODO Auto-generated method stub
		
	}
}
