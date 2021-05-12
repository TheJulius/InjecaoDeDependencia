package injecaoDeDependencia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeituraJson extends Leitura {
	
	public Aluno LerDados() throws ParseException {
		
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();
		
		String nome;
		String matricula;
		String cpf;
		String dataNascimento;
		String email;
		Aluno a = new Aluno();

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("aluno.json"));

			nome = (String) jsonObject.get("nome");
			matricula = (String) jsonObject.get("matricula");
			cpf = (String) jsonObject.get("cpf");
			dataNascimento= (String) jsonObject.get("dataNascimento");
			email = (String) jsonObject.get("email");
			
			a.setNome(nome);
			a.setMatricula(matricula);
			a.setCpf(cpf);
			a.setDataNascimento(dataNascimento);
			a.setEmail(email);

		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return a;
	}

}
