package Cadastro_Disciplina;

public class Cadastro_Disciplina {
	private int id_dis;
	private String disciplina;
	private int carga_horaria;
	private String curso;
	private int qt_vagas;
	private String periodo;
	
	
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
}
