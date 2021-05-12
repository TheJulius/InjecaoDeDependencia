package injecaoDeDependencia;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class PersistenciaJson extends Persistencia {
	
	@SuppressWarnings("unchecked")
	public void salvarDados(Aluno aluno) {
		
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("nome", aluno.getNome());
		jsonObject.put("matricula", aluno.getMatricula());
		jsonObject.put("cpf", aluno.getCpf());
		jsonObject.put("dataNascimento", aluno.getDataNascimento());
		jsonObject.put("email", aluno.getEmail());
		
		try{
			writeFile = new FileWriter("aluno.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
