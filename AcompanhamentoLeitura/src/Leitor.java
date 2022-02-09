import java.util.ArrayList;
import java.util.List;

public class Leitor {

	private String nome;
	private Livro livroFavorito;
	private List<Livro> estanteLivros;
	
	public Leitor(String nome, Livro livroFavorito) {
		this.nome = nome;
		this.livroFavorito = livroFavorito;
		List<Livro> estanteLivros = new ArrayList<>();
		estanteLivros.add(livroFavorito);
	}

	public String getNome() {		return nome;	}

	public void setNome(String nome) {		this.nome = nome;	}

	public Livro getLivroFavorito() {	return livroFavorito;	}

	public void setLivroFavorito(Livro livroFavorito) {		this.livroFavorito = livroFavorito;		}

	public List<Livro> getEstanteLivros() {		return estanteLivros;	}

	public void setEstanteLivros(List<Livro> estanteLivros) {	this.estanteLivros = estanteLivros;		}

	public void adicionarLivro(Livro livro) {
		getEstanteLivros().add(livro);
	}
	
	public void removerLivro(Livro livro) {
		this.estanteLivros.remove(livro);
		livro.zerarProgresso(livro);
	}

	@Override
	public String toString() {
		return "Leitor [nome=" + nome + ", livroFavorito=" + livroFavorito + ", estanteLivros=" + estanteLivros + "]";
	}
	
	
}
