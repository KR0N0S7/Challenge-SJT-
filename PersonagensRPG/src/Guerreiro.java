import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagens {

	private List<String> habilidades;
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
	
	public void lvUp() {
		
		this.setVida(getVida() + 12);
		this.setForca(getForca() + 7);
		this.setInteligencia(getInteligencia() + 2);
		this.setMana(getMana() + 1);
	}
	
	public int attack() {
		Random numAleatorio = new Random();
		int num = 180;
		int numRandom = (getForca()/2 * getLevel()) + numAleatorio.nextInt(num);
		return numRandom;
	}
	
	public void aprendeHabilidade(String habilidade) {
		getHabilidades().add(habilidade);
	}
}
