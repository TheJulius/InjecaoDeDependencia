package injecaoDeDependencia;

import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.parser.ParseException;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String cpf;
	private String dataNascimento;
	private String email;
	protected Persistencia persistencia;
	protected Leitura leitura;
	
	public Aluno() {
		
	}
	
	public Aluno(
			Persistencia persistencia,
			Leitura leitura,
			String nome, 
			String matricula, 
			String cpf, 
			String dataNascimento, 
			String email) 
	{
		super.setNome(nome);
		this.persistencia = persistencia;
		this.leitura = leitura;
		this.matricula = matricula;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		if(matricula.length() != 0)
			this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length() != 0)
			this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
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
	
	public void salvarDados(Aluno aluno) throws ParserConfigurationException, Exception {
		this.persistencia.salvarDados(aluno);
	}
	
	public Aluno lerDados() throws ParseException {
		return this.leitura.LerDados();
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
