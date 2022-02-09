
public class Main {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Java Code", 370, 0);
		Livro livro2 = new Livro("Learning Python", 570, 0);
		Livro livro3 = new Livro("JavaScript Now", 250, 0);
		Livro livro4 = new Livro("Lovelace History", 520, 0);
		Livro livro5 = new Livro("PhP 4fun", 170, 0);
		
		Leitor leitor1 = new Leitor("Rogério", livro1);
		Leitor leitor2 = new Leitor("Newmann", livro2);
		Leitor leitor3 = new Leitor("Ada", livro5);
		
		leitor1.adicionarLivro(livro2);
		leitor1.toString();

	}

}
