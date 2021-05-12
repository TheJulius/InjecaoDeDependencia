package injecaoDeDependencia;

import javax.xml.parsers.ParserConfigurationException;

public class Main {

	public static void main(String[] args) throws ParserConfigurationException, Exception {
		
		Persistencia persCsv = new PersistenciaCsv();
		Persistencia persJson = new PersistenciaJson();
		Persistencia persXml = new PersistenciaXml();
		
		Leitura lerCsv = new LeituraCsv();
		Leitura lerJson = new LeituraJson();
		Leitura lerXml = new LeituraXml();
		
		Aluno a = new Aluno(persCsv, lerCsv, "Julio Cesar", "1", "12345678910", "15/02/1997", "juliocswin@gmail.com");
		a.salvarDados(a);
		
		Aluno a1 = a.lerDados();
		System.out.println(a1);
		
		Aluno b = new Aluno(persJson, lerJson,"Julia Cesar", "2", "12345678911", "16/02/1997", "juliacswin@gmail.com");
		b.salvarDados(b);
		
		Aluno b1 = b.lerDados();
		System.out.println(b1);

		Aluno c = new Aluno(persXml, lerXml, "Juliano Cesar", "3", "12345678912", "17/02/1997", "julianocswin@gmail.com");
		c.salvarDados(c);
		
		Aluno c1 = c.lerDados();
		System.out.println(c1);
		
	}

}
