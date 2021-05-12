package injecaoDeDependencia;

import java.util.Date;

public class Aluno extends Pessoa {
	
	private int matricula;
	private int cpf;
	private Date dataNascimento;
	private String email;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		if(cpf != 0)
			this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		if(dataNascimento != null)
			this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.length() != 0)
			this.email = email;
	}
	public Aluno(int matricula, int cpf, Date dataNascimento, String email) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
}
