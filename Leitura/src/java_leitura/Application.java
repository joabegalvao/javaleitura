package java_leitura;

public class Application {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[2];
		
		p[0] = new Pessoa("Joabe", 25, "Masculino");
		p[1] = new Pessoa("Karol", 20, "Feminino");
		
		l[0] = new Livro("Java 1", "Autor 1", 100, p[0]);
		l[1] = new Livro("Java 2", "Autor 2", 200, p[1]);
		
		l[0].abrir();
		l[0].folhear();
		l[0].avancarPag();
		l[0].avancarPag();
		l[0].avancarPag();
		l[0].voltarPag();
		
		
		l[0].detalhes();
		

	}

}
